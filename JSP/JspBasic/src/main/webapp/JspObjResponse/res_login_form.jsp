<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	#login-btn {
		width: 60px;
		height: 50px;
		padding: 2px;	
	}
</style>

</head>
<body>

	<div align="center" style="border: 2px dotted red; padding:30px; width: 700px">
		
		<h3>sendRedirect 연습!</h3>
		
		<form action="res_login_con.jsp" method="post">
			<table border="1">
				<tr>
					<td>
						<input type="text" name="id" size="10" placeholder="ID를 입력">
					</td>
					<td rowspan="2">
						<input id="login-btn" type="submit" value="로그인">
					</td>
				</tr>
				<tr>
					<td>
						<input type="password" name="pw" size="10" placeholder="PW를 입력">
					</td>
				</tr>
			</table>
		</form>
		
	</div>

</body>
</html>