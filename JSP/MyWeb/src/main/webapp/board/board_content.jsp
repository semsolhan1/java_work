<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

<style>
.virtual-box {
   margin-bottom: 20px;
}

.article-content{
    min-height: 400px;
    border: 1px solid lightgray;
    padding: 20px;
}

.last-update{
    padding-top: 10px;
    font-weight: 500;
    font-size: 25px; 
}

.btn-group a{
    padding-top: 15px;
    font-size: 20px; 
}

</style>

</head>
<body>

<jsp:include page="../include/header.jsp"/>

    <div class="virtual-box"></div>

    <div class="container">
        <div class="row">
            <div class="col-md-offset-1 col-md-10">
                <div class="panel">
                    <div class="panel-heading text-white" style="background: #F8F8FF;">
                        <div class="row">
                            <div class="col-md-6">
                                <h2 style="padding-left: 10px;">${content.title}</h2>
                            </div>
                            <div class="col-md-offset-3 col-md-3">
                                <div style="padding-top: 10px; font-size: 1.5em">작성자: ${content.writer}</div>
                                <div>
                                   조회수: 
                                   ${content.hit}
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="panel-body">
                        <div class="article-content">
                            <p>${content.content}</p>
                        </div>

                        <hr>

                        <div class="row">
                            <div class="col-md-offset-1 col-md-5">
                                <p class="last-update">
                                   <fmt:parseDate value="${content.regDate}" pattern="yyyy-MM-dd'T'HH:mm:ss" var="parsedDateTime" type="both" />
                                   <fmt:formatDate value="${parsedDateTime}" pattern="yy-MM-dd HH:mm" />
                                   
                                </p>
                            </div>
                            <div class="btn-group col-md-offset-1 col-md-5">
                                <a class="btn btn-info" href="/MyWeb/list.board?page=${param.page}&cpp=${param.cpp}">목록 보기</a>
                                <c:choose>
                                	<c:when test="${user.userId == content.writer}">   
					                    <a class="btn btn-primary" href="/MyWeb/modify.board?bId=${content.boardId}">수정하기</a>
					                    <a class="btn btn-danger" href="/MyWeb/delete.board?bId=${content.boardId}" onclick="return confirm('정말 삭제하시겠습니까?')">삭제하기</a>            
	                                </c:when>
	                                <c:otherwise>
	                                	<a class="btn btn-primary" href="/MyWeb/write.board">새 글 쓰기</a>
	                                </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
   </div>
<!-- end content row -->

<jsp:include page="../include/footer.jsp"/>

</body>
</html>