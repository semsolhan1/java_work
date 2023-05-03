package com.myweb.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.user.model.UserDAO;
import com.myweb.user.model.UserVO;
import com.myweb.user.service.IUserService;
import com.myweb.user.service.JoinService;


@WebServlet("*.user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//서비스 인터페이스 타입의 변수를 선언해서
	//요청이 무엇이냐에 따라 하나의 변수로 여러 종류의 객체를 대입.
	private IUserService sv;
   
    public UserController() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length() + 1, uri.lastIndexOf("."));
		
		System.out.println("정제된 uri: " + uri);
		
		switch (uri) {
		case "joinPage" :
			System.out.println("회원 가입 페이지로 이동 요청!");
			response.sendRedirect("/MyWeb/user/user_join.jsp");
			break;
			
		case "join":
			System.out.println("회원 가입 요청이 들어옴!");
			sv = new JoinService();
			sv.execute(request, response);
			break;
			
		case "loginPage":
			System.out.println("로그인 체이지로 이동 요청!");
			response.sendRedirect(uri);
			
			
		
		
			
		}
		
	}

}
