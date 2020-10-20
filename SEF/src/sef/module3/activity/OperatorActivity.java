package sef.module3.activity;
import java.util.Scanner;
/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Difference = " + result);
		
		// Addition 
		Scanner scan1 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter numbers:");
		int k = scan1.nextInt();  // Read user input
		int d = scan1.nextInt();  // Read user input
		
		// Add numbers
		int result1=k+d;
		
		// Print result
		System.out.println("Addition = " + result1);
		
	}

}
