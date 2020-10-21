package sef.module8.activity;
//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
public static void main(String[] args) {
	new ExceptionSequenceActivity().divide(10,0);
}

void divide(int num1,int num2) throws ArithmeticException
{
	int result=num1/num2;
	try{
	System.out.println("The divide result is " + result);	
	}
	catch(Exception e)
	{
		System.out.println("Exception!!!");
	}
	finally {
		System.out.println("Thank you for using this program! ");
	}
//1. Replace catch(ArithmeticException e) clause with throws
//2. Also add one more variable "result" to print dividing, because if you don't add it you catch only one simple Exception
// If you divided it by zero
} 
}
