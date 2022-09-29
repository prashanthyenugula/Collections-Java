package com.set;

import java.util.Set;
import java.util.TreeSet;

import com.pojo.MyEmployee;

public class TestTree {
	
	public static void main(String[] args) {
		
		MyEmployee e1 = new MyEmployee(100, "Pavan", "40K");
		MyEmployee e2 = new MyEmployee(101, "Pavan", "40K");
		MyEmployee e3 = new MyEmployee(102, "Shravan", "50K");
		MyEmployee e4 = new MyEmployee(103, "Nithin", "60K");

		Set<MyEmployee> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);

		System.out.println(set);

	}

}
