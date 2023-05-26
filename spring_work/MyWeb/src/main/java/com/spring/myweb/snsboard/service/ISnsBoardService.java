package com.spring.myweb.snsboard.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.spring.myweb.command.SnsBoardVO;
import com.spring.myweb.util.PageVO;

public interface ISnsBoardService {

	//등록
	void insert(SnsBoardVO vo, MultipartFile file);

	//목록
	List<SnsBoardVO> getList(PageVO paging);

	//상세
	SnsBoardVO getDetail(int bno);

	//삭제
	void delete(int bno);

}
