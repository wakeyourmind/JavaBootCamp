package Final_activity;


public class Third_activity {
	public static void main(String arg[]){
		Third_activity t1 = new Third_activity();
		t1.catchMeIfYouCan(10, 5);
		}

	void catchMeIfYouCan(int n1, int n2)
	{
		
		int result=n1/n2;
		
		try {
			System.out.println("The result is :" + result);
		} 
		catch (NullPointerException e) {
			System.out.println("A variable is not initialized");
		}
		catch(ArithmeticException e) {
			System.out.println("I can not perform division operation if divident is zero");
		}
		finally {
			System.out.println("Thank you for using this program! ");
		}
		
	}
}
