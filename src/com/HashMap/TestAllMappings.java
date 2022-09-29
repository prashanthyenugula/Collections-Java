
package com.HashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.WeakHashMap;

public class TestAllMappings {
	
	public static void main(String[] args) {
			// testHashTable();
			testWeakHashMap();
	}

	private static void testWeakHashMap() {
		Map<String, Integer> map = new WeakHashMap<>();
		map.put(new String("Hello"), 101);
		
		System.gc();
		System.out.println(map);
	}

	private static void testHashTable() {
		// HashTable will not allow any null value in both side, (key, value)
		Map<Integer, String> map = new Hashtable<>();
		map.put(100, "Hibernate");
		
		System.out.println(map);
		
	}

}
