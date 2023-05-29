package com.spring.myweb.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.spring.myweb.command.KakaoUserVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KakaoService {

	@Value("${kakao.clientId}")
	private String kakaoClientId;
	@Value("${kakao.clientSecret}")
	private String kakaoClientSecret;
	@Value("${kakao.redirectUri}")
	private String redirectUri;

	private String sessionState = "kakao_oauth_state";


	//카카오 아이디로 로그인 인증 url 생성
	public String getAuthorizationUrl(HttpSession session) {

		/* 세션 유효성 검증을 위하여 난수를 생성 */
		String state = UUID.randomUUID().toString();
		/* 생성된 난수값을 session에 저장 */
		session.setAttribute(sessionState, state);

		String requestUrl = String.format("https://kauth.kakao.com/oauth/authorize?client_id=%s&redirect_uri=%s&response_type=code&state=%s", kakaoClientId, redirectUri, state);

		return requestUrl;
	}

	/* 카카오 아이디로 CallBack 처리 및 AccessToken 획득 method */
	public String getAccessToken(HttpSession session, String code, String state) {

		log.info("getAccessToken 호출!");

		//요청 uri
		String requestUri = "https://kauth.kakao.com/oauth/token";

		/* CallBack으로 전달받은 세션 검증용 난수값과 세션에 저장되어있는 값이 일치하는지 확인 */
		String sessionValue = (String) session.getAttribute(sessionState);

		if(sessionValue.equals(state)) { //로그인 할 때 만든 state와 성공 후 응답된 state가 일치한다면?

			//요청 헤더 설정
			HttpHeaders headers = new HttpHeaders();
			//카카오 서버쪽에서 설정해 달라고 한 content-type 설정하기.
			headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

			//요청 파라미터 설정
			MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
			params.add("grant_type", "authorization_code");
			params.add("client_id", kakaoClientId);
			params.add("redirect_uri", redirectUri);
			params.add("code", code);
			params.add("client_secret", kakaoClientSecret);

			//카카오 서버로 rest 방식의 post 통신을 보내 줄 객체 생성.
			RestTemplate template = new RestTemplate();

			HttpEntity<Object> requestEntity = new HttpEntity<Object>(params, headers);

			//통신을 보내면서 응답데이터를 바로 리턴.
			//param1: 요청 url
			//param2: 요청 방식(method)
			//param3: 헤더와 요청파라미터 정보 엔티티 객체
			//param4: 응답 데이터를 받을 객체의 타입 (ex: vo, String, map...)
			ResponseEntity<Map> responseEntity 
			= template.exchange(requestUri, HttpMethod.POST, requestEntity, Map.class);

			//응답데이터에서 필요한 정보를 가져오자.
			Map<String, Object> responseData = (Map<String, Object>) responseEntity.getBody();
			log.info("토큰 요청 응답 데이터: {}", responseData);

			return (String) responseData.get("access_token");

		} else {
			log.info("state 일치하지 않음!");
			return null;
		}


	}

	/* Access Token을 이용하여 카카오 사용자 프로필 API 요청 */
	public KakaoUserVO getUserProfile(String accessToken) {


		String requestUri = "https://kapi.kakao.com/v2/user/me";

		//요청 헤더 설정
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + accessToken);


		//요청 보내기
		RestTemplate template = new RestTemplate();
		ResponseEntity<KakaoUserVO> responseEntity = template.exchange(
				requestUri,
				HttpMethod.GET,
				new HttpEntity<>(headers),
				KakaoUserVO.class
				);

		//응답 바디 읽기.
		KakaoUserVO responseData = responseEntity.getBody();
		log.info("user profile: {}", responseData);


		/*

		// REST API의 URL 설정
		URL url = new URL("https://kapi.kakao.com/v2/user/me");

		// 요청을 보내고 응답을 받는 객체를 선언.
		HttpURLConnection connection 
			= (HttpURLConnection) url.openConnection();

		//전송 방식 설정
		connection.setRequestMethod("GET");

		//헤더 설정
		connection.setRequestProperty("Authorization", "Bearer " + accessToken);

		//요청 후 응답 코드 확인
		int responseCode = connection.getResponseCode();
		log.info("code: " + responseCode);

		//응답과 함께 전달된 데이터를 BufferedReader를 이용해서 읽어내기.
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		String line;

		//JSON 데이터를 문자열로 읽어서 한 줄씩 추가
		StringBuilder sb = new StringBuilder();
		while((line = reader.readLine()) != null) {
			sb.append(line);
		}

		reader.close();

		log.info("response data: " + sb.toString());

		//문자열로 이루어진 JSON 데이터를 변환해서 JSONObject 타입으로 저장.
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(sb.toString());

		//필요한 데이터를 얻어내기
		JSONObject kakaoAccount = (JSONObject) jsonObject.get("kakao_account");
		JSONObject profile = (JSONObject) kakaoAccount.get("profile");
		String nickname = (String) profile.get("nickname");
		String email = (String) kakaoAccount.get("email");
		String profileImage = (String) profile.get("profile_img_url");
		String thumbnailImage = (String) profile.get("thumbnail_img_url");

		 */

		return responseData;

	}




}





















