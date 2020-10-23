package Final_activity;

import junit.framework.TestCase;


public class PersonTesting extends TestCase {

		private Person personality;

		protected void setUp() throws Exception {
			super.setUp();
			personality = new Person();
		}

		protected void tearDown() throws Exception {
			super.tearDown();
		}


		public void testSetAndGetAge() {
			int testAge = 25;
			assertEquals(0,0);
			personality.setAge(testAge);
			assertEquals(testAge, personality.getAge());

			int testAge2 = -10;
			assertEquals(0, 0);
			personality.setAge(testAge2);
			assertEquals(testAge2, personality.getAge());
			
			int testAge3 = 0;
			assertEquals(0, 0);
			personality.setAge(testAge3);
			assertEquals(testAge3, personality.getAge());
			
			int testAge4 = 0;
			assertNotNull(personality.getAge());
			personality.setAge(testAge4);
			assertEquals(testAge4, personality.getAge());
			
			int testAge5 = 50;
			personality.setAge(50);
			assertSame(personality.getAge(), testAge5);
			assertEquals(testAge5, personality.getAge());
			
			int testAge6 = 50;
			personality.setAge(1000);
			assertNotSame(personality.getAge(), testAge6);
			
			
			
				
		}
		
	public void testSetAndGetName() {
	    String testName = "Jack";
	    assertNotNull(personality.getName());
	    personality.setName(testName);
	    assertEquals(testName, personality.getName());
	    
	    String testName1 = "Daniel";
	    personality.setName("Daniel");
	    assertSame(personality.getName(), testName1);
	    assertEquals(testName1, personality.getName());
	    
	    String testName2 = "Maris";
	    personality.setName("Agris");
	    assertNotSame(personality.getName(), testName2);
	    
	    String testName3 = null;
	    personality.setName(testName3);
	    assertNull(personality.getName());
	    assertEquals(testName3, personality.getName());


	}

	public void testThrowException(){
		
		try {

			personality.setAge(20);
			personality.getAge();
			personality.setName("Jack");
			personality.getName();
			new Person();
				
		} catch (Exception e) {
			fail();
		}
		  catch (Error e) {
			fail();
		}
	}
	
}