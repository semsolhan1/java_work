package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IBoardService {

	void execute(HttpServletRequest request, HttpServletResponse response);
	
}
