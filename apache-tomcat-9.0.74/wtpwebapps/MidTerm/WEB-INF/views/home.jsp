<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>시작화면</title>

<!-- reset.css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">

<!-- custom css -->
<!--    <link rel="stylesheet" href="./home.css">-->

<style>
.wrapper {
	box-sizing: border-box;
	width: 50%;
	height: 75vh;
	border: 1px solid blue;
	margin: 0 auto;
}

.wrapper .title {
	margin: 0 auto;
	margin-top: 100px;
	width: 100%;
	height: 300px;
	border: 1px solid red;
	text-align: center;
	font-size: 100px;
	line-height: 300px;
}

.wrapper .selectWrapper {
	width: 100%;
	height: 100px;
	margin-top: 20px;
	border: 1px solid red;
	display: flex;
	justify-content: space-between;
}

select {
	box-sizing: border-box;
	width: 33%;
	height: 100px;
	font-size: 30px;
	text-align: center;
	border-radius: 10px;
}

button {
	display: block;
	width: 30%;
	font-size: 30px;
	height: 60px;
	border-radius: 10px;
	margin: 40px auto;
}

header {
	box-sizing: border-box;
	width: 100%;
	display: flex;
	justify-content: right;
	align-items: center;
	height: 10vh;
	border: 1px solid green;
	padding-right: 30px;
}

header div {
	font-size: 30px;
	width: 10%;
	height: 40px;
	border: 1px solid red;
	text-align: center;
	margin: 10px;
}

footer {
	box-sizing: border-box;
	width: 100%;
	height: 15vh;
	/* footer의 높이 */
	position: absolute;
	bottom: 0;
	left: 0;
	border: 1px solid green;
	text-align: center;
	line-height: 150px;
}

a {
	text-decoration: none;
}
</style>
</head>
<body>
	<header>
		<c:if test="${login == null}">
			<div>
				<a href="${pageContext.request.contextPath}/user/userLogin">login</a>
			</div>
			<div>
				<a href="${pageContext.request.contextPath}/user/userJoin">Join</a>
			</div>
		</c:if>
		<c:if test="${login != null}">
			${login.userId}님 환영합니다!
			<div><a href="${pageContext.request.contextPath}/user/userMypage">MyPage</a></div>
			<div><a href="${pageContext.request.contextPath}/user/userLogout">Logout</a></div>
		</c:if>

	</header>
	<div class="wrapper">
		<div class="title">Tasty Friends</div>
		<form action="${pageContext.request.contextPath}/result/mainResult"
			method="POST">
			<div class="selectWrapper">
				<select name="weather">
					<option value="날씨" selected>날씨</option>
					<option value="맑음">맑음</option>
					<option value="흐림">흐림</option>
					<option value="비">비</option>
					<option value="오늘의날씨">오늘의날씨</option>
				</select> <select name="condition">
					<option value="상태" selected>상태</option>
					<option value="보통">보통</option>
					<option value="다이어트중">다이어트중</option>
					<option value="술마시고싶어요">술마시고싶어요</option>

				</select> <select name="feeling">
					<option value="기분" selected>기분</option>
					<option value="신나요">신나요</option>
					<option value="우울해요">우울해요</option>
					<option value="피곤해요">피곤해요</option>
					<option value="특별한날">특별한날</option>
				</select>
			</div>
			<button type="submit">레시피 추천!</button>
		</form>
	</div>
	<footer> copyright © TastyFriends. all rights reserved </footer>
</body>

</html>