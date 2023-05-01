<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String title = request.getParameter("title");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if(title.equals("sel1")) { %>
		
		<div align="center">
			<h2>선택하신 앨범 정보</h2>
			<hr>
			<p>
				당신이 선택하신 앨범은 IVE(아이브) 의 <strong>I AM</strong> 입니다.
			</p>
			<hr>
			<h3>타이틀 곡 뮤직 비디오</h3>
			<iframe width="800" height="600" src="https://www.youtube.com/embed/6ZUIwj3FgUY?autoplay=1" title="IVE 아이브 &#39;I AM&#39; MV" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
		</div>
		
	<% } else if(title.equals("sel2")) { %>
	
		<div align="center">
			<h2>선택하신 앨범 정보</h2>
			<hr>
			<p>
				당신이 선택하신 앨범은 IVE(아이브) 의 <strong>Kitsch</strong> 입니다.
			</p>
			<hr>
			<h3>타이틀 곡 뮤직 비디오</h3>
			<iframe width="800" height="600" src="https://www.youtube.com/embed/pG6iaOMV46I?autoplay=1" title="IVE 아이브 &#39;Kitsch&#39; MV" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>		</div>
	
	<% } %>

</body>
</html>















