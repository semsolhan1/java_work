package com.java.order.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//연체 정책
public class OverduePolicy {

    private static final int BASE_OVERDUE_CHARGE = 300;

    //연체 일수 계산
    public static int calculateOverdueDay(Order order) {
        LocalDate now = LocalDate.now();
        LocalDate returnDate = order.getReturnDate();

        if (returnDate.isBefore(now)) {
            return (int) ChronoUnit.DAYS.between(returnDate, now);
        }
        return 0;
    }


    //연체료 계산
    public static int calculateOverdueCharge(Order order) {
        int overdueDay = calculateOverdueDay(order);
        return overdueDay * BASE_OVERDUE_CHARGE;
    }
}
