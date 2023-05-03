package com.myweb.user.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.user.model.UserDAO;
import com.myweb.user.model.UserVO;


public class JoinService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("id");
		UserDAO dao = UserDAO.getInstance();

		response.setContentType("text/html; charset=UTF-8");
		String htmlCode;
		PrintWriter out;
		try {
			out = response.getWriter();

			if(dao.confirmId(id)) {
				//아이디가 중복된 경우 브라우저로 바로 응답.
				htmlCode = "<script>\r\n"
						+ "alert('아이디가 중복되었습니다.');\r\n"
						+ "history.back();\r\n"
						+ "</script>";
				out.print(htmlCode);
				out.flush();
				return;
			} else {
				//아이디가 중복되지 않은 경우 회원가입 계속 진행.
				UserVO vo = new UserVO(
						id,
						request.getParameter("pw"),
						request.getParameter("name"),
						request.getParameter("email"),
						request.getParameter("address")
						);

				dao.insertUser(vo);
				htmlCode = "<script>\r\n"
						+ "                alert('회원가입을 환영합니다!');\r\n"
						+ "                location.href='/MyWeb/loginPage.user';\r\n"
						+ "                </script>";
				out.print(htmlCode);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}


}