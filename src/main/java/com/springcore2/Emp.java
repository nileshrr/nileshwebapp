package com.springcore2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String>empPhones;
	private Set<String>empAdress;
	private Map<String,String>empcourses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhones() {
		return empPhones;
	}
	public void setEmpPhones(List<String> empPhones) {
		this.empPhones = empPhones;
	}
	public Set<String> getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(Set<String> empAdress) {
		this.empAdress = empAdress;
	}
	public Map<String, String> getEmpcourses() {
		return empcourses;
	}
	public void setEmpcourses(Map<String, String> empcourses) {
		this.empcourses = empcourses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String empName, List<String> empPhones, Set<String> empAdress, Map<String, String> empcourses) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAdress = empAdress;
		this.empcourses = empcourses;
	}
	
	

}
