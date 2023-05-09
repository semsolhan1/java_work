<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	tbody{
		font-size: 20px;
	}
	
	.btn-countPerPage {
		background-color: gray;
		color: white;
	}
	
	
</style>

</head>
<body>

	<c:if test="${user == null}">
		<script>
			alert('회원만 이용 가능한 게시판 입니다. 로그인 해 주세요.');
			location.href="/MyWeb/loginPage.user"
		</script>
		
	</c:if>

	<jsp:include page="../include/header.jsp"/>

	<div class="container">
		<h2>My Web게시판</h2>
		
		<span style="float: right; margin-bottom: 15px">
			<input class="btn btn-countPerPage" type="button" value="10" onclick="location.href='/MyWeb/list.board?page=1&cpp=10'">
			<input class="btn btn-countPerPage" type="button" value="20" onclick="location.href='/MyWeb/list.board?page=1&cpp=20'">
			<input class="btn btn-countPerPage" type="button" value="30" onclick="location.href='/MyWeb/list.board?page=1&cpp=30'">
		</span>
		
		<table class="table table-secondary table-hover table-bordered">
			<thead style="font-size: 25px">
				<tr>
					<th>글 번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>

			
			<tbody>
				<c:forEach var="b" items="${boardList}">
					<tr>
						<td>${b.boardId}</td>
						<td>${b.writer}</td>
						<td>
							<a href="/MyWeb/content.board?bId=${b.boardId}">${b.title}</a> 
						</td>
						<td>
							<fmt:parseDate value="${b.regDate}" pattern="yyyy-MM-dd'T'HH:mm:SS" var="parsedDateTime" type="both" />
							<fmt:formatDate value="${parsedDateTime}" pattern="yyyy년 MM월 dd일 HH시 mm분" />
						</td>
						<td>${b.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
			
			<%-- 페이징을 처리할 구간 --%>
			<tbody>
				<tr>
					<td colspan="5" align="center">
						<ul class="pagination pagination-lg">
						
						<%-- 이전 버튼 --%>
                     
	                        <li class="page-item"><a class="page-link"
	                           href="#"
	                           style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">이전</a>
	                        </li>
                     	

                    	<%-- 페이지 버튼 --%>
   						
	                        <li class="page-item">
	                        <a href="#" class="page-link"
	                           style="margin-top: 0; height: 40px; color: pink; border: 1px solid #643691; ''}">1</a>
	                        </li>
               			

                     	<%-- 다음 버튼 --%>
    					
	                        <li class="page-item"><a class="page-link"
	                           href="#"
	                           style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">다음</a>
	                        </li>
						
						</ul>
					</td>
				</tr>
			</tbody>
			
			<tbody>
				<tr>
					<td colspan="5" align="right">
						<form action="/MyWeb/search.board" class="form-inline" >
						  <div class="form-group">
						  	<select name="category" class="form-control">
						  		<option value="title">제목</option>
						  		<option value="writer">작성자</option>
						  		<option value="content">내용</option>
						  	</select>
						    <input type="text" name="search" placeholder="검색어 입력" class="form-control" >
						  	<input type="submit" value="검색" class="btn btn-default">
							<input type="button" value="글 작성" class="btn btn-default" onclick="location.href='/MyWeb/write.board'">
						  </div>
						</form> 
					</td>
				</tr>
			</tbody>
		
		</table>
	</div>

	<jsp:include page="../include/footer.jsp"/>

</body>
</html>







