package com.Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>(new Mycompare1());
		map.put(500, "sai");
		map.put(501, "ajay");
		map.put(502, "bhanu");
		map.put(503, "naveen");
		map.put(504, "chandu");
		
		System.out.println(map.size());
		System.out.println(map);
		
		// in this case Treemap key's overrided. key 500 override 504, here o/p is 500 = chandu
		// because return 0; only 1 obj can printed
	}

}

class Mycompare1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
	
}
