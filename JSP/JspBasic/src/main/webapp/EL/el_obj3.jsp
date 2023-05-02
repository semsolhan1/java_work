<%@page import="user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		User user = (User) session.getAttribute("member");
	%>
	
	<p>
		# 이름: <%=user.getUserName() %> <br>
		# 아이디: <%=user.getUserId() %> <br>
		# 이메일: <%=user.getUserEmail() %> <br>
		# 비밀번호:<%=user.getUserPw() %> <br>
	</p>
	
	<hr>
	
	<p>
		# 이름: ${sessionScope.member.userName} <br>
		# 아이디: ${member.userId} <br>
		# 이메일: ${member.userEmail} <br>
		# 비밀번호: ${member.userPw}
	</p>
	
</body>
</html>