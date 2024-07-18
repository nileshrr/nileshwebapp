package com.springcore.auto.wire;

public class Address {
	private String streetName;
	private String streetCity;
	//getter and setter
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetCity() {
		return streetCity;
	}
	public void setStreetCity(String streetCity) {
		this.streetCity = streetCity;
	}
	//default constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//parameterized constructor
	public Address(String streetName, String streetCity) {
		super();
		this.streetName = streetName;
		this.streetCity = streetCity;
	}
	//to string method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
