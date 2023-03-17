package oop.abs.quiz;

public abstract class Shape {
	
	/*
	 1. 도형의 이름을 저장할 수 있는 변수(name)을 private으로 선언.
	 
	 2. 생성자를 선언 -> 매개값으로 도형의 이름을 받아서 저장할 수 있도록.
	 
	 3. 자식 클래스에게 오버라이딩을 강제할 수 있는 메서드 
	 	getArea() 를 선언 (return type -> double)
	 	
	 4. 도형 이름을 출력할 수 있는 메서드 getName()을 선언. (강제 x)
	*/
	
	private String name;

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public abstract double getArea();

	public String getName() {
		return "도형이름: " + name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}











