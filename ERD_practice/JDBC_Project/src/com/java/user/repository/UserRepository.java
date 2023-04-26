package com.java.user.repository;

import com.java.user.domain.User;

import java.util.List;

public interface UserRepository {

    //회원 가입
    void addUser(User user);
    

    //이름으로 회원 조회
    List<User> findByUserName(String userName);

    //회원번호로 회원 조회
    User findByUserNumber(int userNumber);

    //회원 탈퇴
    User deleteUser(int userNumber);

}
