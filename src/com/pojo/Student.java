package com.pojo;

public class Student implements Comparable<Student> {
	
	@Override
	public int compareTo(Student st) {
		int uniCompare = this.university.compareTo(st.university);
		int clgCompare = this.college.compareTo(st.college);
		int branchCompare = this.branch.compareTo(st.branch);
		int nameCompare = this.name.compareTo(st.name);
		int idCompare = this.id.compareTo(st.id);
		
		int finalResult = (uniCompare == 0) ? (clgCompare == 0
				? (branchCompare == 0 ? (nameCompare == 0 ? idCompare : nameCompare) : branchCompare) : clgCompare)
				: uniCompare;
		return finalResult;
	}
	


	/*@Override
	public int compareTo(Student stu) {
	   int uniCompare = this.university.compareTo(stu.university);
	   if(uniCompare == 0) {
		    int clgCompare = this.college.compareTo(stu.college);
		    if(clgCompare == 0){
		    	 int branchCompare = this.branch.compareTo(stu.branch);
		    	 if(branchCompare == 0){
		    		 int nameCompare = this.name.compareTo(stu.name);
		    		 if(nameCompare == 0) {
		    			 return this.id.compareTo(stu.id);
		    			 
		    		 } else {
		    			 return nameCompare;
		    		 }
		    		 
		    	 } else {
		    		 return branchCompare;
		    	 }
		    	 
		    } else {
		    	return clgCompare;
		    }
		   
	   } else{
		   return uniCompare;
	   }*/
	   
	

	public Student(Integer id, String name, String branch, String college, String university) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.college = college;
		this.university = university;
	}

	public String toString() {
		return id + " " + name + " " + branch + " " + college + " " + university;
	}

	private Integer id;
	private String name;
	private String branch;
	private String college;
	private String university;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}


}
