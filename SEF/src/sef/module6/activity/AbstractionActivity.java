package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 5, breadth = 8;
		Shape rectangle = new Rectangle(length, breadth, "Yellow");
		System.out.println("Rectangle length: " + length + " and breadth: " + breadth
                + "\nResulting area: " + rectangle.calculateArea()
                + "\nResulting perimeter: " + rectangle.calculatePerimeter()
                + "\nColor of rectangle: " + rectangle.color() + "\n");
	}

}
