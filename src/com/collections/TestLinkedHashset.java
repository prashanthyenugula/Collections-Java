package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashset {
	
	public static void main(String[] args) {
		Set<Object> lhs =new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(60);
		lhs.add(10.77);
		lhs.add("hello java");
		lhs.add(true);
		lhs.add(40);
		lhs.add(70);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(20));
		System.out.println("------ hello------");
		
		for(Object object : lhs){
			System.out.println(object);
		}
		
	}
	

}
