package com.java.movie.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.common.Condition;
import com.java.common.DataBaseConnection;
import com.java.movie.domain.Movie;

public class MovieRepository {

	private DataBaseConnection connection 
	= DataBaseConnection.getInstance();

	public void addMovie(Movie movie) {
		String sql = "INSERT INTO movie "
				+ "(serial_number, movie_name, nation, pub_year) "
				+ "VALUES(movie_seq.NEXTVAL,?,?,?)";
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, movie.getMovieName());
			pstmt.setString(2, movie.getNation());
			pstmt.setInt(3, movie.getPubYear());

			if(pstmt.executeUpdate() == 1) {
				System.out.printf("\n### [%s] 영화가 신규 등록되었습니다.\n", movie.getMovieName());
			} else {
				System.out.println("신규 영화 등록 실패!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Movie> searchMovieList(Condition condition, String keyword) {
		String sql = "";
		List<Movie> movieList = new ArrayList<>();

		switch (condition) {
		case MOVIE_NAME: case NATION: case PUB_YEAR:
			sql = "SELECT * FROM movie WHERE " + condition.toString() + " LIKE " + keyword;	
			break;		
		case ALL:
			sql = "SELECT * FROM movie";
		}
		System.out.println("sql: " + sql);

		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while(rs.next()) {
				Movie movie = new Movie(
						rs.getInt("serial_number"),
						rs.getString("movie_name"),
						rs.getString("nation"),
						rs.getInt("pub_year"),
						Boolean.parseBoolean(rs.getString("rental")),
						rs.getInt("charge")
						);
				movieList.add(movie);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return movieList;
	}

	public List<Movie> searchByRental(String rental) {
		List<Movie> movieList = new ArrayList<>();
		String sql = "";
		if(rental.equals("true")) {
			sql = "SELECT * FROM movie WHERE rental = 'true'";
		} else {
			sql = "SELECT * FROM movie WHERE rental = 'false'";
		}
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while(rs.next()) {
				Movie movie = new Movie(
							rs.getInt("serial_number"),
							rs.getString("movie_name"),
							rs.getString("nation"),
							rs.getInt("pub_year"),
							Boolean.parseBoolean(rs.getString("rental")),
							rs.getInt("charge")
						);
				movieList.add(movie);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return movieList;
	}

}
















