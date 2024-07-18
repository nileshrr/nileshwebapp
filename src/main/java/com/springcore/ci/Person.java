package com.springcore.ci;

public class Person {
	private String personName;
	private int personId;
	
//	Parameterized constructor
	public Person(String personName, int personId) {
		super();
		this.personName = personName;
		this.personId = personId;
	}
	public Person(String personName, double personId) {
		super();
		this.personName =(String) personName;
		this.personId =(int) personId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.personName+" : "+this.personId;
	}
	
	
	
	
}
