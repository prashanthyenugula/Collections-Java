package com.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TestComparable implements Comparator<Versity> {

	
	public static void main(String[] args) {
		
		Versity v1 = new Versity(500, "Prashanth", "Geetham", "HYD", "1999");
		Versity v2 = new Versity(501, "Shravan", "Geetham", "HYD", "1999");
		Versity v3 = new Versity(502, "Pavan", "Geetham", "HYD", "1999");
		Versity v4 = new Versity(503, "Anil", "Geetham", "HYD", "1999");
		
		TreeSet<Versity> set = new TreeSet<>(new TestVersityNameCompare());
		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4);
		
		System.out.println(set);

	}

	@Override
	public int compare(Versity o1, Versity o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
  class Versity implements Comparable<Versity>{
	 
	 @Override
		public int compareTo(Versity o) {
			// TODO Auto-generated method stub
			return 0;
		}
	 
	 
	 @Override
	public String toString() {
		return vId+" "+name+" "+college+" "+location+" "+estd;
	}
	
	public Versity(Integer vId, String name, String college, String location, String estd) {
		super();
		this.vId = vId;
		this.name = name;
		this.college = college;
		this.location = location;
		this.estd = estd;
	}


	private Integer vId;
	private String name;
	private String college;
	private String location;
	private String estd;
	
	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEstd() {
		return estd;
	}

	public void setEstd(String estd) {
		this.estd = estd;
	}

	
 }