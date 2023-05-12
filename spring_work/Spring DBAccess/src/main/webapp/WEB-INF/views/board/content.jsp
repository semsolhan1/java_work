<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	 <h2>${boardNo}번 게시물 내용</h2>
    <p>
        # 작성자: ${writer} <br>
        # 제목: ${title} <br>
        # 내용: <textarea rows="5" readonly>${content}</textarea>
    </p>
    
    <a href="${pageContext.request.contextPath}/board/list">글 목록 보기</a>
    <a href="${pageContext.request.contextPath}/write/modify">글 수정 하기</a>
	
</body>
</html>