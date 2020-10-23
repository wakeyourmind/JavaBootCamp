package Final_activity;

public class Person {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Person pt = new Person();
			pt.setAge(50);
			pt.setName("Locky55");
			System.out.println( "String doesn't contain a numbers it's : " + isStringOnlyAlphabet(pt.name));
			pt.introducePerson();
	
		
	}


	private String name;
	private int age;
	

	public Person(){
		name="Unknown";
		age = 0;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	public final String getName() {
			return name;
	}
	
	
	
	public static boolean isStringOnlyAlphabet(String name) 
	{ 
	    
		return ((!name.equals("")) 
	            && (name != null) 
	            && (name.matches("^[a-zA-Z]*$"))); 

	} 


	

	
	public final void setName(String name) {
		this.name = name;
		
	}
		
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	public void introducePerson() {
		System.out.println("My name is " + name + " and I am " + age + " years old");
	}
	
}
