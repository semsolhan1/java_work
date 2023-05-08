<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <%@ include file="../include/header.jsp" %>
    
    <div align="center">
        <h2>My Page</h2>
        <hr>
        <p>
            <strong>${user.userName}(${user.userId})님의 정보를 관리합니다.</strong>
        </p>
        <hr>
        <br>
        <p>
            <a href="/MyWeb/pwPage.user">비밀번호 변경</a> &nbsp;
            <a href="/MyWeb/modPage.user">회원정보 변경</a> &nbsp;
            <a href="/MyWeb/delPage.user">회원 탈퇴</a> 
        </p>
    </div>

    <%@ include file="../include/footer.jsp" %>

</body>
</html>