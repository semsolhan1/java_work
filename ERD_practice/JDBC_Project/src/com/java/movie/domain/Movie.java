package com.java.movie.domain;

import com.java.user.domain.User;

import java.time.LocalDate;

public class Movie {

    private static int movieSequence;

    private int serialNumber;
    private String movieName;
    private String nation;
    private int pubYear; //발매년도
    private int charge;
    private boolean rental;
    private User rentalUser; //현재 대여자 정보




    public Movie(String movieName, String nation, int pubYear) {
        this.serialNumber = ++movieSequence;
        this.movieName = movieName;
        this.nation = nation;
        this.pubYear = pubYear;
        this.charge = ChargePolicy.calculateDvdCharge(this);
    }

    public static int getMovieSequence() {
        return movieSequence;
    }

    public static void setMovieSequence(int movieSequence) {
        Movie.movieSequence = movieSequence;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean isRental() {
        return rental;
    }

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    public User getRentalUser() {
        return rentalUser;
    }

    public void setRentalUser(User rentalUser) {
        this.rentalUser = rentalUser;
    }

    @Override
    public String toString() {
        String rental = this.rental ? "대여중" : "대여가능";
        return
                "## DVD번호: " + serialNumber +
                ", 영화명: " + movieName +
                ", 국가명: " + nation +
                ", 발매연도: " + pubYear + "년" +
                ", 대여료: " + charge + "원" +
                ", 대여상태: " + rental;
    }
}
