package com.myweb.user.model;

/*
 모델(model) 계층은 비즈니스 로직을 처리하는 역할을 담당합니다.
 비즈니스 로직이란, 외부 프로그램과 연계 작업 등을 수행하는 로직입니다.
 
 VO(value object)
 : 데이터베이스에서 조회된 값, 서버 프로그램에서 요청과 함께 얻은 값 등을 
 포장해서 운반하는 값에 관련된 객체 입니다.
 VO 클래스는 자바빈 클래스로 생성합니다.
 
 자바빈 (java bean)
 웹 프로그래밍에서 어떠한 객체를 가지고 오기 위한 기법이며, 자바로 작성된
 클래스를 일반적으로 부르는 호칭입니다.
 자바빈을 설계하기 위한 규약이 존재합니다.
 1. 은닉(캡슐화)을 구현해서 클래스를 제작한다. (변수 private, getter/setter)
 2. getter 메서드는 매개변수가 존재하지 않아야 한다.
 3. 생성자는, 매개값을 받지 않는 생성자(필수), 매개값을 받는 생성자(선택)가 존재한다.
 4. 모든 getter/setter 메서드는 접근 제한이 public이어야 한다.
 */

/*
 CREATE TABLE my_user (
    user_id VARCHAR2(30) PRIMARY KEY,
    user_pw VARCHAR2(30) NOT NULL,
    user_name VARCHAR2(20) NOT NULL,
    user_email VARCHAR2(100),
    user_address VARCHAR2(100)
);
 */

public class UserVO {

	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private String userAddress;
	
	public UserVO() {}

	public UserVO(String userId, String userPw, String userName, String userEmail, String userAddress) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userAddress=" + userAddress + "]";
	}
	
	
	
}
















