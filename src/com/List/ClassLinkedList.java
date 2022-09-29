package com.List;

import java.util.LinkedList;
import java.util.List;

public class ClassLinkedList {
	
	public static void main(String[] args) {
		 
		
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i=10; i<=600;i++){
			list.add(i);
		}
		//list.add(5,45);
		System.out.println("99th position element is: "+list.get(99));
		System.out.println(list);
	}

}
