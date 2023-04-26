package com.java.order.service;

import com.java.common.AppService;
import com.java.movie.domain.Movie;
import com.java.movie.repository.MovieRepository;
import com.java.movie.repository.MovieRepositoryImpl;
import com.java.order.domain.Order;
import com.java.user.domain.User;
import com.java.user.repository.UserRepository;
import com.java.user.repository.UserRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.java.ui.AppUi.*;

public class OrderService implements AppService {

    private final UserRepository userRepository = new UserRepositoryImpl();
    private final MovieRepository movieRepository = new MovieRepositoryImpl();

    @Override
    public void start() {
        while (true) {
            orderManagementScreen();
            int selection = inputInteger();

            switch (selection) {
                case 1:
                    processOrderDvd();
                    break;
                case 2:
                    processReturnDvd();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("메뉴를 다시 입력하세요.");
            }
            System.out.println("\n====== 계속 진행하려면 ENTER를 누르세요 ======");
            inputString();
        }
    }

    //DVD 대여 서비스 비즈니스 로직
    private void processOrderDvd() {
        while (true) {
            System.out.println("\n============================ 대여관리 시스템을 실행합니다. ============================");
            System.out.println("[ 1. 대여 가능 DVD 목록 보기 | 2. 대여중인 영화 반납예정일 확인하기 | 3. 이전으로 돌아가기 ]");
            System.out.print(">>> ");
            int selection = inputInteger();

            switch (selection) {
                case 1:
                    showRentalPossibleList();
                    break;
                case 2:
                    showRentalImpossibleList();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }
        }
    }

    //대여 가능한 DVD 목록 보기
    private void showRentalPossibleList() {
        List<Movie> movieList = movieRepository.searchByRental(true);
        int count = movieList.size();

        while (true) {
            if (count > 0) {
                System.out.printf("\n================================검색 결과(총 %d건)===================================\n", count);
                for (Movie movie : movieList) {
                    System.out.println(movie);
                }
                System.out.println("=====================================================================================");
                System.out.println("## 대여할 DVD의 번호를 입력해주세요. 이전으로 돌아가려면 0을 입력하세요.");
                System.out.print(">>> ");
                int movieNumber = inputInteger();

                if (movieNumber != 0) {
                    rentalProcess(movieNumber);
                }
                return;
            } else {
                System.out.println("\n## 대여 가능한 DVD가 없습니다. ㅠㅠ");
            }
        }
    }

    //대여주문을 수행할 로직
    private void rentalProcess(int movieNumber) {

        Movie rentalMovie = movieRepository.searchMovie(movieNumber);
        System.out.printf("\n## [%s] DVD를 대여합니다.\n", rentalMovie.getMovieName());
        System.out.println("## 대여자의 이름을 입력하세요.");
        System.out.print(">>> ");
        String name = inputString();

        List<User> users = userRepository.findByUserName(name);

        int count = users.size();
        if (count > 0) {
            List<Integer> userNums = new ArrayList<>();
            System.out.println("\n====================== 회원 정보 =======================");
            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber());
            }
            System.out.println("=========================================================");
            System.out.println("## 대여할 회원의 회원번호을 입력하세요.");
            System.out.print(">>> ");
            int userNumber = inputInteger();

            if (userNums.contains(userNumber)) {
                //대여 완료 처리
                User rentalUser = userRepository.findByUserNumber(userNumber); //렌탈 유저 정보 획득
                rentalMovie.setRental(true); //대여상태 대여중으로 변경
                rentalMovie.setRentalUser(rentalUser); //영화객체에 렌탈유저 등록

                rentalUser.setTotalPaying(rentalMovie.getCharge()); //회원 총 결제금액 갱신

                //새로운 주문 생성
                Order newOrder = new Order(rentalUser, rentalMovie);
                rentalUser.addOrder(newOrder); //회원 대여목록에 추가

                String phoneNumber = rentalUser.getPhoneNumber();

                System.out.printf("\n## [%s(%s)회원님] 대여 처리가 완료되었습니다. 감사합니다!\n"
                        , rentalUser.getUserName(), phoneNumber.substring(phoneNumber.lastIndexOf("-") + 1));
                System.out.printf("## 현재 등급: [%s], 총 누적 결제액: %d원\n", rentalUser.getGrade(), rentalUser.getTotalPaying());

            } else {
                System.out.println("\n## 검색된 회원의 번호를 입력하세요.");
            }
        } else {
            System.out.println("\n## 대여자 정보가 없습니다.");
        }

    }

    //대여 불가능한 DVD 목록 보기
    private void showRentalImpossibleList() {
        List<Movie> movieList = movieRepository.searchByRental(false);
        int count = movieList.size();

        if (count > 0) {
            System.out.printf("\n================================검색 결과(총 %d건)===================================\n", count);
            for (Movie movie : movieList) {
                User rentalUser = movie.getRentalUser();
                String phoneNumber = rentalUser.getPhoneNumber();
                String lastPhoneNumber = phoneNumber.substring(phoneNumber.lastIndexOf("-") + 1);
                System.out.printf("## 영화명: %s, 현재 대여자: %s(%s), 반납예정일: %s\n"
                , movie.getMovieName(), rentalUser.getUserName(),
                        lastPhoneNumber, rentalUser.getOrder(movie.getSerialNumber()).getReturnDate());
            }
            System.out.println("=====================================================================================");

        } else {
            System.out.println("\n## 대여 불가능한 DVD가 없습니다.");
        }
    }

    //DVD 반납 서비스 비즈니스 로직
    private void processReturnDvd() {
        System.out.println("\n============================ 반납관리 시스템을 실행합니다. ============================");
        System.out.println("## 반납자의 이름을 입력하세요.");
        System.out.print(">>> ");

        String name = inputString();
        List<User> users = userRepository.findByUserName(name);

        int count = users.size();
        if (count > 0) {
            List<Integer> userNums = new ArrayList<>();
            System.out.printf("\n================================검색 결과(총 %d건)===================================\n", count);
            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber());
            }
            System.out.println("========================================================================================");
            System.out.println("## 반납자의 회원번호를 입력하세요.");
            System.out.print(">>> ");
            int userNumber = inputInteger();

            showReturnedList(userNums, userNumber);
        } else {
            System.out.println("\n## 반납자의 정보가 없습니다.");
        }
    }

    private void showReturnedList(List<Integer> userNums, int userNumber) {
        if (userNums.contains(userNumber)) {
            User returnUser = userRepository.findByUserNumber(userNumber);
            System.out.printf("\n## 현재 [%s]회원님의 대여 목록입니다.\n", returnUser.getUserName());
            System.out.println("============================================================================================");
            Map<Integer, Order> orderList = returnUser.getOrderList();
            for (int key : orderList.keySet()) {
                System.out.println(orderList.get(key));
            }
            System.out.println("============================================================================================");
            System.out.println("## 반납할 DVD의 번호를 입력하세요.");
            System.out.print(">>> ");
            int returnMovieSerialNumber = inputInteger();

            if (orderList.containsKey(returnMovieSerialNumber)) {
                //반납 처리
                Movie returnMovie = movieRepository.searchMovie(returnMovieSerialNumber);
                returnMovie.setRentalUser(null); //해당 영화정보에서 회원정보 삭제
                returnMovie.setRental(false); //대여상태 대여가능으로 변경
                Order removeOrder = returnUser.removeOrder(returnMovieSerialNumber);//해당 회원의 대여 목록에서 제거

                int overdueCharge = removeOrder.getOverdueCharge();
                if (overdueCharge > 0) {
                    System.out.printf("\n## 반납이 완료되었습니다. %d원을 결제해주세요.\n", overdueCharge);
                } else {
                    System.out.println("\n## 반납이 완료되었습니다. 즐거운 하루되세요!");
                }
            } else {
                System.out.println("\n# 해당 DVD는 반납대상이 아닙니다.");
            }

        } else {
            System.out.println("\n## 검색된 회원의 번호를 입력하세요.");
        }
    }
}
