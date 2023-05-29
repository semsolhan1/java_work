package com.spring.myweb.command;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class KakaoUserVO {

	/*
	 @JsonProperty
	 Rest API 통신을 진행하다 보면 데이터를 주고 받을 때 JSON 형태의 데이터를 주로 이용합니다.
	 json은 스네이크 케이스 방식을 사용하고, 서버단에서는 카멜 케이스 방식을 사용합니다.
	 서로 표현 방식이 다름에 따라 데이터의 key가 달라지는 경우가 발생합니다.
	 이 때 @JsonProperty를 사용하면 값을 매칭할 수 있습니다. 
	 */
	
	
	@JsonProperty("id")
	private long id;
	
	@JsonProperty("connected_at")
	private LocalDateTime connectedAt;
	
	@JsonProperty("kakao_account")
	private KakaoAccount kakaoAccount;
	
	@Getter @Setter @ToString
	static class KakaoAccount {
		
		private String email;
		private Profile profile;
		
		@Getter @Setter @ToString
		static class Profile {
			
			private String nickname;
			
			@JsonProperty("profile_image_url")
			private String profileImageUrl;
			
			@JsonProperty("thumbnail_image_url")
			private String thumbnailImageUrl;
			
		}
		
	}
	
	
}



















