package com.spring.myweb.freeboard.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.spring.myweb.FreeBoardController;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/config/servlet-config.xml",
									"file:src/main/webapp/WEB-INF/config/db-config.xml"})
@WebAppConfiguration
public class FreeBoardControllerTest {
	
	/*
	 - 테스트 환경에서 가상의 DispatcherServlet을 사용하기 위한 객체 자동 주입 
	 - WebApplicationContext는 Spring에서 제공되는 servlet들을 사용할 수 있도록
	 정보를 저장하는 객체입니다.
	 */
	
	@Autowired
	private WebApplicationContext ctx;
	
	//@Autowired
	//private FreeBoardController controller;
	
	
	//MockMvc는 웹 어플리케이션을 서버에 배포하지 않아도 스프링 MVC 동작을
	//구현할 수 있는 가상의 구조를 만들어 줍니다.
	private MockMvc mockMvc;
	
	@BeforeEach //테스트 시작 시 다른 메서드 실행 전에 항상 먼저 구동되는 기능들을 선언
	public void setup() {
		//가상 구조를 세팅
		//스프링 컨테이너에 등록된 모든 빈과 의존성 주입까지 로드해서 사용이 가능.
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
		
		//테스트할 컨트롤러를 수동으로 주입. 하나의 컨트롤러 자체만 테스트를 진행할 때 이렇게 씁니다.
		//this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	
	@Test
	@DisplayName("/freeboard/freeList 요청 처리 과정 테스트")
	void testList() throws Exception {
		ModelAndView mv =
				mockMvc.perform(MockMvcRequestBuilders.get("/freeboard/freeList"))
				.andReturn()
				.getModelAndView();
		
		System.out.println("Model 내에 저장한 데이터: " + mv.getModelMap());
		System.out.println("응답 처리를 위해 사용할 페이지: " + mv.getViewName());
	}
	
	@Test
	@DisplayName("게시글 등록 요청 처리 과정 테스트")
	void testInsert() throws Exception {
		String viewPage = mockMvc.perform(MockMvcRequestBuilders.post("/freeboard/freeRegist")
				.param("title", "테스트 새 글 제목")
				.param("content", "테스트 새 글 내용")
				.param("writer", "user01"))
				.andReturn().getModelAndView().getViewName();
		System.out.println("viewName: " + viewPage);
	}
	
	@Test
	@DisplayName("3번 글 상세 보기 요청을 넣으면 "
			+ "컨트롤러는 DB에서 가지고 온 글 객체를 model에 담아서 jsp로 이동시킬 것이다.")
	// /freeboard/content -> get
	void testContent() throws Exception {
		ModelAndView mv = mockMvc.perform(
					MockMvcRequestBuilders.get("/freeboard/content")
					.param("bno", "3")
				).andReturn().getModelAndView();
		System.out.println("Model: " + mv.getModelMap());
		assertEquals("freeboard/freeDetail", mv.getViewName());
	}
	
	@Test
	@DisplayName("3번글의 제목과 내용을 수정하는 요청을 post방식으로 전송하면 수정이 진행되고, "
			+ "수정된 글의 상세보기 페이지로 이동할 것이다.")
	// /freeboard/modify -> post
	void testModify() throws Exception {
		String bno = "3";
		
		String viewPage = mockMvc.perform(
					MockMvcRequestBuilders.post("/freeboard/modify")
					.param("title", "수정된 테스트 글 제목")
					.param("content", "수정된 테스트 글 내용")
					.param("bno", bno)
				).andReturn().getModelAndView().getViewName();
		assertEquals("redirect:/freeboard/content?bno=" + bno, viewPage);
	}
	
	@Test
	@DisplayName("3번 글을 삭제하면 목록 재요청이 발생할 것이다.")
	// /freeboard/delete -> post
	void testDelete() throws Exception {
		assertEquals("redirect:/freeboard/freeList", 
					mockMvc.perform(MockMvcRequestBuilders.post("/freeboard/delete")
							.param("bno", "3"))
					.andReturn().getModelAndView().getViewName()
				);
	}

}




















