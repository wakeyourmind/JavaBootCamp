package sef.module9.sample;
//Needs to be completed
import java.util.*;

import sef.module3.sample.WhileLoopSample;

public class SetSample {
	public static void main(String[] args) {
		//1 - Create a new HashSet and name it monthSet

		Set monthset = new HashSet();
		monthset.add("Aaril");
		monthset.add("January");
		monthset.add("Februry");
		monthset.add("March");
		//monthset.
//		
	//monthset.add(4);
//	/monthset.add(3);
	///monthset.add(1);
	//monthset.add(2);
		
		
		System.out.println(monthset.add("January"));
		
		

		//2 - Add duplicate month names in it. For eg. January can be entered twice
		//duplicates will return false
		System.out.println(monthset.add("January"));

		System.out.println("Output : ");
		//3 - Iterate through the HashSet and print all the months.
		
		//You'd notice that duplicate names are not printed. 
		print(monthset);
	}
	static void print(Set set) {
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
}
