package oop.poly.casting;

public class Child extends Parent {

	public int n2; //자식 고유의 멤버 변수
	
	@Override
	public void method1() {
		System.out.println("재정의한 1번 메서드 호출!");
	}
	
	public void method3() {
		System.out.println("자식 고유의 3번 메서드 호출!");
	}
	
}
