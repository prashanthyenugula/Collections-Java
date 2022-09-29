package com.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new CopyOnWriteArrayList<Integer>(new Integer[] {1,21,34,56});
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			System.out.println(no);
			if(no==8)
				l.add(56);
			System.out.println(no);
		}
	}

}
