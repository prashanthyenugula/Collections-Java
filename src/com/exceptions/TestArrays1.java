package com.exceptions;

public class TestArrays1 {
	
	public static void main(String[] args) {
		
		Object[] o={10, "hiee", false,10.66};
		 
		int x[]= {10,20,30,40};
		
		x[0]=100;
		x[1]=200;
		x[2]=400;
		x[4]=500;
		
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);	
		}
	}

}
