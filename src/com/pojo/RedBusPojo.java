package com.pojo;

public class RedBusPojo implements Comparable<RedBusPojo> {
	
	@Override
	public int compareTo(RedBusPojo rb) {
		int fareCompare = this.fare.compareTo(rb.fare);
		int serviceNoCompare = this.serviceNo.compareTo(rb.serviceNo);
		
		return (fareCompare == 0) ? serviceNoCompare:fareCompare;
	}
	
	public RedBusPojo(Integer serviceNo, String serviceName, Integer fare, String departureTime, String arrivalTime) {
		super();
		this.serviceNo = serviceNo;
		this.serviceName = serviceName;
		this.fare = fare;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return serviceNo+" "+serviceName+" "+fare+" "+departureTime+" "+arrivalTime;
	}
	
	private Integer serviceNo;
	private String serviceName;
	private Integer fare;
	private String departureTime;
	private String arrivalTime;
	
	public Integer getServiceNo() {
		return serviceNo;
	}
	public void setServiceNo(Integer serviceNo) {
		this.serviceNo = serviceNo;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getFare() {
		return fare;
	}
	public void setFare(Integer fare) {
		this.fare = fare;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	

}
