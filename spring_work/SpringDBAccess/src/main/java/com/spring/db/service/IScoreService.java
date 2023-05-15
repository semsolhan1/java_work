package com.spring.db.service;

import java.util.List;

import com.spring.db.model.ScoreVO;

public interface IScoreService {
	
	//점수 등록 기능
	void insertScore(ScoreVO vo);
	
	//점수 전체 조회 기능
	List<ScoreVO> selectAllScores();
	
	//점수 삭제 기능
	void deleteScore(int num);
	
	//점수 개별 조회 기능
	ScoreVO selectOne(int num);
	
}














