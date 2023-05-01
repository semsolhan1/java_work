<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	request.setCharacterEncoding("utf-8");	
    	
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	if(id.equals("abc1234") && pw.equals("aaa1111")) {
    		Cookie loginCoo = new Cookie("login_cookie", id);
    		loginCoo.setMaxAge(15);
    		response.addCookie(loginCoo);
    		
    		//사용자가 아이디 기억하기 체크박스를 체크했는지의 여부 확인.
    		if(request.getParameter("id_remember") != null) {
    			Cookie idMemory = new Cookie("remember_id", id);
    			idMemory.setMaxAge(30);
    			response.addCookie(idMemory);
    		}
    		
    		response.sendRedirect("cookie_welcome.jsp");
    	} else {
    		response.sendRedirect("cookie_login.jsp");
    	}
    
    %>
    
    
    
    
    
    
    
    
    
    
    
    
    