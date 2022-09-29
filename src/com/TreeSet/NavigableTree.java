package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class NavigableTree {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(100);
		set.add(99);
		set.add(96);
		set.add(88);
		set.add(73);
		set.add(111);
		set.add(149);
		set.add(76);
		
		for (Integer value : set) {
			System.out.println(value);
		}
		
	}

}
