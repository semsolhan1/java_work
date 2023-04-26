package com.java.order.service;

import static com.java.view.AppUI.inputInteger;
import static com.java.view.AppUI.inputString;
import static com.java.view.AppUI.orderManagementScreen;

import java.util.ArrayList;
import java.util.List;

import com.java.common.AppService;
import com.java.movie.domain.Movie;
import com.java.movie.repository.MovieRepository;
import com.java.order.repository.OrderRepository;
import com.java.user.domain.User;
import com.java.user.repository.UserRepository;

public class OrderService implements AppService {

	private final UserRepository userRepository = new UserRepository();
	private final MovieRepository movieRepository = new MovieRepository(); 
	private final OrderRepository orderRepository = new OrderRepository();
	
	@Override
	public void start() {
		orderManagementScreen();
		int selection = inputInteger();
		
		switch (selection) {
		case 1:
			processOrderDvd();
			break;
		case 2:
			
			break;
		case 3:
			return;

		default:
			System.out.println("메뉴를 다시 입력하세요.");
		}
		System.out.println("\n====== 계속 진행하시려면 ENTER를 누르세요 ======");
		inputString();		
	}
	
	//DVD 대여 서비스 비즈니스 로직
	private void processOrderDvd() {
		while(true) {
			System.out.println("\n=============== 대여 관리 시스템을 실행합니다. ===============");
			System.out.println("[ 1. 대여 가능 DVD 목록 보기 | 2. 대여중인 영화 반납예정일 확인 | 3. 이전으로 돌아가기 ]");
			System.out.print(">>> ");
			int selection = inputInteger();
			
			switch (selection) {
			case 1:
				showRentalPossibleList();
				break;
			case 2:
				
				break;
			case 3:
				return;

			default:
				System.out.println("### 메뉴를 잘못 입력하셨습니다.");
			}
		}
	}

	// 대여 가능한 DVD 목록 보기
	private void showRentalPossibleList() {
		List<Movie> movieList = movieRepository.searchByRental("true");
		int count = movieList.size();
		
		if(count > 0) {
			System.out.printf("\n============================ 검색 결과 (총 %d건) ============================\n", count);
			for(Movie m : movieList) {
				System.out.println(m);
			}
			System.out.println("==========================================================================");
			System.out.println("### 대여할 DVD의 번호를 입력해 주세요. 이전으로 돌아가려면 0을 입력하세요.");
			System.out.print(">>> ");
			int movieNumber = inputInteger();
			
			if(movieNumber != 0) {
				rentalProcess(movieNumber);
			}
			return;
			
		} else {
			System.out.println("\n### 대여 가능한 DVD가 없습니다.");
		}
		
	}

	//대여 로직을 수행할 메서드
	private void rentalProcess(int movieNumber) {
		System.out.println("### 대여자의 이름을 입력하세요.");
		System.out.print(">>> ");
		String name = inputString();
		
		List<User> users = userRepository.findByUserName(name);
		
		if(users.size() > 0) {
			List<Integer> userNums = new ArrayList<>();
			System.out.println("========================= 회원 정보 =========================");
			for(User u : users) {
				System.out.println(u);
				userNums.add(u.getUserNumber());
			}
			System.out.println("===========================================================");
			System.out.println("\n### 대여할 회원의 번호를 입력하세요.");
			System.out.print(">>> ");
			int userNumber = inputInteger();
			if(userNums.contains(userNumber)) {
				orderRepository.addOrder(movieNumber, userNumber);
			} else {
				System.out.println("\n### 검색이 된 회원의 번호를 입력해야 합니다.");
			}
			
			
			
		} else {
			System.out.println("\n### 대여자 정보가 없습니다.");
		}
		
	}
	
	
	
	
	
}
















