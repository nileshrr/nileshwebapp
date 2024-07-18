package com.springcore.lifecycle;

public class Samosa {
private double prise;

public double getPrise() {
	return prise;
}

public void setPrise(double prise) {
	this.prise = prise;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [prise=" + prise + "]";
}
public void init() {
	System.out.println("init method");
}

public void destory() {
	System.out.println("destroy method");
}

}
