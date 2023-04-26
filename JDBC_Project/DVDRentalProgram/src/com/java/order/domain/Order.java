package com.java.order.domain;

import java.time.LocalDateTime;

/*
 CREATE TABLE order_history (
    order_no NUMBER(5) PRIMARY KEY,
    user_number NUMBER(5) NOT NULL,
    serial_number NUMBER(5) NOT NULL,
    order_date DATE DEFAULT sysdate,
    return_date DATE DEFAULT sysdate + 3
);

CREATE SEQUENCE order_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 100000
    NOCYCLE
    NOCACHE;
 */

public class Order {
	
	private int orderNo;
	private int userNumber;
	private int serialNumber;
	private LocalDateTime orderDate;
	private LocalDateTime returnDate;
	
	public Order() {}

	public Order(int orderNo, int userNumber, int serialNumber, LocalDateTime orderDate, LocalDateTime returnDate) {
		super();
		this.orderNo = orderNo;
		this.userNumber = userNumber;
		this.serialNumber = serialNumber;
		this.orderDate = orderDate;
		this.returnDate = returnDate;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	
	

}


















