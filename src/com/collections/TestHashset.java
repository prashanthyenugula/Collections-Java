package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashset {
	
public static void main(String[] args) {
	
		Set<Integer> set= new HashSet<>();
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(1);
		set.add(5);
		set.add(20);
		
		for (Integer value : set) {
			System.out.println(value);
		}
		
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
*/
}

}