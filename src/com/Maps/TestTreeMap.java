package com.Maps;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(200, "harish");
		map.put(null, "rakesh");// in this case here null pointer exception because Treemap key didnot allow null value;
		map.put(300, "teja");
		map.put(400, "bhanu");
		map.put(200, null);
		
		System.out.println(map.size());
		System.out.println(map);
	}

}
