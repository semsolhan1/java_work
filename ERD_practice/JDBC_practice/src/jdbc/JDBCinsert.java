package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCinsert {

	public static void main(String[] args) {
		//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib 파일 위치
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("*** 회원 가입 페이지 ***");
        
			System.out.print("아이디: ");
			String id = sc.next();
        
			System.out.print("비밀번호: ");
			String pw = sc.next();
        
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
        
        ///////////////////////////////////////////////
			//SQL문 작성
			//SQL문은 String 형태로 작성합니다.
			//변수가 들어갈 자리에 ?를 채웁니다.
			String sql = "INSERT INTO members" 
									+"(mem_id, mem_pw, mem_name, mem_age)"
									+ "VALUES(?,?,?,?)";
			
			//DB 연동 순서
			//1. DB 사용자 계정명, 암호, DB url 등 초기 데이터 변수를 설정.
			String url = "jdbc:oracle:thin://localhost:1521:xe";
			String uid = "hr";
			String upw = "hr";
			
			try {
				
				//2. JDBC 커넥터 드라이버 호출
				//Java 프로그램과 DB를 연결해주는 드라이버 클래스 생성.
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//3. DB 연동을 위한 클래스들의 객체를 생성
				/*
				# a. Connection 객체
				: DB와의 연결(접속)을 위한 객체.
				Connection 객체는 new 연산자를 통해
				직접 생성하는 것이 아니라, DriverManager 클래스가 제공하는
				정적 메서드인 getConnection() 을 호출하여 객체를 받아옵니다. 
				*/
				Connection conn = DriverManager.getConnection(url, uid, upw);
				
				
				/*
				# b. PreparedStatememt 객체.
				: SQL문을 실행하기 위한 객체.
				pstmt 객체는 comm 객체가 제공하는 메서드를 호출하여
				객체를 받아 옵니다.
				매개값으로 실행시킬 sql문을 전달합니다.
				*/
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}

}
































