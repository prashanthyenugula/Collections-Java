package com.set;

import java.util.Set;
import java.util.TreeSet;

import com.pojo.Student;

public class PracticeTree {
	
	public static void main(String[] args) {
		
		Student st1 = new Student(100, "Chandu", "ECE", "MLRIT", "JNTUH");
		Student st2 = new Student(101, "Chandu", "ECE", "MLRIT","JNTUH");
		Student st3 = new Student(102, "Chandu", "ECE", "MLRIT", "JNTUH");
		Student st4 = new Student(103, "Chandu", "ECE","MLRIT", "JNTUH");
		Student st5 = new Student(104, "Chandu", "ECE", "MLRIT","JNTUH");
		
		Set<Student> set = new TreeSet<>();
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		set.add(st5);
		
		System.out.println(set);
		
	}

}
