package com.springcore.auto.wire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/configauto.xml");
	    Emp emp= context.getBean("emp1",Emp.class);
	    System.out.println(emp);
	
	}

}
