package Final_activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;






public class FirstActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Denis", 30, "Test Manager", "Sunlight", 2000);
		Employee emp2 = new Employee("Maris", 35, "QA engineer", "Google", 1250);
		Employee emp3 = new Employee("Atto", 20, "System developer", "IBM", 2500);
		Employee emp4 = new Employee("Jack", 25, "GameDev", "Epic Games", 3000);
		
		List <Employee>employee = new ArrayList<Employee>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		int size = employee.size();
		Employee temp;
		Collections.sort(employee, new SalaryComparator());
		Collections.reverse(employee);
		for(int i = 0; i < size; i++)
		{
			temp = employee.get(i);
			System.out.println("\nMy name is " + temp.getName() + " and i am " + temp.getAge() + " years old"
					+ "\nI am work as " + temp.getjobTitle() + " in a " + temp.getcompany()
					+ "\nMy monthly salary is: " + temp.getSalary());
		}
	

	}

	
	
}
