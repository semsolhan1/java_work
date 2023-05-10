package kr.co.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet을 지정하면 따로 서블릿을 등록하고 url mapping하는 과정을 대신할 수 있습니다.
//1. 디렉토리 패턴: 디렉토리 형태로 서버의 해당 컴포넌트를 찾아서 실행하는 구조
// -> 정해진 url로만 서블릿에 요청을 보낼 수가 있습니다.
//2. 확장자 패턴: 확장자 형태로 서버의 해당 컴포넌트를 찾아서 실행하는 구조
// *.board -> 앞에 어떠한 경로가 존재하던지 .board 요청으로만 끝나면 해당 서블릿이 반응하겠다.
@WebServlet("*.board")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FrontController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/board 요청이 들어옴!");
		System.out.println("service() 메서드가 호출됨!");
		
		System.out.println("요청 URI: " + request.getRequestURI());
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath(); // -> /JspBasic
		
		// /JspBasic/write.board
		uri = uri.substring(conPath.length() + 1, uri.lastIndexOf("."));
		System.out.println("정제된 uri: " + uri);
		
		if(uri.equals("write")) {
			System.out.println("글 등록 요청이 들어옴!");
			
		} else if(uri.equals("list")) {
			System.out.println("글 목록 요청이 들어옴!");
			
		}
		
	}

}













