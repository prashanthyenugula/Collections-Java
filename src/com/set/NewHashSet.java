package com.set;

import java.util.HashSet;
import java.util.Set;

public class NewHashSet {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(100, "Teja", "50000");
		Employee e2 = new Employee(101, "Sai", "40000");
		Employee e3 = new Employee(102, "Rakesh", "60000");
		Employee e4 = new Employee(100, "Teja", "50000");
		Employee e5 = new Employee(104, "Harish", "40000");
		
		Set<Employee> set=new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
  		System.out.println(set);
		//System.out.println(e1.hashCode());
	}
}

	
	