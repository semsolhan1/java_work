<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	int count = 0;
    
    	if(application.getAttribute("visit") != null) {
    		count = (int) application.getAttribute("visit");
    	}
    
    	count++;
    	
    	application.setAttribute("visit", count);
    %>
    
    