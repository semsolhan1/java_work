package com.java.user.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.common.DataBaseConnection;
import com.java.user.domain.Grade;
import com.java.user.domain.User;

public class UserRepository {
	
	//커넥션 객체 받아오기
	private DataBaseConnection connection = 
			DataBaseConnection.getInstance();
		
	//회원 추가
	public void addUser(User user) {
		System.out.println("repository: " + user);
		String sql = "INSERT INTO users "
				+ "(user_number, user_name, phone_number) "
				+ "VALUES(users_seq.NEXTVAL,?,?)";
		
		/*
		 # try with Resources
		 - 자바 1.8 이후에 사용할 수 있는 문법.
		 - try문에 자원 객체를 전달하면, try가 끝날 경우 
		   자동으로 자원을 종료해주는 기능. (finally에서 따로 close() 안해도 됨)
		 - 자원을 종료하려는 객체가 AutoCloseable 인터페이스의 구현체여야 합니다.
		 */
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPhoneNumber());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("회원가입이 정상 처리되었습니다.");
			} else {
				System.out.println("회원 가입에 실패했습니다. 관리자에게 문의하세요.");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} 	
	}
	
	//회원의 이름으로 정보 검색
	public List<User> findByUserName(String userName) {
		List<User> userList = new ArrayList<>();
		String sql = "SELECT * FROM users WHERE user_name=?";
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, userName);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Grade grade = Grade.valueOf(rs.getString("grade"));
				User user = new User(
							rs.getInt("user_number"),
							rs.getString("user_name"),
							rs.getString("phone_number"),
							rs.getInt("total_paying"),
							grade
						);
				userList.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return userList;
	}

	public void deleteUser(int delUserNum) {
		String sql = "DELETE FROM users WHERE user_number=?";
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, delUserNum);
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("\n### 회원정보가 정상 삭제되었습니다.");
			} else {
				System.out.println("\n### 검색한 회원의 회원번호으로만 삭제가 가능합니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}









