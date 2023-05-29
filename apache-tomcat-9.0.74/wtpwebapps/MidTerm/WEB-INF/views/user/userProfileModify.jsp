<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<style>
	/* sns파일 업로드시 미리보기  */
	.fileDiv {
		height: 100px;
		width: 200px;
		display: none;
		margin-bottom: 10px;
	}

	.fileDiv img {
		width: 100%;
		height: 100%;
	}
</style>
<body>
	<form action="${pageContext.request.contextPath}/user/userProfileModify" method="post"
		enctype="multipart/form-data">
		<label for="file">이미지업로드</label> 
		<input type="file" name="file" id="file"> 
		<input type="text" name="userId" value="${login.userId}" placeholder="${login.userId}" readonly>
		<input type="text" name="userNick" placeholder="${login.userNick}">
		<input type="text" name="message" placeholder="${login.message}">
		<input type="hidden" name="fileName" id="fileName">
			<button  type="button" id="uploadBtn" >확인용</button>
		<button type="submit" id="uploadBtsn">수정완료</button>
	</form>

</body>

</html>

<script>
	const oringinName = document.getElementById('fileName').value;
	console.log(oringinName);
	document.getElementById('uploadBtn').onclick = () => {		
		let file = document.getElementById('file').value;
		//.을 제거한 확장자만 얻어낸 후 그것을 소문자로 일괄 변경
		if (file == '') return;		
		file = file.slice(file.indexOf('.') + 1).toLowerCase();
		if (file !== 'jpg' && file !== 'png' && file !== 'jpeg' && file !== 'bmp') {
			alert('이미지 파일(jpg, png, jpeg, bmp)만 등록이 가능합니다.');
			document.getElementById('file').value = '';
			return;
		}
	}
</script>