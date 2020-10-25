package Final_activity;

public class Student extends Humanity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 =new Student("Zhak");
		s1.setHeight(1.77);
		s1.introduceStudent();
		
	}

	private String schoolName;
	
	public Student(){
		schoolName="Unknown";
		
	}

	public Student(String schoolName){
		this.schoolName = schoolName;
	}

	public String getschoolName() {
		return schoolName;
	}
	
	public void setschoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public void introduceStudent() {
		System.out.println("I am study in university " + schoolName
				+ "\n And my height is: " + Hheight);
	}
}
