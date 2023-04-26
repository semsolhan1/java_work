package com.java.movie.repository;

import com.java.movie.domain.Movie;
import com.java.common.Search;

import java.util.List;

public interface MovieRepository {

    //영화 추가
    void addMovie(Movie movie);

    //영화 검색
    List<Movie> searchMovieList(Search search);

    //대여상태에 따른 영화 검색
    List<Movie> searchByRental(boolean possible);

    //영화 1개 검색
    Movie searchMovie(int movieSerialNumber);

    //영화 삭제
    void removeMovie(int serialNumber);
}
