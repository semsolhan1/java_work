<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
    	/*
    	Declaration(선언자)
    	jsp 파일 내부에서 사용할 멤버변수나 메서드 등을
    	선언할 때 사용하는 태그입니다.
    	선언자에 작성한 코드는 jsp파일이 클래스로 변환될 때
    	클래스 블록에 선언됩니다.
    	*/
    	public int i;
    
    	int add(int n1, int n2) {
    		return n1 + n2;
    	}
    	
    	
    %>
    
    <%
    	/*
    	Scriptlet(스크립틀릿)
    	지역변수 및 메서드 내부의 코드를 작성하는 태그입니다.
    	스크립틀릿에 작성한 내용은 jsp파일이 클래스로 변환될 때
    	jsp_service()라는 메서드 내부에 작성됩니다.
    	페이지 요청이 발생할 때마다 실행할 로직을 작성할 수 있습니다.
    	*/
    
    	int j = 0;
    	
    	/* 
    	void hello() {
    		System.out.println("안녕~");
    	} 
    	*/
    	
    	i++;
    	j++;
    	
    	LocalDateTime now = LocalDateTime.now();
    	
    	DateTimeFormatter dtf 
    		= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		expression(표현자)
		jsp 페이지 내에서 사용되는 변수의 값 또는 메서드의 리턴값을
		브라우저에 바로 출력할 때 사용하는 태그.
		결과값 타입 -> String
		jsp 파일이 클래스로 변환될 때 out.print()로 변환됨.
	 -->

	i의 값: <% out.print(i); %> <br>
	j의 값: <%= j %> <br>
	난수값: <%= Math.random() %>
	
	<hr>
	
	<h2>구구단 7단</h2>
	<%
		for(int hang=1; hang<=9; hang++) {
			out.print("7 x " + hang + " = " + 7*hang + "<br>");
		}
	%>
	<hr>
	
	<% for(int hang=1; hang<=9; hang++) { %>
		7 x <%=hang %> = <%= 7*hang %> <br>
	<% } %>
	
	<hr>
	
	오늘 날짜 정보: <%= now.format(dtf) %>
	

</body>
</html>















