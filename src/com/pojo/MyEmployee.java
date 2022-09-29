package com.pojo;

public class MyEmployee implements Comparable<MyEmployee> {

	/*
	 * @Override public int compareTo(MyEmployee o) { // return 1;// obj are
	 * printed in id based ascending order // return -1;// obj are printed in id
	 * based descending order return 0;// only 1 obj printed }
	 */

	public int compareTo(MyEmployee emp) {
		 int Salcompare = this.empSal.compareTo(emp.empSal);
		 if(Salcompare == 0){
			  int nameCompare = this.empName.compareTo(emp.empName);
			  if(nameCompare == 0){
				  return this.empId.compareTo(emp.empId);
			  } else {
				  return nameCompare;
			  }
		 } else {
			 return Salcompare;
		 }
	}

	/*
	 * if(this.empId < emp.empId) return -1; else if(this.empId > emp.empId)
	 * return 1; else return 0;
	 */

	public String toString() {
		return empId + " " + empName + " " + empSal;
	}

	public MyEmployee(Integer empId, String empName, String empSal) {
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
