<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/score/selectOne">
		<p>
			# 조회할 학번: <input type="text" name="stuId" size="5">
			<input type="submit" value="확인">
		</p>
	</form>
	
	<p style="color: red;">
		${msg}
	</p>
	
</body>
</html>