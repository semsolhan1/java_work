package com.java.user.service;

import com.java.common.AppService;
import static com.java.view.AppUI.*;

public class UserService implements AppService {

	@Override
	public void start() {
		while(true) {
			userManagementScreen();
			int selection = inputInteger();
			
			switch (selection) {
			case 1:
				join();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				return; //메인 화면으로 돌아가기

			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER를 누르세요 ======");
			inputString();
		}
	}
	
	//회원 추가 비즈니스 로직
	private void join() {
		
		System.out.println("\n====== 회원 가입을 진행합니다. ======");
		System.out.print("# 회원명: ");
		String name = inputString();
		
		System.out.print("# 전화번호: ");
		String phone = inputString();
		
		
		
	}
	
	
	
	
	

}













