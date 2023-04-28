<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="req_album_result.jsp">
	<table border="1">
	<tr>
		<th></th>
		<th>앨범 커버</th>
		<th>가수</th>
		<th>제목</th>
		<th>발매일</th>
	</tr>
	<tr>
		<td>
			<input type="radio" name="title" value="sel1">
		</td>
		<td>
			<img alt="pic1" src="1.jpg" width="100px" height="100px">
		</td>
		<td>미연</td>
		<td>드라이브</td>
		<td>멀라</td>
	
	</tr>
	<tr>
		<th></th>
		<th>앨범 커버</th>
		<th>가수</th>
		<th>제목</th>
		<th>발매일</th>
	</tr>
	<tr>
		<td>
			<input type="radio" name="title" value="sel2">
		</td>
		<td>
			<img alt="pic1" src="1.jpg" width="100px" height="100px">
		</td>
		<td>피프티피프티</td>
		<td>큐피트</td>
		<td>멀라</td>
	
	</tr>
	<tr>
		<td colspan="5">
			<input type="submit" value="확인">
		</td>
	</tr>
	</table>
	</form>

	
	
	
	
</body>
</html>