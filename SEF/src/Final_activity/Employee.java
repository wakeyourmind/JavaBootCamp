package Final_activity;



public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Denis", 30, "Test Manager", "Sunlight", 2000);
		Employee emp2 = new Employee("Maris", 35, "QA engineer", "Google", 1250);
		Employee emp3 = new Employee("Atto", 20, "System developer", "IBM", 2500);
		Employee emp4 = new Employee("Jack", 25, "GameDev", "Epic Games", 3000);
		emp1.introduceEmployee();
		emp2.introduceEmployee();
		emp3.introduceEmployee();
		emp4.introduceEmployee();
		
	}
	
	private String name;
	private int age;
	private String jobTitle;
	private String company;
	private int salary;
	
	public Employee(){
		name="Unknown";
		age = 0;
		jobTitle = "None";
		company = "None";
		salary = 0;
	
	}
	
	public Employee(String name, int age, String jobTitle, String company, int salary)
	{
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.company = company;
		this.salary = salary;
	}
	
	public String getjobTitle() {
		return jobTitle;
	}
	
	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getcompany() {
		return company;
	}
	
	public void setcompany(String company) {
		this.company = company;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		 this.salary = salary;
	}
	
	
	public void introduceEmployee() {
		System.out.println("\nMy name is " + name + " and i am " + age + " years old"
		+ "\nI am work as " + jobTitle + " in a " + company);
	}

	
	
	
	

	
}
