<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.virtual-box {
   margin-bottom: 20px;
}

</style>
</head>
<body>

<jsp:include page="../include/header.jsp"/>

<div class="virtual-box"></div>
<div class="container">
       <div class="row">
           <div class="col-md-offset-2 col-md-8">
               <div class="panel">
                   <div class="panel-heading text-white"  align="center" style="background: #F8F8FF;">
                       <h2>게시글 수정 페이지</h2>
                   </div>
                   <div class="panel-body">
                       <form action="/MyWeb/update.board" method="post">
                       	   <%-- 브라우저에 태그를 노출하지 않고 전송할 때 사용하는 타입 hidden --%>
                       	   <input type="hidden" name="bId" value="${article.boardId}">
                           <div class="form-group">
                               <label for="writer" hidden>작성자</label>
                               <input id="writer" name="bWriter" value="${article.writer}" 
                               type="text" class="form-control" readonly>
                           </div>
   
                           <div class="form-group">
                               <label for="title" hidden>글제목</label>
                               <input id="title" name="bTitle" type="text" class="form-control" value="${article.title}">
                           </div>
   
                           <div class="form-group">
                               <label for="content" hidden>글내용</label>
                               <textarea id="content" name="bContent" class="form-control" rows="5">${article.content}</textarea>
                           </div>
                           
                     
                     <div>
                            <button type="submit" class="btn btn-primary form-control" onclick="return confirm('수정하시겠습니까?')">수정</button>
                            <button type="button" class="btn btn-danger form-control" onclick="location.href='/MyWeb/list.board'">취소</button>
                          </div>
                       </form>
                       
                   </div>
               </div>
           </div>
       </div>
   </div>

<jsp:include page="../include/footer.jsp"/>
</body>
</html>