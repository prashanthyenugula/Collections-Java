package com.set;

import java.util.HashSet;
import java.util.Set;

public class PracHashSet {
	
	public static void main(String[] args) {
		
		
		PracEmployee e1 = new PracEmployee(500, "Bhanu", "50000");
		PracEmployee e2 = new PracEmployee(500, "Bhanu", "40000");
		PracEmployee e3 = new PracEmployee(501, "Nikhil", "60000");
		PracEmployee e4 = new PracEmployee(501, "Nikhil", "50000");
		PracEmployee e5 = new PracEmployee(502, "Shravan", "40000");
		
		Set<PracEmployee> set=new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
  		System.out.println(set);
  		// System.out.println(set.hashCode());
	
	}

}
