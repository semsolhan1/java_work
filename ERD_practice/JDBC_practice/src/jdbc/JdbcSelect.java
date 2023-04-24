package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class JdbcSelect {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM members";
		
		String url = "jdbc:oracl:thin:@localhost:1521:xe";
		String uid = "hr";
		String upw = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //SELECT 문에서만 사용하는 객체.
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			
			//SLECT문은 executeQuery()를 통해 ResultSet 객체를 받아옵니다.
			//rs는 SELECT문의 쿼리 실행 결과 전체를 들고 있다.
			rs = pstmt.executeQuery();
			
			/*
			- SELECT 쿼리문의 실행 결과, 조회할 데이터가 단 한 줄이라도 존재한다면
			rs 객체의 next() 메서드는 true값을 리턴하면서 해당 해을 지목합니다.
			그렇기 때문에 rs에게 데이터를 읽어오실 때는 반드시 next()를 먼저 호출해서
			데이터의 존재 유무부터 물어보셔야 합니다.
			next() 메서드를 호출하셔야만 행 하나가 지목되면서 데이터를 불러들일 수 있다.
			*/
			
			//조회할 데이터 행의 개수가 여러 개라면 반복문을 이용해서 처리하는게 좋겠죠?
			//만약 조회할 데이터가 한 행이라면 굳이 반복문 열 필요 없이 if문으로 처리합니다.
			int count = 0;
			while(rs.next()) {
				/*
				- SELECT의 실행 결과 컬럼을 읽어오려면
				rs의 getString(), getInt(), getDouble()...의
				메서드를 사용해서 리턴받습니다. (컬럼의 타입에 따라)
				*/
				String id = rs.getString("mem_id"); //컬럼명!
				String pw = rs.getString("mem_pw");
				String name = rs.getString("mem_name");
				int age = rs.getInt("mem_age");
				
				//LocalDateTime -> Timestamp: Timestamp.valueOf(LocalDateTime);
				//Timestamp -> LocalDateTime: Timestamp.LocalDateTime.toLocalDateTime();
				LocalDateTime regDate = rs.getTimestamp("mem_regdate").toLocalDateTime();
				count++;
			
				System.out.printf("# 아이디: %s\n# 비밀번호: %s\n# 이름: %s\n# 나이: %d세\n# 가입일: %s\n", id, pw, name, age, regDate);
				System.out.println("------------------------------------------------------");
			
			}
			System.out.println("조회된 행의 개수: " + count + "개");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
