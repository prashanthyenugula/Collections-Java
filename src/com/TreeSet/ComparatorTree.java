package com.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class ComparatorTree  {
	
	public static void main(String[] args) { 
		
		Set<StringBuffer> set = new TreeSet<>( new MyStringBufferCompare());
		set.add(new StringBuffer("Hello"));
		set.add(new StringBuffer("Rohit"));
		set.add(new StringBuffer("How"));
		set.add(new StringBuffer("Are"));
		set.add(new StringBuffer("You"));
		
		System.out.println(set); 
		
		/*Set<Integer> set = new TreeSet<>(new MyIntegerCompare());
		set.add(100);
		set.add(99);
		set.add(177);
		set.add(266);
		set.add(87);
		set.add(219);
		
		System.out.println(set);// default ascending order printed
*/		
	}

	
}

class MyStringBufferCompare implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		return sb1.toString().compareTo(sb2.toString());
	}
	
	
   /* // values which are printed 1-100 in ascending order and above 100 descending order
	@Override
	public int compare(Integer x, Integer y) {
		if( x<= 100 && y <= 100)
			return x.compareTo(y);
		else
		return -x.compareTo(y); 
	}*/
	
  /*// we are written a code to display descending order
	@Override
	public int compare(Integer x, Integer y) {
		return (x < y) ? 1 : ((x == y) ? 0 : -1);
	}
	*/
	
}

