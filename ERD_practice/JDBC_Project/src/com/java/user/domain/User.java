package com.java.user.domain;

import com.java.order.domain.Order;

import java.util.HashMap;
import java.util.Map;

public class User {

    public static final int VIP_PRICE = 10000;
    public static final int GOLD_PRICE = 7000;
    public static final int SILVER_PRICE = 5000;

    private static int sequence; //회원 누적 순차번호

    private int userNumber;
    private String userName;
    private String phoneNumber;
    private int totalPaying;
    private Grade grade;
    private final Map<Integer, Order> orderList;

    public User(String userName, String phoneNumber, Grade grade) {
        this.userNumber = ++sequence;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
        this.orderList = new HashMap<>();
    }

    //대여 목록 추가 기능
    public void addOrder(Order order) {
        this.orderList.put(order.getMovie().getSerialNumber(), order);
    }
    //반납시 대여 목록 제거 기능
    public Order removeOrder(int serialNumber) {
        return this.orderList.remove(serialNumber);
    }

    //대여 목록에서 대여 정보 얻기 기능
    public Order getOrder(int serialNumber) {
        return this.orderList.get(serialNumber);
    }

    //전체 대여 목록 얻기
    public Map<Integer, Order> getOrderList() {
        return this.orderList;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalPaying() {
        return totalPaying;
    }

    public void setTotalPaying(int charge) {
        this.totalPaying += charge;

        //총 결제액에 따라 회원 등급 조정
        if (totalPaying >= VIP_PRICE) {
            this.grade = Grade.VIP;
        } else if (totalPaying >= GOLD_PRICE) {
            this.grade = Grade.GOLD;
        } else if (totalPaying >= SILVER_PRICE) {
            this.grade = Grade.SILVER;
        }
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  "## 회원번호: " + userNumber +
                        ", 회원명: " + userName +
                        ", 전화번호: " + phoneNumber  +
                        ", 총 결제금액: " + totalPaying + "원" +
                        ", 등급: " + grade;
    }
}
