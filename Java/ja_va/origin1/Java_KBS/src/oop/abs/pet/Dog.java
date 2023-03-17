package oop.abs.pet;

public class Dog extends Pet {

	public Dog(String name, String kind, int age) {
		super(name, kind, age);
	}

	@Override
	public void feed() {
		System.out.println("강아지는 사료를 와구와구 먹어요");
	}

	@Override
	public void takeNap() {
		System.out.println("강아지는 마당에서 낮잠을 자요");
	}
	
	

}
