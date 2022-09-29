package com.Maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.pojo.Pen;

public class TestHashMapStringStrBuff {
	
	public static void main(String[] args) { 
		
		Pen p1 = new Pen(501, "Cello");
		Pen p2 = new Pen(502, "Reynolds");
		Pen p3 = new Pen(503, "Parker");
		Pen p4 = new Pen(504, "Mountex");
		
		Map<Pen, StringBuffer> map = new HashMap<>();
		map.put(p1 , new StringBuffer("Java"));
		map.put(p2 , new StringBuffer("Hibernate"));
		map.put(p3 , new StringBuffer("Spring"));
		map.put(p4 , new StringBuffer("Rest"));
		
		/*Map<StringBuffer,Pen> map = new TreeMap<>();
		map.put(new StringBuffer("Java"), p1);
		map.put(new StringBuffer("Hibernate"),p2);
		map.put(new StringBuffer("Spring"),p3);
		map.put(new StringBuffer("Rest"),p4);*/
		
		System.out.println(map.size());
		System.out.println(map);
		
				
	}

}


class HashStringBuffCompare implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		return sb1.toString().compareTo(sb2.toString());
		
	}

}
