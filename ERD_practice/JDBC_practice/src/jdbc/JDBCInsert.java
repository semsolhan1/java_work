package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert {

	public static void main(String[] args) {
		
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
		String sql = "INSERT INTO members "
				+ "(mem_id, mem_pw, mem_name, mem_age) "
				+ "VALUES(?,?,?,?)";
		
		
		//DB 연동 순서
		//1. DB 사용자 계정명, 암호, DB url 등 초기 데이터 변수를 설정.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "hr";
		String upw = "hr";
		
		//사용할 객체의 변수를 미리 선언(finally에서도 사용해야 하니까)
		Connection conn = null;
		PreparedStatement pstmt = null;
		
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
			 정적 메서드인 getConnection()을 호출하여 객체를 받아옵니다.
			 */
			 conn = DriverManager.getConnection(url, uid, upw);
			
			 /*
			  # b. PreparedStatement 객체.
			  : SQL문을 실행하기 위한 객체.
			  pstmt 객체는 conn 객체가 제공하는 메서드를 호출하여
			  객체를 받아옵니다.
			  매개값으로 실행시킬 sql문을 전달합니다.
			  */
			  pstmt = conn.prepareStatement(sql);
			 
			  /*
			   # c. 물음표 채우기 (SQL문 완성하기)
			   : pstmt 객체를 생성했다면 SQL문의 ?를 채워줍니다.
			   - ?는 첫번째 물음표부터 1번 인덱스값을 가지며, 순차적으로
			    인덱스가 1씩 증가합니다.
			   - DB 테이블의 컬럼 타입에 따라 setString(), setInt(), setDouble()
			   등의 메서드를 통해 ?를 채웁니다.
			   
			   INSERT INTO members "
				+ "(mem_id, mem_pw, mem_name, mem_age) "
				+ "VALUES(?,?,?,?)
			   */
			  pstmt.setString(1, id);
			  pstmt.setString(2, pw);
			  pstmt.setString(3, name);
			  pstmt.setInt(4, age);
			  
			  /*
			   # d: pstmt 객체를 통한 SQL문 실행
			   1. INSERT, UPDATE, DELETE 명령일 경우
			   executeUpdate()를 호출합니다.
			   
			   2. SELECT 명령일 경우에는 executeQuery()를 호출합니다.
			   
			   3. executeUpdate()는 sql문 실행 시 성공한 쿼리문의 개수를,
			    실패 시 0이 리턴됩니다.
			   */
			  
			  int rn = pstmt.executeUpdate();
			  
			  if(rn == 1) {
				  System.out.println("DB에 회원정보 저장 성공!");
			  } else {
				  System.out.println("DB에 회원정보 저장 실패!");
			  }
			  
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 4. DB 연동 객체들 자원 반납.
			 - 원활한 JDBC 프로그래밍을 위해 사용한 자원을 반납합니다.
			 */
			try {
				pstmt.close();//역순으로 회수 합니다.
				conn.close();
				sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}

















