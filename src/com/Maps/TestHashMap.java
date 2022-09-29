package com.Maps;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "naveen");
		map.put(102, "raju");
		map.put(103, "venu");
		map.put(104, "bhanu");
		map.put(104, "bhanu");
		
		
		System.out.println(map.size());
		System.out.println(map);
	}

}
