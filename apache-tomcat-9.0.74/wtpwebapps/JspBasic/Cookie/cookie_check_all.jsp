<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	Cookie[] cookies = request.getCookies();
    	if(cookies != null) {
    		for(Cookie c : cookies) {
    			out.print(c.getName() + " : " + c.getValue() + "<br>");
    			out.print("---------------------------------------<br>");
    		}
    	}
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>