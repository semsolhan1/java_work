package com.myweb.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 서비스 객체가 하나의 인터페이스 타입으로 객체를 생성할 수 있게,
//같은 이름의 메서드로 동작할 수 있게끔 인터페이스를 제작
public interface IUserService {

	
	//추상 메서드 선언!
	//void인 이유 ->리턴할 일이 없음. -> 화면에 데이터 전달할 때는 내장객체를 사용할 것이기 때문이다.
	//매개변수 선언 -> Controller가 요청과 함께 전달받는 request와 response를
	//서비스 계층으로 그대로 전달해서 사용할 수 있도록 선언.
	void execute(HttpServletRequest request, HttpServletResponse response);
	
	
}
