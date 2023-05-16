package com.spring.myweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.myweb.command.FreeBoardVO;
import com.spring.myweb.freeboard.service.IFreeBoardService;

@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {

	@Autowired
	private IFreeBoardService service;
	
	//목록 화면
	@GetMapping("/freeList")
	public void freeList(Model model) {
		model.addAttribute("boardList", service.getList());
	}
	
	
	//글 등록 처리
	@PostMapping("/freeRegist")
	public String regist(FreeBoardVO vo) {
		service.regist(vo);
		return "redirect:/freeboard/freeList";
	}
	
	//글 상세 보기 처리
	@GetMapping("/content")
	public String getContent(int bno, Model model) {
		model.addAttribute("article", service.getContent(bno));
		return "freeboard/freeDetail";
	}
	
	//글 수정 처리
	@PostMapping("/modify")
	public String modify(FreeBoardVO vo) {
		service.update(vo);
		return "redirect:/freeboard/content?bno=" + vo.getBno();
	}
	
	//글 삭제 처리
	@PostMapping("/delete")
	public String delete(int bno) {
		service.delete(bno);
		return "redirect:/freeboard/freeList";
	}
	
}














