package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeset {
	
	public static void main(String[] args) {
		Set<Integer> ts= new TreeSet<>();
		
		ts.add(10);
		ts.add(30);
		ts.add(70);
		ts.add(50);
		ts.add(200);
		ts.remove(60);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println("haii");
		for(Object obj : ts){
			System.out.println(obj);
		}
	}

}
