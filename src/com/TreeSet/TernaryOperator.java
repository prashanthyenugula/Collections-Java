package com.TreeSet;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		//System.out.println( 10>9 ? "Hello":"Hi" );// Hello
		//System.out.println( 5>9 ? "Hello": "Java");// java
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		System.out.println(sb1==sb2);// false
		System.out.println(sb1.toString().equals(sb2.toString()));// true
		
	}

}
