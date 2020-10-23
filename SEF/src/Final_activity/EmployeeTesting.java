package Final_activity;

import junit.framework.TestCase;



public class EmployeeTesting extends TestCase {

	
	private Employee theEmployee;
	
	protected void setUp() throws Exception{
		super.setUp();
		
		theEmployee = new Employee();
	}
protected void tearDown() throws Exception {
	super.tearDown();
}
	

public void testSetAndGetAge() {
	int testAge = 25;
	assertEquals(0, 0);
	theEmployee.setAge(testAge);
	assertEquals(testAge, theEmployee.getAge());

	int testAge2 = -10;
	assertEquals(0, 0);
	theEmployee.setAge(testAge2);
	assertEquals(testAge2, theEmployee.getAge());
	
	int testAge3 = 0;
	assertEquals(0, 0);
	theEmployee.setAge(testAge3);
	assertEquals(testAge3, theEmployee.getAge());
	
	int testAge4 = 0;
	assertNotNull(theEmployee.getAge());
	theEmployee.setAge(testAge4);
	assertEquals(testAge4, theEmployee.getAge());
	
	
		
}


public void testSetAndGetSalary() {
	int testAge = 1000;
	assertEquals(0, 0);
	theEmployee.setSalary(testAge);
	assertEquals(testAge, theEmployee.getSalary());

	int testAge2 = -200;
	assertEquals(0, 0);
	theEmployee.setSalary(testAge2);
	assertEquals(testAge2, theEmployee.getSalary());
	
	int testAge3 = 0;
	assertEquals(0, 0);
	theEmployee.setSalary(testAge3);
	assertEquals(testAge3, theEmployee.getSalary());
	
	int testAge4 = 0;
	assertNotNull(theEmployee.getSalary());
	theEmployee.setSalary(testAge4);
	assertEquals(testAge4, theEmployee.getSalary());
	
	
	
		
}


public void testSetAndGetName() {
    String testName = "Jack";
    assertNotNull(theEmployee.getName());
    theEmployee.setName(testName);
    assertEquals(testName, theEmployee.getName());
    
    String testName1 = "Daniel";
    theEmployee.setName("Daniel");
    assertSame(theEmployee.getName(), testName1);
    assertEquals(testName1, theEmployee.getName());
    
    String testName2 = "Maris";
    theEmployee.setName("Agris");
    assertNotSame(theEmployee.getName(), testName2);
    
    String testName3 = null;
    theEmployee.setName(testName3);
    assertNull(theEmployee.getName());
    assertEquals(testName3, theEmployee.getName());


}

public void testSetAndGetJobTitle() {
    String testjobTitle = "Developer";
    assertNotNull(theEmployee.getjobTitle());
    theEmployee.setjobTitle(testjobTitle);
    assertEquals(testjobTitle, theEmployee.getjobTitle());
    
    String testjobTitle1 = "QA Engineer";
    theEmployee.setjobTitle("QA Engineer");
    assertSame(theEmployee.getjobTitle(), testjobTitle1);
    assertEquals(testjobTitle1, theEmployee.getjobTitle());
    
    String testjobTitle2 = "GameDev";
    theEmployee.setjobTitle("Junior developer");
    assertNotSame(theEmployee.getjobTitle(), testjobTitle2);
    
    String testjobTitle3 = null;
    theEmployee.setjobTitle(testjobTitle3);
    assertSame(theEmployee.getjobTitle(), testjobTitle3);
    assertEquals(testjobTitle3, theEmployee.getjobTitle());
    
    

}

public void testSetAndGetCompany() {
    String testcompany = "IBM";
    assertNotNull(theEmployee.getcompany());
    theEmployee.setcompany(testcompany);
    assertEquals(testcompany, theEmployee.getcompany());

    String testcompany1 = "EPIC Games";
    theEmployee.setcompany("EPIC Games");
    assertSame(theEmployee.getcompany(), testcompany1);
    assertEquals(testcompany1, theEmployee.getcompany());
    
    String testcompany2 = "Steam";
    theEmployee.setcompany("Blizzard");
    assertNotSame(theEmployee.getcompany(), testcompany2);
    
    String testcompany3 = null;
    theEmployee.setcompany(testcompany3);
    assertSame(theEmployee.getcompany(), testcompany3);
    assertEquals(testcompany3, theEmployee.getcompany());
    

   
}


public void testThrowException(){
	
	try {

		theEmployee.setAge(20);
		theEmployee.getAge();
		theEmployee.setSalary(1000);
		theEmployee.getSalary();
		theEmployee.setName("Jack");
		theEmployee.getName();
		theEmployee.setjobTitle("Test manager");
		theEmployee.getjobTitle();
		theEmployee.setcompany("EPIC Games");
		theEmployee.getcompany();
		new Employee();
			
	} catch (Exception e) {
		fail();
	}
	  catch (Error e) {
		fail();
	}
}

}
