package oop.abs.quiz;

public class Rect extends Shape {

	private int side;
	private int width;
	private int height;
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}
	

	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		if(side != 0) {
			return side * side;
		} else {
			return width * height;
		}
	}
}












