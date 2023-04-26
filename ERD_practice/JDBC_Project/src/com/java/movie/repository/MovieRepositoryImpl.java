package com.java.movie.repository;

import com.java.common.Condition;
import com.java.movie.domain.Movie;
import com.java.common.Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.java.common.Condition.*;

public class MovieRepositoryImpl implements MovieRepository {

    private static final Map<Integer, Movie> movieDatabase = new HashMap<>();

    static {
        //테스트 데이터 삽입
        insertTestMovieData();
    }

    //테스트 데이터 생성 및 삽입
    private static void insertTestMovieData() {
        Movie movie1 = new Movie("인터스텔라", "미국", 2014);
        Movie movie2 = new Movie("포레스트 검프", "미국", 1994);
        Movie movie3 = new Movie("너의 이름은", "일본", 2017);
        Movie movie4 = new Movie("라라랜드", "미국", 2016);
        Movie movie5 = new Movie("레옹", "프랑스", 1994);
        Movie movie6 = new Movie("어바웃 타임", "영국", 2013);
        Movie movie7 = new Movie("타이타닉", "미국", 1998);
        Movie movie8 = new Movie("인생은 아름다워", "이탈리아", 1999);
        Movie movie9 = new Movie("쇼생크 탈출", "미국", 1995);
        Movie movie10 = new Movie("기생충", "대한민국", 2019);

        movieDatabase.put(movie1.getSerialNumber(), movie1);
        movieDatabase.put(movie2.getSerialNumber(), movie2);
        movieDatabase.put(movie3.getSerialNumber(), movie3);
        movieDatabase.put(movie4.getSerialNumber(), movie4);
        movieDatabase.put(movie5.getSerialNumber(), movie5);
        movieDatabase.put(movie6.getSerialNumber(), movie6);
        movieDatabase.put(movie7.getSerialNumber(), movie7);
        movieDatabase.put(movie8.getSerialNumber(), movie8);
        movieDatabase.put(movie9.getSerialNumber(), movie9);
        movieDatabase.put(movie10.getSerialNumber(), movie10);
    }

    @Override
    public void addMovie(Movie movie) {
        movieDatabase.put(movie.getSerialNumber(), movie);
    }

    @Override
    public List<Movie> searchMovieList(Search search) {

        String keyword = search.getKeyword();
        Condition condition = search.getCondition();

        if (condition == PUB_YEAR) {
            return searchByPubYear(keyword);
        } else if (condition == NATION) {
            return searchByNation(keyword);
        } else if (condition == TITLE) {
            return searchByTitle(keyword);
        } else {
            return searchAll(keyword);
        }
    }

    //전체 검색
    private List<Movie> searchAll(String keyword) {
        List<Movie> searchedList = new ArrayList<>();
        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            searchedList.add(movie);
        }
        return searchedList;
    }


    //발매연도로 찾기
    private List<Movie> searchByPubYear(String keyword) throws NumberFormatException {
        List<Movie> searchedList = new ArrayList<>();

        int targetYear = Integer.parseInt(keyword);

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            if (movie.getPubYear() == targetYear) {
                searchedList.add(movie);
            }
        }
        return searchedList;
    }

    //국가명으로 찾기
    private List<Movie> searchByNation(String keyword) {
        List<Movie> searchedList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            if (movie.getNation().equals(keyword)) {
                searchedList.add(movie);
            }
        }
        return searchedList;
    }

    //제목으로 찾기
    private List<Movie> searchByTitle(String keyword) {
        List<Movie> searchedList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            if (movie.getMovieName().equals(keyword)) {
                searchedList.add(movie);
            }
        }
        return searchedList;
    }

    //대여 가능, 불가능한 목록 찾기
    public List<Movie> searchByRental(boolean possible) {
        List<Movie> searchedList = new ArrayList<>();

        if (possible) {
            for (int key : movieDatabase.keySet()) {
                Movie movie = movieDatabase.get(key);
                if (!movie.isRental()) {
                    searchedList.add(movie);
                }
            }
        } else {
            for (int key : movieDatabase.keySet()) {
                Movie movie = movieDatabase.get(key);
                if (movie.isRental()) {
                    searchedList.add(movie);
                }
            }
        }
        return searchedList;
    }

    @Override
    public Movie searchMovie(int movieSerialNumber) {
        return movieDatabase.get(movieSerialNumber);
    }

    @Override
    public void removeMovie(int serialNumber) {
        movieDatabase.remove(serialNumber);
    }
}
