package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class StringArraySorting {
	
	public static void main(String[] args) {
		
		String[] countries = {"Zimbabwe", "South-Africa", "India", "America",
				" Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		int size = countries.length; 
		//System.out.println(size);
		
		//sorts string array in alphabetical order or ascending order  
		Arrays.sort(countries); 
		//sorts array in descending order  
		Arrays.sort(countries, Collections.reverseOrder()); 
		System.out.println(Arrays.toString(countries)); 
		
		//logic for sorting   
		for(int i = 0; i<size-1; i++)  { 
			for (int j = i+1; j<countries.length; j++) {
				if(countries[i].compareTo(countries[j])>0) {
					String temp = countries[i];  
					countries[i] = countries[j];  
					countries[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countries));
	}

}
