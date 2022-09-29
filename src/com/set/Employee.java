package com.set;

public class Employee {
	
	// same hashCodes in different Objects
	// it will print only one object with same hashCode
	
	/*public int hashCode(){
		return 500;
	}   
	
	public boolean equals(Object obj) {
		return true;
	}*/
	
	@Override
	public int hashCode() {
		return empId.hashCode()+ empName.hashCode()+empSal.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Employee emp2= (Employee) obj;
		
		if(this.empId.equals(emp2.empId) && this.empName.equals(emp2.empName) && this.empSal.equals(emp2.empSal)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public String toString() {
		return empId+" "+empName+" "+empSal;
	}
	
	public Employee(Integer empId, String empName, String empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	private Integer empId;
	private String empName;
	private String empSal;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
}

