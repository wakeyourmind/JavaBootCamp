package sef.module6.activity;

public abstract class Shape {

	//public String color;
	
	
	/*public Shape() {
	color = "uknown";
	}
	
	public Shape(String color) {
		this.color=color;
	}
	*/
	// DONE Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

	
	/*public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	*/
	public abstract String color();
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	
	
	
}
