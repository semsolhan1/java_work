package com.myweb.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;

public class GetListService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardVO> boardList = dao.listBoard();
		
		//왜 session을 사용하지 않고 request를 사용하는가?
		//데이터베이스로부터 받아온 글 목록은 일시적인 데이터입니다.
		//글 목록은 언제든 변할 수 있습니다.
		//그러한 데이터를 굳이 session에 담아서 유지할 필요가 있을까요?
		//응답이 나가고 나서 자동으로 소멸할 수 있도록 request에 담아서
		//화면으로 전달하고자 합니다.
		request.setAttribute("boardList", boardList);

	}

}
