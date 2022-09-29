package com.set;

public class PracEmployee {
	
	public int hashCode(){
		return empId.hashCode()+empName.hashCode();
	}
	public boolean equals(Object obj) {
		PracEmployee pr =  (PracEmployee) obj;
		
		if(this.empId.equals(pr.empId) && this.empName.equals(pr.empName)) {
			return true;
		} else{
			return false;
		}
		
	}
	
	public String toString() {
		return empId+" "+empName+" "+empSal;
	}
	
	public PracEmployee(Integer empId, String empName, String empSal) {
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
