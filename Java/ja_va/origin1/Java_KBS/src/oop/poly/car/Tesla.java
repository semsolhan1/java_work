package oop.poly.car;

public class Tesla extends Car {
	
	@Override
	void run() {
		System.out.println("테슬라가 달립니다~");
	}
	
	void enterMembership() {
		System.out.println("테슬라 멤버쉽에 가입합니다.");
	}

}
