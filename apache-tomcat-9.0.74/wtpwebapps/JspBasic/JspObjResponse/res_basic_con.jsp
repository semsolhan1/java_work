<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--
    	이 페이지는 전달된 요청이 어떤 요청인지를 확인 후 
    	그 요청에 맞는 페이지로 이동하는 것을 전담하는 Controller 페이지입니다.
    	그렇기 때문에 이 페이지는 어떠한 화면을 사용자에게 응답하는 페이지가 아닙니다.
    	자바 코드를 통해 요청 처리 후 적절한 페이지로 이동시키는 역할을 담당합니다.
     --%>
     
     <%
     	int age = Integer.parseInt(request.getParameter("age"));
     	
     	if(age >= 20) {
     		//내장객체 response가 제공하는 메서드 sendRedirect()를 통해
     		//원하는 페이지로 강제 이동할 수 있습니다.
     		//괄호 안에 이동시킬 페이지의 URL을 문자열로 적어주면 됩니다.
     		response.sendRedirect("res_basic_ok.jsp");
     	} else {
     		response.sendRedirect("res_basic_no.jsp");
     	}
     
     %>
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    