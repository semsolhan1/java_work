package com.spring.db.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.db.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {

	//내부 클래스 선언
	class BoardMapper implements RowMapper<BoardVO> {
		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new BoardVO(
						rs.getInt("board_no"),
						rs.getString("writer"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getTimestamp("reg_date").toLocalDateTime()
					);
		}	
	}
	
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public void insertArticle(BoardVO vo) {
		String sql = "INSERT INTO jdbc_board (writer, title, content) "
				+ "VALUES(?,?,?)";
		template.update(sql, vo.getWriter(), vo.getTitle(), vo.getContent());
	}

	@Override
	public List<BoardVO> getArticles() {
		String sql = "SELECT * FROM jdbc_board ORDER BY board_no DESC";
		return template.query(sql, new BoardMapper());
	}

	@Override
	public BoardVO getArticle(int bno) {
		String sql = "SELECT * FROM jdbc_board WHERE board_no = ?";
		return template.queryForObject(sql, new BoardMapper(), bno);
	}

	@Override
	public void deleteArticle(int bno) {
		String sql = "DELETE FROM jdbc_board WHERE board_no=?";
		template.update(sql, bno);
	}

	@Override
	public void updateArticle(BoardVO vo) {
		String sql = "UPDATE jdbc_board "
				+ "SET writer=?, title=?, content=? "
				+ "WHERE board_no=?";
		template.update(sql, vo.getWriter(), vo.getTitle(), 
						vo.getContent(), vo.getBoardNo());
	}

}














