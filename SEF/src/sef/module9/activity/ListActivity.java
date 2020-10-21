package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List<String> list = new ArrayList<String>();
		list.add("Adrian");
		list.add("Dmitrijs");
		list.add("Andrejs");
		//2 - Call print method to print the list passed as its parameter.
		ListActivity obj = new ListActivity();
		obj.print(list);
		
	}
	
	void print(List<String> list)
	{
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());	
	}

	}
}
	
