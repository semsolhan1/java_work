<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- jstl을 사용하기 위해서는 외부 태그 라이브러리 선언을 해 주셔야 합니다. --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		JSTL의 c:set으로 변수를 선언하면 EL 안에서 활용이 가능합니다.
		값도 EL을 이용해서 매겨줄 수 있습니다.
		EL이 타입을 자동으로 인식해서 정해줍니다.
		c:set을 이용해서 지정한 변수는 스크립틀릿의 자바 변수와는 다릅니다.
		내장객체에 지정하는 데이터로 활용되기 때문에 EL이 가능한 거에요~
	 --%>
	

	<c:set var="age" value="${param.age}" />

	<p>
		나이: ${age}세
		
		<c:if test="${age >= 20}">
			<h2>당신은 성인입니다.</h2>
		</c:if>
		
		<c:if test="${age < 20}">
			<h2>당신은 미성년자입니다.</h2>
		</c:if>
	</p>


</body>
</html>
















