package com.exceptions;

import com.variables.Employee;

public class TestArrayEmployee {
	
	public static void main(String[] args) {
		
		Employee[] empArray = new Employee[10];
		
		Employee emp1 = new Employee();
		emp1.empId =100;
		emp1.empName = "naveen";
		
		
		Employee emp2 = new Employee();
		emp2.empId =200;
		emp2.empName = "ashok";
		
		Employee emp3 = new Employee();
		emp3.empId =300;
		emp3.empName = "venu";
		
		       empArray[0]=emp1;
				empArray[1]=emp2;
				empArray[2]=emp3;
				
				for (Employee employee : empArray) {
					System.out.println(employee);
				}
				
				System.out.println(emp1.empName);
	}

}
