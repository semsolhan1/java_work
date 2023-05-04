<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input {
  font-size: 1em;
  letter-spacing: 1px;
  background-image: none;
  border: 1px solid #ccc;
  border-radius: 5px;
}


</style>
</head>
<body>
   
   <%@ include file="../include/header.jsp" %>
   
    <div align="center" style="margin-bottom: 20px; padding-bottom: 50px;">
      <h2>비밀번호 변경 페이지</h2>
      <hr>
       
      <form action="/MyWeb/changePw.user" method="post">
         <p><strong>현재 비밀번호</strong></p>
          <input type="password" name="old_pw" required="required"> <br><br>
         <p><strong>변경 비밀번호</strong></p>
         <input type="password" name="new_pw" required="required"> <br><br>
         
         <input type="submit" value="확인" class="btn btn-primary btn-lg"> &nbsp;&nbsp;
         <input type="button" value="취소" class="btn btn-default btn-lg" onclick="history.back()">
         
      </form>
      
   </div>
   
   <%@ include file="../include/footer.jsp" %>
   
</body>
</html>