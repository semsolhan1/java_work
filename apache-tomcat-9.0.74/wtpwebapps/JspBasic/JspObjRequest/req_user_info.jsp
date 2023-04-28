<%@page import="java.util.Arrays"%>
<%@page import="java.sql.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String gender = request.getParameter("gender");
    	String[] hobby = request.getParameterValues("hobby");
    	String region = request.getParameter("region");
    	String introduce = request.getParameter("introduce");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		# ID: <%=id %> <br>
		# PW: <%=pw %> <br>
		# 성별: <%=gender %> <br>
		# 취미: <%=Arrays.toString(hobby) %> <br>
		# 지역: <%=region %> <br>
		# 자기소개: <%=introduce %> <br>
	</p>
</body>
</html>