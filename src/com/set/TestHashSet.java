package com.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//System.out.println(set.add("java"));// True
		set.add("java");
		set.add("Hibernate");
		set.add("Spring");
		set.add("Hello");
		set.add("java");
		//System.out.println(set.add("java"));// False
		
		System.out.println(set);
	}

}
