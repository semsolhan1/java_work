<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>${stu.stuName}학생의 성적 정보 조회</h2>
	<p>
		# 국어: ${stu.kor} <br>
		# 영어: ${stu.eng} <br>
		# 수학: ${stu.math} <br>
		# 총점: ${stu.total} <br>
		# 평균: ${stu.average}
	</p>
	
	<a href="${pageContext.request.contextPath}/score/search">개별 조회 하기</a>
	
</body>
</html>