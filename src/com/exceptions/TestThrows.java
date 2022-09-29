package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestThrows {
	
	public static void main(String[] args)  {
		System.out.println("start");
		try {
		FileInputStream fis = new FileInputStream("D:\\Screenshots\\pr1\\test.txt");
		} catch(FileNotFoundException e){
			System.out.println("hello");
		}
		System.out.println("end");
		
	}

}
