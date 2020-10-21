package sef.module6.activity;

public class Rectangle extends Shape {

	
	protected double length;
	protected double breadth;
	protected String color;
	
	public Rectangle(){ 
		length = 0;
		breadth = 0;
		color = "uknown";
	}
	
	public Rectangle(double length, double breadth, String color){
		this.length = length;
		this.breadth = breadth;
		this.color = color;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String color() {
		return color;
	}
	
	@Override
	public double calculateArea() {
		return length * breadth;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length + length);
	}

}
