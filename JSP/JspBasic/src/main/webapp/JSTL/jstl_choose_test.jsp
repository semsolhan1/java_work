<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
        jstl choose 태그와 el을 활용하여
        100점이 넘어가면 "점수를 잘못 입력하셨습니다."
        90점이 넘으면 조건을 한번 더 검사해서,
        95 ~ 100은 A+, 94 ~ 90은 A0,
        80점이 넘으면 B, 70점이 넘으면 C, 60점대는 D
        나머지는 모두 F처리하시면 됩니다.
    --%>

	<c:set var="p" value="${param.point}" />

	당신의 점수는:
	<strong>${p}점</strong>

	<c:choose>
		<c:when test="${p > 100}">
			<h4>점수를 잘못 입력하셨습니다.</h4>
		</c:when>
		<c:when test="${p >= 90}">
			<c:choose>
				<c:when test="${p >= 95}">
					<h4>당신의 학점은 A+ 입니다.</h4>
				</c:when>
				<c:otherwise>
					<h4>당신의 학점은 A0 입니다.</h4>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:when test="${p >= 80}">
			<h4>당신의 학점은 B 입니다.</h4>
		</c:when>
		<c:when test="${p >= 70}">
		<h4>당신의 학점은 C 입니다.</h4>
        </c:when>
        <c:when test="${p >= 60}">
            <h4>당신의 학점은 D 입니다.</h4>
        </c:when>
        <c:otherwise>
            <h4>당신의 학점은 F 입니다.</h4>
        </c:otherwise>
    </c:choose>
</body>
</html>