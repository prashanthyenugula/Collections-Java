package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashStringBuffer {
	
	public static void main(String[] args) {
		
		Set<StringBuffer> set = new HashSet<>();
		
		set.add(new StringBuffer("Hello"));
		set.add(new StringBuffer("java"));
		set.add(new StringBuffer("Hai"));
		set.add(new StringBuffer("Hello"));
		
		System.out.println(set);
	}

}
