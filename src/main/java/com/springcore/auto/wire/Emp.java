package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("emp1")
	private Address address;
	//getter and setter
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	//default constructor
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//para
	public Emp(Address address) {
		super();
         System.out.println("I am constructor");
		this.address = address;
	}

	//to string method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	 
	
	
	
	

}
