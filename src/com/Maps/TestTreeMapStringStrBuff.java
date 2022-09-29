package com.Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


public class TestTreeMapStringStrBuff {
	
	public static void main(String[] args) {
		
		
		Map<StringBuffer, String> map = new TreeMap<>(new StringBuffStringCompare());
		map.put(new StringBuffer("Hello"), "Chandu");
		map.put(new StringBuffer("Hii"), "Mahesh");
		map.put(new StringBuffer("NTPC"), "Ashok");
		map.put(new StringBuffer("Yadav "), "Ganesh");
		
		System.out.println(map.size());
		System.out.println(map);
		
		/**If you didn't add constructor ClassCastException is coming; because stringbuffer   
	    didn't have .equals,==, hashcode,comparator. comparable methods..*/
	}

}

class StringBuffStringCompare implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		return sb1.toString().compareTo(sb2.toString());
	}
	
}
