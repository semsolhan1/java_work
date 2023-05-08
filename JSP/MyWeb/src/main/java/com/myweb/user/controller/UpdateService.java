package com.myweb.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.user.model.UserDAO;
import com.myweb.user.model.UserVO;
import com.myweb.user.service.IUserService;

public class UpdateService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		/*
		1. form에서 넘어오는 데이터(파라미터)들 가져오기
		2. 데이터를 UserVO로 포장하기
		3. dao의 updateUser()를 호출해서 회원정보 수정 진행하기
		4. 수정된 정보로 세션 데이터를 교환(덮어 씌우기)
		5. alert()을 이용해서 사용자에게 응답을 주고 마이페이지로 이동.
		*/
		
//		UserVO vo = new UserVO(
//				request.getParameter("id"),
//				null,
//				request.getParameter("name"),
//				request.getParameter("email"),
//				request.getParameter("address")
//				);
//		vo.setUserId(request.getParameter("id"));
		
		UserVO vo = new UserVO();
        vo.setUserId(request.getParameter("id"));
        vo.setUserName(request.getParameter("name"));
        vo.setUserEmail(request.getParameter("email"));
        vo.setUserAddress(request.getParameter("address"));
        
        UserDAO dao = UserDAO.getInstance();
        dao.updateUser(vo);
        
        request.getSession().setAttribute("user", dao.getUserInfo(vo.getUserId()));
        response.setContentType("text/html; charset=UTF-8");
        
        try {
            PrintWriter out = response.getWriter();
            String htmlCode = "<script>\r\n"
                    + "                alert('회원 정보가 수정되었습니다.');\r\n"
                    + "                location.href='/MyWeb/myPage.user';\r\n"
                    + "                </script>";
            out.print(htmlCode);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}