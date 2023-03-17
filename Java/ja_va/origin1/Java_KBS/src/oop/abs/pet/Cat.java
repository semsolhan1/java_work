package oop.abs.pet;

public class Cat extends Pet {

	public Cat(String name, String kind, int age) {
		super(name, kind, age);
	}
	
	@Override
	public void feed() {
		System.out.println("고양이는 생선을 냠냠 먹어요");
	}

	@Override
	public void takeNap() {
		System.out.println("고양이는 캣타워에서 자요");
	}

}
