package com.List;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		  
		List<Integer> list = new ArrayList<Integer>();
		//System.out.println(System.currentTimeMillis());
		
		for(int i=0; i<=500; i=i+10){
			list.add(0,i);
		}
		list.add(2, 15);
		System.out.println(list);
	}
}
