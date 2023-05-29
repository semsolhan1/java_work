<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- reset.css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
</head>
<style>
body {
	display: flex;
}

.wrapper {
	box-sizing: border-box;
	width: 80%;
	height: 100vh;
	border: 1px solid red;
}

.wrapper .header {
	box-sizing: border-box;
	width: 100%;
	height: 10vh;
	border: 1px solid black;
	position: relative;
	padding-left: 70px;
	padding-right: 70px;
}

.wrapper .resultWrapper {
	box-sizing: border-box;
	width: 100%;
	height: 90vh;
	border: 1px solid green;
	overflow: auto;
	display: flex;
	justify-content: space-evenly;
	flex-wrap: wrap;
	padding-top: 10px;
}

.wrapper .resultWrapper .result {
	box-sizing: border-box;
	display: block;
	width: 30%;
	height: 500px;
	border: 1px solid blue;
	margin-bottom: 20px;
}

aside {
	box-sizing: border-box;
	width: 20%;
	height: 100vh;
	border: 1px solid black;
}

#logo {
	box-sizing: border-box;
	width: 100%;
	height: 20vh;
	border: 1px solid green;
}

#menu {
	box-sizing: border-box;
	width: 100%;
	height: 50vh;
	border: 1px solid green;
	border-radius: 30px;
	padding-top: 20px;
}

#menu ul {
	margin: 20px auto;
	box-sizing: border-box;
	width: 70%;
	border: 1px solid red;
}

#menu ul li {
	box-sizing: border-box;
	font-size: 30px;
	border: 1px solid blue;
	width: 100%;
	margin-bottom: 20px;
}

#searchInfo {
	box-sizing: border-box;
	width: 35%;
	height: 60px;
	border: 1px solid red;
	position: absolute;
	top: 50%;
	margin-top: -30px;
	border-radius: 30px;
	display: flex;
	justify-content: space-evenly;
}

select {
	width: 25%;
}

button {
	width: 70px;
	height: 60px;
	position: absolute;
	top: 50%;
	left: 103%;
	margin-top: -30px;
}

#category {
	width: 700px;
	height: 60px;
	position: absolute;
	top: 50%;
	left: 80%;
	margin-top: -30px;
	font-size: 20px;
	line-height: 90px;
}

a {

	text-decoration: none;
	cursor: pointer;
}
</style>
<body>
	<div class="wrapper">
		<div class="header">
			<form action="${pageContext.request.contextPath}/result/mainResult"	method="post">
				<div id="searchInfo">
					<select name="weather">
						<option disabled selected>${searchCondition.weather}</option>
						<option value="맑음">맑음</option>
						<option value="흐림">흐림</option>
						<option value="비">비</option>
						<option value="오늘의날씨">오늘의날씨</option>
					</select> <select name="condition">
						<option disabled selected>${searchCondition.condition}</option>
						<option value="보통">보통</option>
						<option value="다이어트중">다이어트중</option>
						<option value="술마시고싶어요">술마시고싶어요</option>
					</select> <select name="feeling">
						<option disabled selected>${searchCondition.feeling}</option>
						<option value="신나요">신나요</option>
						<option value="우울해요">우울해요</option>
						<option value="피곤해요">피곤해요</option>
						<option value="특별한날">특별한날</option>
					</select>
					<button type="submit">다시추천</button>
			</form>



		</div>
		<div id="category">
		
		<a>모두보기</a>/<a>추천레시피</a>/<a>유저레시피</a>
		</div>

	</div>
	<div class="resultWrapper">
		<a href="${pageContext.request.contextPath}/result/resultDetail" class ="result">test</a>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
		<div class="result"></div>
	</div>
	</div>
	<aside>
		<div id="logo">
			로고 <img src="" alt="">
		</div>
		<div id="menu">
			<ul>
				<li><a href="${pageContext.request.contextPath}/midterm">Home</a></li>
				<li><a href="${pageContext.request.contextPath}/mypage/mypageResult" >MyPage</a></li>
				<li>Following</li>
				<li>LogOut</li>
			</ul>


		</div>
	</aside>
</body>
</html>

<script>

function searchRecipe(){
	
}


</script>