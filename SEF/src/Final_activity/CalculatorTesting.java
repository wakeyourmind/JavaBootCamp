package Final_activity;

import junit.framework.TestCase;

public class CalculatorTesting extends TestCase {

	private Calculator Theņalculator;

	protected void setUp() throws Exception {
		super.setUp();
		Theņalculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

public void testGetSum() {
		
		int a = 10;
		int b = 15;			
		assertEquals(25, (Theņalculator.getSum(a,b)));
		assertEquals(25, (Theņalculator.getSum(b,a)));		

		a = -3;		
		b = 10;		
		assertEquals(7, (Theņalculator.getSum(a,b)));
		assertEquals(7, (Theņalculator.getSum(b,a)));
		
		a = -15;		
		b = -10;		
		assertEquals(-25, (Theņalculator.getSum(a,b)));
		assertEquals(-25, (Theņalculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 3;
		int b = 2;		
		assertEquals(1, (Theņalculator.getDifference(a,b)));		
		assertEquals(-1, (Theņalculator.getDifference(b,a)));

		a = 5;
		b = -4;
		assertEquals(9, (Theņalculator.getDifference(a,b)));		
		assertEquals(-9, (Theņalculator.getDifference(b,a)));	
	
		a = -10;
		b = -5;
		assertEquals(-5, (Theņalculator.getDifference(a,b)));		
		assertEquals(5, (Theņalculator.getDifference(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 5;
		double b = 10;			
		assertEquals(50, (Theņalculator.getProduct(a,b)),0);
		assertEquals(50, (Theņalculator.getProduct(b,a)),0);		

		a = -5;		
		b = 10;		
		assertEquals(-50, (Theņalculator.getProduct(a,b)),0);
		assertEquals(-50, (Theņalculator.getProduct(b,a)),0);
		
		a = -3;		
		b = -10;		
		assertEquals(30, (Theņalculator.getProduct(a,b)),0);
		assertEquals(30, (Theņalculator.getProduct(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;		
		assertEquals(2, (Theņalculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (Theņalculator.getQuotient(b,a)),0);

		a = 9;	b = -3;
		assertEquals(-3, (Theņalculator.getQuotient(a,b)),0);		
		assertEquals(-0.33, (Theņalculator.getQuotient(b,a)),0.007);	
	
		a = -10;	b = -5;
		assertEquals(2, (Theņalculator.getQuotient(a,b)),0);		
		assertEquals(0.5, (Theņalculator.getQuotient(b,a)),0);			
		}
		
		public void testThrowException(){
			
			try {

				Theņalculator.getSum(2, 1);
				Theņalculator.getDifference(3, 3);
				Theņalculator.getProduct(0, 1);
				Theņalculator.getQuotient(1, 0);
				new Calculator();
					
			} catch (Exception e) {
				fail();
			}
			  catch (Error e) {
				fail();
			}
		}

}
