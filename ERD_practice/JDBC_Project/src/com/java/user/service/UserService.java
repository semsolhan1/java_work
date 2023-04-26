package com.java.user.service;

import com.java.common.AppService;
import com.java.user.domain.Grade;
import com.java.user.domain.User;
import com.java.user.repository.UserRepository;
import com.java.user.repository.UserRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

import static com.java.ui.AppUi.*;

public class UserService implements AppService {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void start() {
        while (true) {
            userManagementScreen();
            int selection = inputInteger();

            switch (selection) {
                case 1:
                    join();
                    break;
                case 2:
                    showSearchResult();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("메뉴를 다시 입력하세요.");
            }
            System.out.println("\n====== 계속 진행하려면 ENTER를 누르세요 ======");
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

        User newUser = new User(name, phone, Grade.BRONZE);

        userRepository.addUser(newUser);
        System.out.printf("\n### [%s]님의 회원 가입이 완료되었습니다.\n", newUser.getUserName());
    }


    //회원 이름으로 검색 비즈니스 로직
    private List<User> searchUser() {
        System.out.println("\n### 조회할 회원의 이름을 입력하세요.");
        System.out.print(">>> ");
        String name = inputString();
        return userRepository.findByUserName(name);
    }

    private void showSearchResult() {
        List<User> users = searchUser();

        if (users.size() > 0) {
            System.out.println("\n============================= 회원 조회 결과 =============================");
            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.println("\n### 조회 결과가 없습니다.");
        }
    }

    //회원 탈퇴 비즈니스 로직
    private void deleteUser() {
        List<User> users = searchUser();

        //삭제 대상 회원 번호만 저장할 리스트
        List<Integer> userNums = new ArrayList<>();

        if (users.size() > 0) {

            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber());
            }
            System.out.println("\n## 탈퇴할 회원의 번호를 입력하세요.");
            System.out.print(">>> ");
            int delUserNum = inputInteger();

            if (userNums.contains(delUserNum)) {
                User delUser = userRepository.deleteUser(delUserNum);
                System.out.printf("\n## %s[%s] 님의 회원정보가 정상 삭제되었습니다.\n"
                        , delUser.getUserName(), delUser.getPhoneNumber());
            } else {
                System.out.println("\n## 검색한 회원의 회원번호로만 삭제할 수 있습니다.");
            }
        } else {
            System.out.println("\n### 조회 결과가 없습니다.");
        }

    }
}
