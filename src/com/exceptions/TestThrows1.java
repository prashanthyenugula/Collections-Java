package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TestThrows1 {
	
	public static void doMoreStuff() {
		try{
			FileInputStream fis = new FileInputStream("D:\\Screenshots\\pr1");
		} catch(FileNotFoundException e){
			System.out.println("catch print");
		}
			
			
		}
		
		public static void doStuff(){
			doMoreStuff();
		}
		public static void main(String[] args) {
           doStuff();
	}
	

}
