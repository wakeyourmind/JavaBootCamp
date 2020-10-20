package sef.module6.sample;

public class Employee_A extends Person_A{

	//Attributes
	private int salary;
	private String title;
	private String name;
	private int age;
	
	//Behavior - default constructor
	public Employee_A(){ 
		System.out.println("I'm an Employee_A Constructor"); 
	}
	
	public Employee_A(String name, String title, int salary, int age){
		this.name= name;
		this.title = title;
		this.salary = salary;
		this.age=age;
		}
	
	// getter for double salary
	public int getSalary() {
		return salary;
	}
	
	// setter for double salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// getter for String title
	public String getTitle() {
		return title;
	}
	
	// setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name="<E>"+name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
