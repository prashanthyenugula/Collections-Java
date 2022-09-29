package com.set;

import java.util.Set;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		/* Set<Integer> set = new TreeSet<>();
		 set.add(10);
		 set.add(14);
		 set.add(5);
		 set.add(24);
		 set.add(17);
		 set.add(64);
		 set.add(7);
		 set.add(17);
		 
		 System.out.println(set.contains(24));//In List if a variable is there or not check 
		 System.out.println(set);*/
		 
		 Set<String> st = new TreeSet<>();
		 st.add("hello");
		 st.add("hi");
		 st.add("welcome");
		 st.add("to");
		 st.add("my");
		 st.add("world");
		 
		 
		 System.out.println(st);
		// System.out.println("hello".equals("hi")); // false
		 
		 //System.out.println("hello.".compareTo("hi"));// -4
		 
		 Set<String> st2 = new TreeSet<>();
		 st2.add("twitter");
		 st2.add("youtube");
		 
		 st.addAll(st2);//comparing 2 sets with alphabetical order
		 System.out.println("Final set: "+st);
	}

}
