package Final_activity;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Student s1 =new Student("Zhak");
		s1.introduceStudent();
		}
		catch(Exception e){
			System.out.println("Exception!!!");
		}
		
	}

	private String schoolName;
	

	//Behavior - default constructor
	public Student(){
		schoolName="Unknown";
		
	}
	
	//Behavior - parameterized constructor
	public Student(String schoolName){
		this.schoolName = schoolName;
	}
	
	// getter for String name
	public String getschoolName() {
		return schoolName;
	}
	
	// setter for String name
	public void setschoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public void introduceStudent() {
		System.out.println("I am study in university " + schoolName);
	}
}
