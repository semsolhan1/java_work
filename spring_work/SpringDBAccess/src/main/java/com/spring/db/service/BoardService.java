package com.spring.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.db.model.BoardVO;
import com.spring.db.repository.IBoardDAO;
import com.spring.db.repository.IBoardMapper;

@Service
public class BoardService implements IBoardService {

//	@Autowired
//	@Qualifier("boardDAO")
//	private IBoardDAO dao;
	
	@Autowired
	private IBoardMapper mapper;
	
	@Override
	public void insertArticle(BoardVO vo) {
		mapper.insertArticle(vo);
	}

	@Override
	public List<BoardVO> getArticles() {
		return mapper.getArticles();
	}

	@Override
	public BoardVO getArticle(int bno) {
		return mapper.getArticle(bno);
	}

	@Override
	public void deleteArticle(int bno) {
		mapper.deleteArticle(bno);
	}

	@Override
	public void updateArticle(BoardVO vo) {
		mapper.updateArticle(vo);
	}

}




