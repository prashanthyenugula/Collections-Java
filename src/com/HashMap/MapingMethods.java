
package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapingMethods {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(11, "Spring");
		map.put(12, "Hibernate");
		map.put(13, "Java");
		map.put(14, "Rest");
		map.put(15, "Collections");
		
		
		Map<Integer, String> m=new HashMap<>();
		
		Set<Entry<Integer, String>> es = map.entrySet();
		for (Entry<Integer, String> entry : es) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		// this is for all keys from the map
		/*Set<Integer> keySet = map.keySet(); 
		for (Integer key : keySet) {
			System.out.println(key);
		}*/
		
		/*// this is for how many entries are there in map
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue() );
		}*/
		
		/*// this is for to remove the particular object from the map 
	    map.remove(14, "Rest");
	    System.out.println(map);*/
		
		 //System.out.println(map.containsValue("Java")); // to get the value from the map
		// System.out.println(map.containsKey(11)); // to get the key from the map
		
		 // System.out.println(map.keySet()); // to get the keys from the map
		 //System.out.println(map.values()); // to get the values from the map
		
	}

}
