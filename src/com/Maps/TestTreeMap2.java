package com.Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>(new MyCompare());
		map.put(500, "sai");
		map.put(501, "ajay");
		map.put(502, "bhanu");
		map.put(502, "naveen");
		map.put(504, "chandu");
		
		System.out.println(map);
	}

}


class MyCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
}
