package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;

public class DeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDAO
			.getInstance()
			.deleteBoard(Integer.parseInt(request.getParameter("bId")));

	}

}
