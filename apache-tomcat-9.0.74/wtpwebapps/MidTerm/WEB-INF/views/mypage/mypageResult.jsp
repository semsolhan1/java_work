<%@page import="java.io.Console"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.midterm.foodSNS.command.MfreeboardArticleVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<title>Bootstrap demo</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<link href="${pageContext.request.contextPath}/css/mypageResult.css" rel="stylesheet">
</head>

<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous">

	</script>
	<div id="main-con">
		<div id="main-left">ddd</div>



		<div id="main">


			<%
			ArrayList<MfreeboardArticleVO> articles = new ArrayList<>();
			articles = (ArrayList<MfreeboardArticleVO>) request.getAttribute("article");
			for (int i = 0; i < articles.size(); i++) {
			%>
			<div class="boxbox" data-bs-toggle="modal" data-userid="${login.userId}"
				data-fanum="<%=articles.get(i).getFreeboardArticleNumber()%>" data-bs-target="#myModal">
				<%=articles.get(i).getContent()%>
			</div>
			<%
			}
			%>
		</div>
		<div id="main-right">ddd</div>

	</div>
	</div>

	<nav class="navbar bg-success fixed-top ">
		<div class="container-fluid">
			<a class="navbar-brand text-light" href="#">Tasty Friend</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
				aria-controls="offcanvasNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
				aria-labelledby="offcanvasNavbarLabel">
				<div class="offcanvas-header">
					<aside>
						<div id="logo">
							<img src="" alt="">
						</div>
						<div id="profile-img-con">
							<img src="${pageContext.request.contextPath}/user/display/${login.fileLoca}/${login.fileName}"
								alt="default" id="profile-img">
						</div>
						<div class="profileWrapper">
							<div id="simpleProfile">
								<h1>${login.userId}</h1>
								<a href="${pageContext.request.contextPath}/user/userProfileModify"
									id="promodify">프로필수정</a>
								<h3>${login.userNick}</h3>
								<h5>${login.message}</h5>
							</div>
							<ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
								<li class="nav-item"><a class="nav-link active" aria-current="page"
										href="${pageContext.request.contextPath}/">Home</a>
								</li>
								<li class="nav-item"><a class="nav-link" href="#">Follow
										Chief</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Add
										My Recipe</a></li>
								<li class="nav-item"><a class="nav-link"
										href="${pageContext.request.contextPath}/freeboard/regist">Add
										My Story</a></li>

								<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" role="button"
										data-bs-toggle="dropdown" aria-expanded="false"> Option </a>
									<ul class="dropdown-menu">
										<li><a class="dropdown-item" href="#">회원정보수정</a></li>
										<li><a class="dropdown-item" href="#">Another action</a></li>
										<li>
											<hr class="dropdown-divider">
										</li>
										<li><a class="dropdown-item" href="#">Logout</a></li>
									</ul>
							</ul>

						</div>


					</aside>
				</div>

			</div>
		</div>
	</nav>

</body>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-xl">
		<div class="modal-content">
			<div class="modal-body">
				<div class="modal-img">

					<div id="carouselExampleIndicators" class="carousel slide carousel-dark" data-bs-ride="true">
						<div class="carousel-indicators">
							<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0"
								class="active" aria-current="true" aria-label="Slide 1"></button>
							<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
								aria-label="Slide 2"></button>
							<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
								aria-label="Slide 3"></button>
						</div>
						<div class="carousel-inner">
							<div class="carousel-item active">
								<img src="${pageContext.request.contextPath}/img/test.png" class="d-block w-100 simg"
									alt="..xxxe.">
							</div>
							<div class="carousel-item">
								<img src="${pageContext.request.contextPath}/img/test.png"
									class="d-block w-100 simg" alt=".xxx..">
							</div>
							<div class="carousel-item">
								<img src="${pageContext.request.contextPath}/img/test.png" class="d-block w-100 simg"
									alt="..ddd.">
							</div>
						</div>
						<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide="prev">
							<span class="carousel-control-prev-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Previous</span>
						</button>
						<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
							data-bs-slide="next">
							<span class="carousel-control-next-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Next</span>
						</button>

					</div>


				</div>
				<div class="modal-text">
					<div id="freeuserimg">
						<img src="${pageContext.request.contextPath}/user/display/${login.fileLoca}/${login.fileName}"
								alt="default" id="profile-img2">
								<div id="freeuserid"></div>
								
					</div>
					
					
					<!-- *********************************************************************************** -->
					<div id="freecontent">




						
						<div id="replyList">

							<!--  자바스크립트 단에서 반복문을 이용해서 댓글의 개수만큼 반복 표현. -->
							<div class='reply-wrap'>
								<div class='reply-image'>
									<img src='../resources/img/profile.png'>
								</div>
								<div class='reply-content'>
									<div class='reply-group'>
										<strong class='left'>${login.userNick}</strong> <small class='left'>2019/12/10</small>
										<a href='#' class='right'><span
											class='glyphicon glyphicon-pencil'></span>수정</a> <a href='#'
											class='right'><span class='glyphicon glyphicon-remove'></span>삭제</a>
									</div>
									<textarea class="form-control" rows="3" id="reply"></textarea>
								</div>
								<button type="button" id="replyRegist"
									class="right btn btn-info">등록하기</button>
							</div>
						</div>


















						</div>

						<!-- *********************************************************************************** -->
				</div>
			</div>
		</div>

</html>

<Script>
	document.getElementById('main').addEventListener('click', e => {

		if (e.target.matches('.boxbox')) {
			const faNum = e.target.dataset.fanum;
			const userId = e.target.dataset.userid;

			console.log(faNum);
			console.log(userId);

			fetch('${pageContext.request.contextPath}/freeboard/getArticle/' + faNum)
				.then(res => res.json())
				.then(data => {
					console.log(data);
					document.getElementById('freeuserid').textContent = data.userId;
					
				});

			

		} else {
			console.log('여기는 이벤트 대상이 아님');

			return;
		}



	});
	
	document.getElementById('replyRegist').onclick = () => {

        console.log('댓글 등록 이벤트 발생!');

        
        const reply = document.getElementById('reply').value;

        if (reply === '') {
            alert('내용을 입력하세요!');
            return;
        }

        //요청에 관련된 정보 객체
        const reqObj = {
            method: 'post',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                'reply': reply,
            })
        };

        fetch('${pageContext.request.contextPath}/reply/regist', reqObj)
            .then(res => res.text())
            .then(data => {
                console.log('통신 성공!: ' + data);
                document.getElementById('reply').value = '';
                
                
                //등록 완료 후 댓글 목록 함수를 호출해서 비동기식으로 목록 표현.
              //  getList(1, true);
            });

    } //댓글 등록 이벤트 끝.
	
	
	


</Script>