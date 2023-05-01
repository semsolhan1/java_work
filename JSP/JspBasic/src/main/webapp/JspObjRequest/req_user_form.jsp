<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		* 폼을 이용한 사용자의 입력값 서버로 전달하기
		- 사용자의 입력 데이터를 서버로 전송하려면 HTML의 form 태그를 사용합니다.
		- form태그의 action속성에 데이터를 전달받을 페이지의 url 주소를 작성합니다.
		- input 태그의 name 속성으로 요청 파라미터의 이름을 지정할 수 있습니다.
		  이름을 지정하실 때는 입력값과 관련있는 이름으로 지정해 주는 것이 좋습니다.
	 --%>

	<form action="req_user_info.jsp">
        <!-- name을 통해 추후에 서버 내부에서 해당 입력값을 지목할 수 있다. -->
        아이디: <input type="text" name="id" value="메롱메롱"> <br> 
        비밀번호: <input type="password" name="pw" required> <br>

        # 성별 <br>
        <input type="radio" name="gender" value="male"> 남
        <input type="radio" name="gender" value="female"> 여 <br>

        # 취미 <br>
        <input type="checkbox" name="hobby" value="read"> 독서
        <input type="checkbox" name="hobby" value="sleep"> 수면
        <input type="checkbox" name="hobby" value="soccer"> 축구
        <input type="checkbox" name="hobby" value="game"> 게임 <br>

		# 지역 <br>
		<select name="region">
			<option value="seoul">서울</option>
			<option>대전</option>
			<option>대구</option>
			<option>부산</option>
		</select>


        # 자기소개 <br>
        <textarea name="introduce" cols="30" rows="10"></textarea> <br>

        <input type="submit" value="회원가입">

    </form>

</body>
</html>