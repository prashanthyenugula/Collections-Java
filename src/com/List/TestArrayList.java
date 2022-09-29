package com.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		long beforeExecute = System.currentTimeMillis();
		for(int i=1; i<=10000; i++){
			list.add(0,i);
		}
		long afterExecute = System.currentTimeMillis();
		System.out.println("Total time taken: "+(afterExecute-beforeExecute));
		
		List<Integer> Linkedlist = new LinkedList<Integer>();
		long beforeExecute1 = System.currentTimeMillis();
		for(int i=1; i<=100000; i++){
			list.add(0,i);
	}
		long afterExecute1 = System.currentTimeMillis();
		System.out.println("Total time taken: "+(afterExecute1-beforeExecute1));
		
	}
}
