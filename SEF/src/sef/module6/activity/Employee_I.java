package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I  {
	
	//Attributes
	private int salary;
	private String title;
	
	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	
	public Employee_I(){ 
		this.salary = 0;
		this.title = "Unknown";
		System.out.println("I'm an Employee_I Constructor"); 
	}
	
	public Employee_I(int salary, String title){
		this.salary = salary;
		this.title = title;
	}
	

	// write getter for int salary
	public int getSalary() {
		return salary;
	}
	// write setter for int salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// write getter for String title
	
	public String getTitle() {
		return title;
	}
	// write setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
	
		
		
	
	
}
