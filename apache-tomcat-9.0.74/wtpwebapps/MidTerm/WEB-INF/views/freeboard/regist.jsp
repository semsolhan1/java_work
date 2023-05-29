<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="${pageContext.request.contextPath}/freeboard/regist" method="post" enctype="multipart/form-data">
			<label for="file">이미지업로드</label> 
			<input multiple="multiple" type="file" name="file" >
			<input type="hidden" name="userId" value="${login.userId}">
			<table class="table">
				<tbody class="t-control">
					<tr>						
						<td><textarea class="form-control" rows="7" name="content"></textarea>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="titlefoot">
				<button class="btn" type="submit">등록</button>
			</div>
		</form>
	</div>
</body>
</html>