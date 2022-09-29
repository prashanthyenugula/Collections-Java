package com.exceptions;

public class TestArrays {
	
	public static void main(String[] args) {
		
		int x[] = new int[10];
		 
		x[0]=100;
		x[1]=200;
		x[4]=400;
		x[6]=600;
		 
		for(int i=0;i<x.length; i++){
			System.out.println(x[i]);
			
		}
	}

}
