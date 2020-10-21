package sef.module9.activity;

import java.util.HashSet;
import java.util.Iterator;
//Needs to be completed
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Agris");
		names.add("John");
		names.add("David");
		names.add("Maris");
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.

		System.out.println(names.add("Agris"));
		System.out.println(names.add("Maris"));
		System.out.println(names.add("Maris"));
		System.out.println(names.add("David"));
		
		
		//2 - Call print method to print the set passed as its parameter.
		System.out.println("Output : ");
		print(names);
	}
	
	static void print(Set<String> set)
	{
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
	}
}
}