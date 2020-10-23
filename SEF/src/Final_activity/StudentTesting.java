package Final_activity;

import junit.framework.TestCase;

public class StudentTesting extends TestCase {

	private Student theStudent;

	protected void setUp() throws Exception {
		super.setUp();
		theStudent = new Student();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSetAndGetName() {
	    String testName = "Jack";
	    assertNotNull(theStudent.getschoolName());
	    theStudent.setschoolName(testName);
	    assertEquals(testName, theStudent.getschoolName());
	    
	    String testName1 = "Daniel";
	    theStudent.setschoolName("Daniel");
	    assertSame(theStudent.getschoolName(), testName1);
	    assertEquals(testName1, theStudent.getschoolName());
	    
	    String testName2 = "Maris";
	    theStudent.setschoolName("Agris");
	    assertNotSame(theStudent.getschoolName(), testName2);
	    
	    String testName3 = null;
	    theStudent.setschoolName(testName3);
	    assertNull(theStudent.getschoolName());
	    assertEquals(testName3, theStudent.getschoolName());
	}

public void testThrowException(){
		
		try {
			theStudent.setschoolName("Jack");
			theStudent.getschoolName();
			new Student();
				
		} catch (Exception e) {
			fail();
		}
		  catch (Error e) {
			fail();
		}
	}
}
