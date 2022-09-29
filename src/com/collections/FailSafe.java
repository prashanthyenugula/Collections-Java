package com.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	
	public static void main(String[] args) {
		
		List<Integer> l = new CopyOnWriteArrayList<>();
		for (int i = 0; i <=10; i++) {
			l.add(i);
		}
		for (Integer value : l) {
			if(value==100)
				//l.remove(value); // it doesn't throw any exception
				l.add(value);
				System.out.println(value);
		}
	}
}
