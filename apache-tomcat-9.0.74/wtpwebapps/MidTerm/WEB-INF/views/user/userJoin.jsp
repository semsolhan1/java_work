<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section>
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-9 col-sm-12 join-form">
					<div class="titlebox">회원가입</div>
					<form action="${pageContext.request.contextPath}/user/userJoin"
						method="post" name="joinForm">
						<div class="form-group">
							<!--사용자클래스선언-->
							<label for="id">아이디</label>
							<div class="input-group">
								<!--input2탭의 input-addon을 가져온다 -->
								<input type="text" name="userId" class="form-control"
									id="userId" placeholder="아이디를 (영문포함 4~12자 이상)">
								<div class="input-group-addon">
									<button type="button" class="btn btn-primary" id="idCheckBtn">아이디중복체크</button>
								</div>
							</div>
							<span id="msgId"></span>
							<!--자바스크립트에서 추가-->
						</div>
						<div class="form-group">
							<!--기본 폼그룹을 가져온다-->
							<label for="password">비밀번호</label> <input type="password"
								name="userPw" class="form-control" id="userPw"
								placeholder="비밀번호 (영 대/소문자, 숫자 조합 8~16자 이상)"> <span
								id="msgPw"></span>
							<!--자바스크립트에서 추가-->
						</div>
						<div class="form-group">
							<label for="password-confrim">비밀번호 확인</label> <input
								type="password" class="form-control" id="pwConfirm"
								placeholder="비밀번호를 확인해주세요."> <span id="msgPw-c"></span>
							<!--자바스크립트에서 추가-->
						</div>
						<div class="form-group">
							<label for="name">이름</label> <input type="text" name="userName"
								class="form-control" id="userName" placeholder="이름을 입력하세요.">
						</div>
						<!--input2탭의 input-addon을 가져온다 -->
						<div class="form-group">
							<label for="hp">휴대폰번호</label>
							<div class="input-group">
								<select name="userPhone1" class="form-control phone1"
									id="userPhone1">
									<option>010</option>
									<option>011</option>
									<option>017</option>
									<option>018</option>
								</select> <input type="text" name="userPhone2"
									class="form-control phone2" id="userPhone2"
									placeholder="휴대폰번호를 입력하세요.">
							</div>
						</div>
						<div class="form-group email-form">
							<label for="email">이메일</label><br>
							<div class="input-group">
								<input type="text" name="userEmail1" class="form-control"
									id="userEmail1" placeholder="이메일"> <select
									name="userEmail2" class="form-control" id="userEmail2">
									<option>@naver.com</option>
									<option>@daum.net</option>
									<option>@gmail.com</option>
									<option>@hanmail.com</option>
									<option>@yahoo.co.kr</option>
								</select>
								<div class="input-group-addon">
									<button type="button" id="mail-check-btn"
										class="btn btn-primary">이메일 인증</button>
								</div>
							</div>
						</div>
						<div class="mail-check-box">
							<input type="text" class="form-control mail-check-input"
								placeholder="인증번호 6자리를 입력하세요." maxlength="6" disabled="disabled">
							<span id="mail-check-warn"></span>
						</div>


						<!--readonly 속성 추가시 자동으로 블락-->
						<div class="form-group">
							<label for="addr-num">주소</label>
							<div class="input-group">
								<input type="text" name="addrZipNum" class="form-control"
									id="addrZipNum" placeholder="우편번호" readonly>
								<div class="input-group-addon">
									<button type="button" class="btn btn-primary"
										onclick="searchAddress()">주소찾기</button>
								</div>
							</div>
						</div>
						<div class="form-group">
							<input type="text" name="addrBasic" class="form-control"
								id="addrBasic" placeholder="기본주소">
						</div>
						<div class="form-group">
							<input type="text" name="addrDetail" class="form-control"
								id="addrDetail" placeholder="상세주소">
						</div>

						<!--button탭에 들어가서 버튼종류를 확인한다-->
						<div class="form-group">
							<button type="button" id="joinBtn"
								class="btn btn-lg btn-success btn-block">회원가입</button>
						</div>

						<div class="form-group">
							<button type="button" id="loginBtn"
								class="btn btn-lg btn-info btn-block">로그인</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>






	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js">
	</script>
	
	
	
	<script>
		let code = ''; //이메일 전송 인증번호 저장을 위한 변수

		let idFlag, pwFlag; //이건왜? 정규표현식 유효성 검사
				
				
		document.getElementById('idCheckBtn').onclick = function(){
			
			const userId = document.getElementById('userId').value;
			
			if(userId === ''){
				alert('아이디는 필수 값 입니다.')
				return; 
			} if(!idFlag){
				alert('똑바로 적어주세요');
				return;
			}
			
			
			
			
			const reqObj = {
					method: 'post',
					headers: {
						'Content-Type' : 'text/plain'
					},
					body: userId
			};
				
			
			//비동기 요청 보내기
			fetch('${pageContext.request.contextPath}/user/idCheck', reqObj)
			
			.then(res => res.text()) 
			.then(data => { 

				//(아이디 중복 여부)
				if(data === 'ok'){
					//더이상 아이디 작성 X
					document.getElementById('userId').setAttribute('readonly', true);
					//더이상 누르기 금지
					document.getElementById('idCheckBtn').setAttribute('disabled', true);
					//그리고 메세지 남기기
					document.getElementById('msgId').textContent = '사용 가능한 아이디 입니다.';
				} else { //아이디 중복이면?
					document.getElementById('msgId').textContent = '중복 된 아이디 입니다.';
				}
			}); 
		
	} //아이디 중복 끝
				
				
	//인증 번호를 이메일로 전송시켜보자
	document.getElementById('mail-check-btn').onclick = function(){
		const email = document.getElementById('userEmail1').value + document.getElementById('userEmail2').value;  
	
		fetch('${pageContext.request.contextPath}/user/mailCheck?email=' + email) //겟방식
		.then(res => res.text()) 
			.then(data => { 
				console.log('인증번호: ' + data);
				
			
			//비활성된 인증번호의 입력창을 활성화
			document.querySelector('.mail-check-input').disabled = false;
			code = data; 
			alert('인증번호가 전송 되었습니다. 확인 후 입력란에 정확히 입력하세요');
			
			}); //비동기 끝.
			
	}; //인증번호 이벤트 끝.			
				
				
				
	//인증번호 검증
	document.querySelector('.mail-check-input').onblur = function(e){
		console.log('blur 이벤트 발생 확인!');
		
		//사용자가 입력한 인증 번호 가져오기.
		const inputCode = e.target.value;
		
		//위로가보면 span태그가 있다. 결과 메시지 남겨 줄 것이다.
		const $resultMsg = document.getElementById('mail-check-warn');
		
		if(inputCode === code){
			$resultMsg.textContent = '인증번호가 일치합니다.';
			$resultMsg.style.color = 'green';
			//이메일 인증을 더 이상 못하게 버튼 비활성
			document.getElementById('mail-check-btn').disabled = true;
			document.getElementById('userEmail1').setAttribute('readonly', true);
			document.getElementById('userEmail2').setAttribute('readonly', true);
			e.target.style.display = 'none'; //인증번호 입력창 숨기기
			
			const email2 = document.getElementById('userEmail2'); //요소취득
			email2.setAttribute('onFocus', 'this.initialSelect = this.selectedIndex'); //속성걸기
			
			//즉, 이벤트를 인라인방식으로 먹였는데. 사용자가 선택한 그 인덱스 값을 초기화 값으로 세팅 해주겟다 라는 뜻이다.
			email2.setAttribute('onChange', 'this.selectedIndex = this.initialSelect');
			
			
			
			
		} else {   //사용자가 인증번호가 틀렸다면
			$resultMsg.textContent = '인증번호를 다시 확인해 주세요.';
			$resultMsg.style.color = 'red';
			e.target.focus(); 
		}
		
	} //인증 번호 끝
	
	
	
	
	
	
	
	
	// 주소 API
	function searchAddress() { 
        new daum.Postcode({
            oncomplete: function(data) {

                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값 가져옴
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }		
				
				
             // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('addrZipNum').value = data.zonecode; //우편번호
                document.getElementById("addrBasic").value = addr; 	//기본주소
                document.getElementById("addrDetail").focus();
            }
        }).open();
    } //주소찾기 api 끝.
				
				
				
  //폼 데이터 검증 (회원 가입 버튼을 눌렀을 때)
	document.getElementById('joinBtn').onclick = function(){
    	
    	if(idFlag && pwFlag){ //둘중 하나라도 false니? 정규표현식을 통과했으면 각각 true가 오겠지. 이걸 통과 해야 중복체크 등등을 검사한다. 하나라도 통과하지 못한다면 else로빠짐.
    		//입력값 검증
        	if(!document.getElementById('userId').getAttribute('readonly')){ //리드온리(중복체크안했다라는소리)가 걸려있지 않니?
        		alert('아이디 중복 체크는 필수 입니다.');
        		return; //종료
        	}
    	
        	if(document.getElementById('userPw').value !== document.getElementById('pwConfirm').value){ //혹시 입력한 비밀번호 값과 비밀번호 확인란과 값이 다르니? 
        		alert('비밀번호 확인란을 확인하세요!')
        		return
        	}
        	
        	if(document.getElementById('userName').value === ''){
        		alert('이름은 필수값입니다.');
        		return;
        	}

        	if(!document.getElementById('mail-check-btn').disabled){ //이메일 인증을 안한사람이구나
        		alert('이메일 인증을 완료해 주세요.');
        		return;
        	}
        	
			if(confirm('회원 가입을 진행합니다.')){
				document.joinForm.submit();
			} else { //취소버튼누르면
				return;
			}
        	
    	} else { //정규표현식 통과 못함
    		alert('입력값을 다시 한 번 확인하세요!');
    	}
    	
    	
    	
    }
	
    
    
    
    
    


	/*아이디 형식 검사 스크립트*/
	var id = document.getElementById("userId");
	id.onkeyup = function() { 
		/*test메서드를 통해 비교하며, 매칭되면 true, 아니면 false반*/
		var regex = /^[A-Za-z0-9+]{4,12}$/; /*정규표현식의 시작과 끝.  $이 끝이다. []안에 있는 것이 찾고자 하는 문자의 규칙이다. 그 문자는 4자이상 12자 이하 로 설정한다. 구글에 자바스크립트 id 정규표현식 이런식으로 쳐서 가져다가 쓰면 됨*/
		if (regex.test(document.getElementById("userId").value)) { /*검증하고자하는 값을 넣어주면 됨. 맞으면 트루겠지*/
			document.getElementById("userId").style.borderColor = "green";
			document.getElementById("msgId").innerHTML = "아이디중복체크는 필수 입니다";

			idFlag = true;
			
			
		} else {
			document.getElementById("userId").style.borderColor = "red";
			document.getElementById("msgId").innerHTML = "부적합한 아이디 입니다.";
		
			idFlag = false;
		}
	}
	
	
	/*비밀번호 형식 검사 스크립트*/
	var pw = document.getElementById("userPw");
	pw.onkeyup = function() {
		var regex = /^[A-Za-z0-9+]{8,16}$/;
		if (regex.test(document.getElementById("userPw").value)) {
			document.getElementById("userPw").style.borderColor = "green";
			document.getElementById("msgPw").innerHTML = "사용가능합니다";
	
			pwFlag = true;
		
		} else {
			document.getElementById("userPw").style.borderColor = "red";
			document.getElementById("msgPw").innerHTML = "불가능합니다.";
		
			pwFlag = false;
		}
	}
	
	
	/*비밀번호 확인검사*/
	var pwConfirm = document.getElementById("pwConfirm");
	pwConfirm.onkeyup = function() {
		var regex = /^[A-Za-z0-9+]{8,16}$/;
		if (document.getElementById("pwConfirm").value == document
				.getElementById("userPw").value) {
			document.getElementById("pwConfirm").style.borderColor = "green";
			document.getElementById("msgPw-c").innerHTML = "비밀번호가 일치합니다";
		} else {
			document.getElementById("pwConfirm").style.borderColor = "red";
			document.getElementById("msgPw-c").innerHTML = "비밀번호 확인란을 확인하세요";
		}
	}			
				
	</script>


</body>
</html>