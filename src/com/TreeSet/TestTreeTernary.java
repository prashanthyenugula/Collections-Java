package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeTernary {
	
	public static void main(String[] args) {
		
		University uv1 = new University(501, "Geetham", "Vizag", "1993");
		University uv2 = new University(502, "Nalanda", "Patna", "1873");
		University uv3 = new University(503, "JNTU", "Kukatpally", "1966");
		University uv4 = new University(504, "OU", "Secundrabad", "1890");
		
		
		Set<University> set = new TreeSet<>();
		set.add(uv1);
		set.add(uv2);
		set.add(uv3);
		set.add(uv4);
		
		System.out.println(set);
		
	}
	
}
 class University implements Comparable<University> {
	
	@Override
	public int compareTo(University o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public String toString() {
		return uniId+" "+uniName+" "+uniLocation+" "+uniEstd;
	}
     public University(Integer uniId, String uniName, String uniLocation, String uniEstd) {
		this.uniId = uniId;
		this.uniName = uniName;
		this.uniLocation = uniLocation;
		this.uniEstd = uniEstd;
	}
	
	private Integer uniId;
	private String uniName;
	private String uniLocation;
	private String uniEstd;
	
	public Integer getUniId() {
		return uniId;
	}
	
	public void setUniId(Integer uniId) {
		this.uniId = uniId;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public String getUniLocation() {
		return uniLocation;
	}

	public void setUniLocation(String uniLocation) {
		this.uniLocation = uniLocation;
	}

	public String getUniEstd() {
		return uniEstd;
	}

	public void setUniEstd(String uniEstd) {
		this.uniEstd = uniEstd;
	}

}


