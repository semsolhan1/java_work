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
				당신이 선택하신 앨범은 미연의 <strong>드라이브</strong> 입니다.
			</p>
			<hr>
			<h3>타이틀 곡 뮤직 비디오</h3>
			<iframe width="705" height="397" src="https://www.youtube.com/embed/35lirBqwgTs?autoplay=1" title="미연 (MIYEON) - &#39;Drive&#39; Official Music Video" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
			
		</div>
	<% } else if(title.equals("sel2")) { %>
		<div align="center">
			<h2>선택하신 앨범 정보</h2>
			<hr>
			<p>
				당신이 선택하신 앨범은 피프티피프티 <strong>큐피드</strong> 입니다.
			</p>
			<hr>
			<h3>타이틀 곡 뮤직 비디오</h3>
			<iframe width="704" height="396" src="https://www.youtube.com/embed/Qc7_zRjH808?autoplay=1" title="FIFTY FIFTY (피프티피프티) - &#39;Cupid&#39;  Official MV" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
			
		</div>
	<% } %>


</body>
</html>