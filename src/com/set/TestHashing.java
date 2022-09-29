package com.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashing {
	  
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>(25, 0.5f);
		
		set.add(10);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(93);
		set.add(77);
		set.add(85);
		set.add(4);
		set.add(64);
		set.add(32);
		set.add(134);
		set.add(196);
		set.add(342);
		
		System.out.println(set);
	}

}
