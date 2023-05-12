package com.spring.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.db.model.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	
	//글 작성 화면을 열어주는 메서드
    @GetMapping("/write")
    public void write() {
        System.out.println("/board/write: GET");
    }

    //작성된 글 등록 처리 요청
    //메서드 이름은 write() 입니다.
    //작성된 글을 DB에 등록 후 /board/list.jsp파일로 응답할 수 있도록
    //(글 목록 보여달라는 요청이 자동으로 들어올 수 있도록) 적절히 처리해 보세요.
    @PostMapping("/list")
    public String write(BoardVO vo) {
    	System.out.println("/board/list: POST");
    	System.out.println("vo: " + vo);
    	return "board/list";
    }
    

    //글 목록 화면 요청
    //메서드 이름 -> list()
    //DB 대용 리스트에서 가지고 온 글 목록을 list.jsp 파일로 전달해서
    //브라우저에 글 목록을 띄워 주시면 되겠습니다.
    //글 목록을 table을 사용해서 간단히 만들어 주세요. (글 번호는 인덱스 이용해서 달아주세요.)
    @GetMapping("/list")
    public String list(BoardVO vo) {
    	System.out.println("/board/list: GET");
    	return "board/list";
    }

    //글 내용 상세보기 요청 처리 메서드
    //메서드 이름 -> content, 요청 url -> /content
    //DB 역할을 하는 리스트에서 글 번호에 해당하는 글 객체를 content.jsp로 보내주세요.
    //content.jsp에서 해당 글 정보를 모두 출력해 주세요. (글 번호도 같이)
    @PostMapping("/content")
    public void content(Model model) {
    	System.out.println("/board/content: POST");
    	
    }

    //글 수정하기 화면으로 이동 요청
    //메서드 이름은 modify(), url: /board/modify -> GET
    //수정하고자 하는 글 정보를 모두 받아와서 modify.jsp로 보내 주세요.(글 번호 같이)
    @GetMapping("/modify")
    public String modify() {
    	System.out.println("/board/modify: GET");
    	return "board/modify";
    }

    //modify.jsp를 생성해서 form태그에 사용자가 처음에 작성했던 내용이 드러나도록
    //배치해 주시고 수정을 받아 주세요.
    //수정 처리하는 메서드: modify(), 요청 url: /modify -> POST
    //수정 처리 완료 이후 방금 수정한 글의 상세보기 요청이 다시 들어올 수 있도록 작성하세요.
    

    //삭제는 알아서 작성해 주세요. (삭제 클릭하면 해당 글이 삭제될 수 있도록)
}
