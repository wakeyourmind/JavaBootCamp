package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sef.module9.sample.MapSample;


public class MapActivity {

	static String temp = "My Testing" ;
	
		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String, String> map = new HashMap<String, String>();
			map.put("1", new String("Nika"));
			map.put("2", new String("Vika"));
			map.put("3", new String("Veronika"));
			map.put("4", new String("Lika"));
			
			
			/*print(temp);
			print1(10);
			print2(temp);
			print3(temp);*/
			//2 - Call print method to print the map passed as its parameter.
			new MapActivity().print_1(map);
		}
		
		void print_1(Map<String, String> map)
		{
			//Keys are maintained as set in map.
			Set<?> keySet = map.keySet();
			
			//You can use an iterator to access keys
			System.out.println("*************************************");
			System.out.println("Key\tValue");
			Iterator<?> it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			
			System.out.println("*************************************");
			
		}
		/*static void print(String test)
		{
			Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
		static void print1(int a)
		{
			//int a = 10; 
			for (int i = 0 ; i< a; i++) {
				
				
				
				
			}
		
		}
		static void print2(String test)
		{
			Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}
		static void print3(String test)
		{
			Integer.valueOf(test);
			
			System.out.println(test.toUpperCase());
		
		}*/
	}
