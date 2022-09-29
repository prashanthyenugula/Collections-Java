package com.arrays;

import java.util.Arrays;

public class TestArray {
	
public static void main(String[] args) {
		
		int[] arr =  {11,33,21,14,25};
		System.out.println(Arrays.toString(arr));  //returns string representation of the specified array
		Arrays.sort(arr);   
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i : arr) {
			System.out.println(i);
		}
		for (int i = 0; i < arr.length; i++)  { 
			//System.out.println(arr[i]);   
		} 
		int arrayLength = arr.length; //length is an Array attribute that determines the array length 
		System.out.println("The length of the array is: "+ arrayLength); 
		
		String[] stringArray={"Hello","Java","Programming"};  
		System.out.println(Arrays.asList(stringArray));
	}

}
