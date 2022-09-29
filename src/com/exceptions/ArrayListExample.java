package com.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
	List<Object> list = new ArrayList<Object>();
	
	list.add(10);
	list.add("java");
	list.add(false);
	list.add(10.35);
	
	System.out.println(list);
	}

}
