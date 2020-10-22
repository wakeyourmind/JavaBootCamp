package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(5, 6);
		rectangle.setColor("Black");
		System.out.println(
                "\nResulting area: " + rectangle.calculateArea()
                + "\nResulting perimeter: " + rectangle.calculatePerimeter()
                + "\nColor of rectangle: " + rectangle.getColor() + "\n");
	}

}
