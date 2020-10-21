package sef.module9.sample;
// Complete Code
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSample {
	
	public static void main(String[] args) {
			
		Map<String, Comparable> map = new HashMap<String, Comparable>();
		map.put("A", "A String");
		map.put("B", new Date());
		map.put("C", new Integer(42));
		map.put("D", new Float(23.0f));
		//Beware of using the same key twice cause it will overwrite the value
		//map.put("1", "Same key as A String");
		
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		
		
		new MapSample().print(map);
		
	}
	void print(Map<String, Comparable> map)
	{
		//Keys are maintained as set in map.
		Set<String> keySet = map.keySet();
		
		//You can use an iterator to access keys
		System.out.println("*************************************");
		System.out.println("Key\tValue");
		Iterator<String> it=keySet.iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
		System.out.println("*************************************");
		
	}
}