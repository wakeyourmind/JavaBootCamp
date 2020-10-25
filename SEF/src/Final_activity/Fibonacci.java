package Final_activity;

import java.util.Scanner; 

public class Fibonacci {

	static void fibonacci_func(int N) 
    { 
        int num1 = 0, num2 = 1; 
  
        int counter = 0; 
  
        // Iterate till counter is N 
        while (counter < N) { 
  
            // Print the number 
            System.out.print(num1 + " "); 
  
            // Swap 
            int num3 = num2 + num1; 
            num1 = num2; 
            num2 = num3; 
            counter = counter + 1; 
        } 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("Enter your value: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
	
		fibonacci_func(N); 
	}

}
