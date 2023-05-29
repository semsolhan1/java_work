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

	flex-wrap: wrap;
	padding-top: 10px;
}

.wrapper .resultWrapper .result {
	box-sizing: border-box;
	margin : 10px auto;
	width: 90%;
	height: 100px;
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
	height: 10vh;
	border: 1px solid green;
}

a {
	text-decoration: none;
	cursor: pointer;
}
.articleWrapper{

	box-sizing: border-box;
	width: 100%;
	height: 60vh;
	border: 1px solid red;
	overflow: auto;
}

.article{
	box-sizing: border-box;
	width: 100%;
	height: 20vh;
	border: 1px solid blue;
	margin-bottom: 10px;
}
.title{
	box-sizing: border-box;
	width: 70%;
	height: 10vh;
	border: 1px solid blue;
	line-height: 10vh;

}
#count{
	width: 100%;
	height: 20vh;
	border: 1px solid red;
	line-height: 20vh;
}


</style>
<body>

	<div class="wrapper">
		<div class="header">
		<div class="title">요리제목</div>
		</div>
		<div class="resultWrapper">
			<div class="result" id="mainImg">이미지</div>			
			<div class="result" id="ingrdient">재료</div>			
			<div class="result" id="cooking">조리법</div>
		</div>
	</div>

	<aside>
		<div id="logo">
			로고 <img src="" alt="">
		</div>
		<div id="count">
			__명의 친구가 요리했어요
		</div>
		<div class ="articleWrapper">
			<div class="article"> 후기1</div>
			<div class="article"> 후기2</div>
			<div class="article"> 후기3</div>
			<div class="article"> 후기4</div>
			<div class="article"> 후기5</div>

		</div>
		<div id="menu"></div>
	</aside>
</body>
</html>