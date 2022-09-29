package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLHS {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<>();
		set.add(6);
		set.add(9);
		set.add(22);
		set.add(25);
		set.add(3);
		set.add(6);
		
		System.out.println(set);
		
	}

}
