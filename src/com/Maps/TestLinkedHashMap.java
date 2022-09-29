package com.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(null, "anil");
		map.put(null, "pavan");
		map.put(203, "naveen");
		map.put(202, null);
		map.put(205, null);
		
		//Hashset duplicates are eliminated incase of keys but not values
		
		System.out.println(map.size());
		System.out.println(map);
		
	}

}
