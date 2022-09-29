package com.arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		array[0]=1;
		array[1]=2;
		
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[5]); // Here array Index outofBoundsException
	}

}
