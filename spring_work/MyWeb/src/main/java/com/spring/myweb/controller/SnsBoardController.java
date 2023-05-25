package com.spring.myweb.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.spring.myweb.command.SnsBoardVO;
import com.spring.myweb.snsboard.service.ISnsBoardService;
import com.spring.myweb.util.PageVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/snsboard")
@Slf4j
public class SnsBoardController {
	
	@Autowired
	private ISnsBoardService service;
	
	@GetMapping("/snsList")
	public ModelAndView snsList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("snsboard/snsList");
		return mv;
	}
	
	@PostMapping("/upload")
	public String upload(MultipartFile file, SnsBoardVO vo) {
		service.insert(vo, file);
		
		return "success";
	}
	
	//글 목록 불러오기
	@GetMapping("/{page}")
	public List<SnsBoardVO> getList(@PathVariable int page) {
		log.info("/snsboard/getList: GET");
		PageVO vo = new PageVO();
		vo.setPageNum(page);
		vo.setCpp(3);
		
		return service.getList(vo);
	}
	
	/*
	# 게시글의 이미지 파일 전송 요청
	이 요청은 img 태그의 src 속성을 통해서 요청이 들어오고 있습니다.
	snsList.jsp 페이지가 로딩되면서, 글 목록을 가져오고 있고, JS를 이용해서 화면을 꾸밀 때
	img 태그의 src에 작성된 요청 url을 통해 자동으로 요청이 들어오게 됩니다.
	요청을 받아주는 메서드를 선언하여 경로에 지정된 파일을 보낼 예정입니다.
	*/
	@GetMapping("/display/{fileLoca}/{fileName}")
	public ResponseEntity<byte[]> getFile(@PathVariable String fileLoca, 
						@PathVariable String fileName) {
		
		log.info("filename: " + fileName);
		log.info("fileLoca: " + fileLoca);
		
		File file = new File("C:/test/upload/" + fileLoca + "/" + fileName);
		log.info(file.toString());
		
		//응답에 대한 여러가지 정보를 전달할 수 있는 객체 ResponseEntity
		//응답 내용, 응답이 성공했는지에 대한 여부, 응답에 관련된 여러 설정들을 지원합니다.
		ResponseEntity<byte[]> result = null;
		
		HttpHeaders headers = new HttpHeaders();	
		try {
			//probeContentType: 매개값으로 전달받은 파일의 타입이 무엇인지를 문자열로 반환.
			//사용자에게 보여주고자 하는 데이터가 어떤 파일인지에 따라 응답 상태 코드를 다르게 리턴하고
			//컨텐트 타입을 제공해서 화면단에서 판단할 수 있게 처리할 수 있다.
			headers.add("Content-Type", Files.probeContentType(file.toPath()));
			headers.add("merong", "hello");
			
			//ResponseEntity 객체에 전달하고자 하는 파일을 byte[]로 변환해서 전달.
			//header 내용도 같이 포함, 응답 상태 코드를 원하는 형태로 전달이 가능.
			result = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(file), headers, HttpStatus.OK);
			
		} catch (IOException e) {
			e.printStackTrace();
			result = new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return result;
	}

}


























