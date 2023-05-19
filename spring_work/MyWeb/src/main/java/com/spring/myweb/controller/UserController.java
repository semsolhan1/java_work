package com.spring.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.myweb.command.UserVO;
import com.spring.myweb.user.service.IUserService;
import com.spring.myweb.util.MailSenderService;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private IUserService service;
	@Autowired
	private MailSenderService mailService;
	
	//회원가입 페이지로 이동
	@GetMapping("/userJoin")
	public void userJoin() {}
	
	//아이디 중복 확인(비동기)
	@ResponseBody
	@PostMapping("/idCheck")
	public String idCheck(@RequestBody String userId) {
		log.info("화면단으로부터 전달된 값: " + userId);
		
		int result = service.idCheck(userId);
		if(result == 1) return "duplicated";
		else return "ok";
	}
	
	//이메일 인증
	@GetMapping("/mailCheck")
	@ResponseBody
	public String mailCheck(String email) {
		log.info("이메일 인증 요청 들어옴: " + email);
		return mailService.joinEmail(email);
		
	}
	
	//회원 가입 처리
	@PostMapping("/join")
	public String join(UserVO vo, RedirectAttributes ra) {
		log.info("param: {}", vo.toString());
		service.join(vo);
		ra.addFlashAttribute("msg", "joinSuccess");
		return "redirect:/user/userLogin";
	}
	
	//로그인 페이지로 이동 요청
	@GetMapping("/userLogin")
	public void login() {}
	
	//로그인 요청
	@PostMapping("/userLogin")
	public void login(String userId, String userPw, Model model) {
		log.info("나는 UserController의 login이다!");
		model.addAttribute("user", service.login(userId,  userPw));
	}
	
	
	//마이페이지 이동 요청
	@GetMapping("/userMypage")
	public void userMypage() {
		
	}
	
	
	
	
	
	
}


















