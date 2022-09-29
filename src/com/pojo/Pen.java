package com.pojo;

public class Pen implements Comparable<Pen> {
	
	@Override
	public int compareTo(Pen arg0) {
		return 0;
	}
	
	public Pen(Integer penCode, String penName) {
		super();
		this.penCode = penCode;
		this.penName = penName;
	}
	
	@Override
	public String toString() {
		return penCode+" "+penName;
	}
	
	private Integer penCode;
	private String penName;
	
	public Integer getPenCode() {
		return penCode;
	}
	public void setPenCode(Integer penCode) {
		this.penCode = penCode;
	}
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
	}


}
