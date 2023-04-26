package com.java.main;

import com.java.common.AppService;
import com.java.movie.service.MovieService;
import com.java.order.service.OrderService;
import com.java.user.service.UserService;

public class AppController {

    private AppService service;

    //시스템을 정해주는 기능
    public void chooseSystem(int selectNumber) {
        switch (selectNumber) {
            case 1:
                service = new UserService();
                break;
            case 2:
                service = new OrderService();
                break;
            case 3:
                service = new MovieService();
                break;
            case 4:
                System.out.println("# 프로그램을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("# 메뉴를 다시 입력하세요!");
        }

        service.start();
    }
}
