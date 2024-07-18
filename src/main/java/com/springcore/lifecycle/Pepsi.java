package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean ,DisposableBean {
private double prise;

public double getPrise() {
	return prise;
}

public void setPrise(double prise) {
	this.prise = prise;
}

public Pepsi() {
	super();
	
}

@Override
public String toString() {
	return "Pepsi [prise=" + prise + "]";
}

@Override
public void destroy() throws Exception {
	System.out.println("destroy method");
	
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("taking pepsi init method");
	
}



}
