package oop.static_.init;

public class DBManager {
	
	public static String addr;
	public static String uid;
	public static String uPw;
	
	//정적 변수를 자동으로 초기화하려면 정적 초기화자가 필요합니다.
	static {
		System.out.println("정적 초기화자가 호출됨!");
		addr = "192.168.0.1:8181/XEPDB1";
		uid = "abc1234";
		uPw = "aaa1111!";
	}
	
	
	public DBManager() {
		System.out.println("생성자가 호출됨!");
		addr = "192.168.0.1:8181/XEPDB1";
		uid = "abc1234";
		uPw = "aaa1111!";
	}

}




