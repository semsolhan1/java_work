package com.myweb.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.service.ContentService;
import com.myweb.board.service.DeleteService;
import com.myweb.board.service.GetListService;
import com.myweb.board.service.IBoardService;
import com.myweb.board.service.RegistService;
import com.myweb.board.service.UpdateService;


@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	private IBoardService sv;
	private RequestDispatcher dp;
	
    public BoardController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getMethod().equals("POST")) {
			request.setCharacterEncoding("utf-8");
		}
		
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length()+1, uri.lastIndexOf("."));
		
		System.out.println(uri);
		
		switch(uri) {
		
		case "write":
			System.out.println("글쓰기 페이지로 이동 요청!");
			response.sendRedirect("board/board_write.jsp");
			break;
			
		case "regist":
			System.out.println("글 등록 요청이 들어옴!");
			sv = new RegistService();
			sv.execute(request, response);
			
			/*
			 왜 board_list.jsp로 바로 리다이렉트를 하면 안될까?
			 board_list.jsp에는 데이터베이스로부터 전체 글 목록을 가져오는
			 로직을 작성하지 않을 것이기 때문입니다. (jap는 단순히 보여지는 역할만 수행)
			 컨트롤러로 글 목록 요청이 다시 들어올 수 있게끔
			 sendRedirect()를 사용하여 자동 목록 재 요청이 들어오게 하는 겁니다.
			 */
			response.sendRedirect("/MyWeb/list.board");
			
			break;
		
		case "list":
			System.out.println("글 목록 요청이 들어옴!");
			sv = new GetListService();
			sv.execute(request, response);
			
			/*
			 여기서 sendRedirect를 하면 안되는 이유
			 request객체에 list를 담아서 전달하려 하는데, sendRedirect를 사용하면
			 응답이 바로 나가면서 request객체가 소멸해 버립니다.
			 여기서는 forward방식을 사용해서 request를 원하는 jsp 파일로 전달해서
			 그쪽에서 응답이 나갈 수 있도록 처리해야 합니다.
			*/
//			response.sendRedirect("board/board_list.jsp");
			
			//request 객체를 다음 화면까지 운반하기 위한 forward 기능을 제공하는 객체.
			//-> RequestDispatcher
			dp = request.getRequestDispatcher("board/board_list.jsp");
			dp.forward(request, response);
			break;
			
		case "content":
			System.out.println("글 상세보기 요청이 들어옴!");
			sv = new ContentService();
			sv.execute(request, response);
			
			dp = request.getRequestDispatcher("board/board_content.jsp");
			dp.forward(request, response);
			break;
			
		case "modify":
			System.out.println("글 수정 페이지로 이동 요청!");
			sv = new ModifyService();
			sv.execute(request, response);
			
			dp = request.getRequestDispatcher("board/board_modify.jsp");
			dp.forward(request, response);
			break;
		
		case "update":
			System.out.println("글 수정 요청이 들어옴!");
			sv = new UpdateService();
			sv.execute(request, response);
			
			response.sendRedirect("/MyWeb/content.board?bId=" + request.getParameter("bId"));
			break;
			
		case "delete":
			System.out.println("글 삭제 요청이 들어옴!");
			sv = new DeleteService();
			sv.execute(request, response);
			
			response.sendRedirect("/MyWeb/list.board");
			break;
		}
	
	}

}
















