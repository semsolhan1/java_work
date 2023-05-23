package com.spring.myweb.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.myweb.command.UserVO;
import com.spring.myweb.user.mapper.IUserMapper;
import com.spring.myweb.util.PageVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService implements IUserService {
	
	@Autowired
	private IUserMapper mapper;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public int idCheck(String id) {
		return mapper.idCheck(id);
	}

	@Override
	public void join(UserVO vo) {
		//회원 비밀번호를 암호화 인코딩	
		log.info("암호화 하기 전 비번: " + vo.getUserPw());
		
		//비밀번호를 암호화 해서 vo 객체에 다시 저장하기.
		String securePw = encoder.encode(vo.getUserPw());
		log.info("암호화 후 비번: " + securePw);
		vo.setUserPw(securePw);
		
		mapper.join(vo);
	}

	@Override
	public String login(String id, String pw) {
		//id 정보를 기반으로 회원의 정보를 조회
		String dbPw = mapper.login(id); //DB에서 가져온 암호화 된 비밀번호.
		if(dbPw != null) {
			//날것의 비밀번호와 암호화된 비밀번호의 일치 여부를 알려주는 matches()
			if(encoder.matches(pw, dbPw)) {
				return id;
			}
		}
		return null;
	}

	@Override
	public UserVO getInfo(String id, PageVO vo) {

		return mapper.getInfo(id, vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub

	}

}














