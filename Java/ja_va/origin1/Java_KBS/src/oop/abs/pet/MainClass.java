package oop.abs.pet;

public class MainClass {

	public static void main(String[] args) {
		
		Pet dog = new Dog("초코", "푸들", 3);
		Pet cat = new Cat("야옹이", "러시안 블루", 2);
		
		dog.feed();
		dog.takeNap();
		
		System.out.println("----------------------");
		
		cat.feed();
		cat.takeNap();

	}

}
