package Final_activity;

import junit.framework.TestCase;

public class CalculatorTesting extends TestCase {

	private Calculator The�alculator;

	protected void setUp() throws Exception {
		super.setUp();
		The�alculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

public void testGetSum() {
		
		int a = 10;
		int b = 15;			
		assertEquals(25, (The�alculator.getSum(a,b)));
		assertEquals(25, (The�alculator.getSum(b,a)));		

		a = -3;		
		b = 10;		
		assertEquals(7, (The�alculator.getSum(a,b)));
		assertEquals(7, (The�alculator.getSum(b,a)));
		
		a = -15;		
		b = -10;		
		assertEquals(-25, (The�alculator.getSum(a,b)));
		assertEquals(-25, (The�alculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 3;
		int b = 2;		
		//	Checks if b is lesser than a
		assertEquals(1, (The�alculator.getDifference(a,b)));		
		//	Checks if b is greater than a
		assertEquals(-1, (The�alculator.getDifference(b,a)));

		a = 5;
		b = -4;
		assertEquals(9, (The�alculator.getDifference(a,b)));		
		assertEquals(-9, (The�alculator.getDifference(b,a)));	
	
		a = -10;
		b = -5;
		assertEquals(-5, (The�alculator.getDifference(a,b)));		
		assertEquals(5, (The�alculator.getDifference(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 5;
		double b = 10;			
		assertEquals(50, (The�alculator.getProduct(a,b)),0);
		assertEquals(50, (The�alculator.getProduct(b,a)),0);		

		a = -5;		
		b = 10;		
		assertEquals(-50, (The�alculator.getProduct(a,b)),0);
		assertEquals(-50, (The�alculator.getProduct(b,a)),0);
		
		a = -3;		
		b = -10;		
		assertEquals(30, (The�alculator.getProduct(a,b)),0);
		assertEquals(30, (The�alculator.getProduct(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;		
		assertEquals(2, (The�alculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (The�alculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		assertEquals(-3, (The�alculator.getQuotient(a,b)),0);		
		assertEquals(-0.33, (The�alculator.getQuotient(b,a)),0.007);	
	
		a = -10;	b = -5;
		assertEquals(2, (The�alculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (The�alculator.getQuotient(b,a)),0);			
		}
		
		public void testThrowException(){
			
			try {

				The�alculator.getSum(2, 1);
				The�alculator.getDifference(3, 3);
				The�alculator.getProduct(0, 1);
				The�alculator.getQuotient(1, 0);
				new Calculator();
					
			} catch (Exception e) {
				fail();
			}
			  catch (Error e) {
				fail();
			}
		}

}
