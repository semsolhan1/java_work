package com.java.movie.service;

import com.java.common.AppService;
import com.java.common.Condition;
import com.java.movie.domain.Movie;
import com.java.movie.repository.MovieRepository;

import static com.java.view.AppUI.*;
import static com.java.common.Condition.*;


import java.time.LocalDateTime;
import java.util.List;

public class MovieService implements AppService {

	private final MovieRepository movieRepository = new MovieRepository();
	
	@Override
	public void start() {
		while(true) {
			movieManagementScreen();
			int selection = inputInteger();
			
			switch (selection) {
			case 1:
				insertMovieData();
				break;
			case 2:
				showSearchResult();
				break;
			case 3:
				return;

			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}
			System.out.println("\n====== 계속 진행하시려면 ENTER를 누르세요 ======");
			inputString();
		}
	}
	
	//영화 정보 추가 비즈니스 로직
	private void insertMovieData() {
		System.out.println("\n======= 영화 DVD 정보를 추가합니다. =======");
		System.out.print("# 영화명: ");
		String movieName = inputString();
		
		System.out.print("# 국가명: ");
		String nation = inputString();
		
		System.out.print("# 발매연도: ");
		int pubYear = inputInteger();
		
		Movie newMovie = new Movie();
		newMovie.setMovieName(movieName);
		newMovie.setNation(nation);
		newMovie.setPubYear(pubYear);
		
		movieRepository.addMovie(newMovie);
	}
	
	//영화 정보 검색 비즈니스 로직 
	private List<Movie> searchMovieData() {
		System.out.println("\n=============== 영화 DVD 검색 조건을 선택하세요. ===============");
		System.out.println("[ 1. 제목검색 | 2. 국가검색 | 3. 발매연도검색 | 4. 전체검색 ]");
		System.out.print(">>> ");
		int selection = inputInteger();
		
		Condition condition = ALL;
		switch (selection) {
		case 1:
			System.out.println("\n### 제목으로 검색합니다.");
			condition = MOVIE_NAME;
			break;
		case 2:
			System.out.println("\n### 국가명으로 검색합니다.");
			condition = NATION;
			break;
		case 3:
			System.out.println("\n### 발매연도로 검색합니다.");
			condition = PUB_YEAR;
			break;
		case 4:
			System.out.println("\n### 전체 정보를 검색합니다.");
			break;

		default:
			System.out.println("\n### 잘못 입력했습니다.");
		}
		
		String keyword = "";
		if(condition != ALL) {
			System.out.print("# 검색어: ");
			keyword = "'%" + inputString() + "%'";
		}
		
		return movieRepository.searchMovieList(condition, keyword);	
	}
	
	//영화 검색 정보 출력
	private void showSearchResult() {
		List<Movie> movies = searchMovieData();
		
		if(movies.size() > 0) {
			for(Movie m : movies) {
				System.out.println(m);
			}
			System.out.printf("\n============================ 검색 결과 (총 %d건) ============================\n", movies.size());
		} else {
			System.out.println("\n### 검색 결과가 없습니다.");
		}
		
	}
	
	
	
	
}














