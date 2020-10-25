package Final_activity;

import java.util.Scanner; 

public class Calculator {

	private static int a;
	private static int b;
	
	public static void display_menu() {
	    System.out.println ( "1) Summ: 1\n2) Difference:  2\n3)Product:  3\n4) Quiotient: 4" );
	    System.out.print ( "Selection: " );
	  }
	public static void main(String[] args) {
		  Scanner in = new Scanner ( System.in );
		    
		    display_menu();
		    switch ( in.nextInt() ) {
		      case 1:
		    	System.out.println ( "Enter the first value: " );
		    	  a = in.nextInt();
		    	  System.out.println ( "Enter the second value: " );
		    	  b = in.nextInt();
		    	  System.out.println ( "The summ is: " + getSum(a,b));
		    	  break;
		      case 2:
		    	  System.out.println ( "Enter the first value: " );
		    	  a = in.nextInt();
		    	  System.out.println ( "Enter the second value: " );
		    	  b = in.nextInt();
		    	  System.out.println ( "The diffrence is: " + getDifference(a,b));
		    	  break;
		      case 3:
		    	  System.out.println ( "Enter the first value: " );
		    	  a = in.nextInt();
		    	  System.out.println ( "Enter the second value: " );
		    	  b = in.nextInt();
		    	  System.out.println ( "The product is: " + getProduct(a,b));
		    	  break;
		      case 4:
		    	  System.out.println ( "Enter the first value: " );
		    	  a = in.nextInt();
		    	  System.out.println ( "Enter the second value: " );
		    	  b = in.nextInt();
		    	  System.out.println ( "The quotient is: " + getQuotient(a,b));
		    	  break;
		    	  default:
		    		  System.err.println ( "Unrecognized option" );
		    	        break;
		    	  
		    	  
		    }
	}
	public static int getSum(int a, int b) {
		
		return a + b;
	}
	
	public static int getDifference(int a, int b){
		return a - b;
	}
	
	public static double getProduct(double a, double b){
		return a * b;
	}
	
	public static double getQuotient(double a, double b){
		return a / b;
	}
	
	
}
