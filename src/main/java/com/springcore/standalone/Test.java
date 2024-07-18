package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("com/springcore/standalone/saconfig.xml");
		Person person1= context.getBean("person",Person.class);
		System.out.println(person1);
	}

}
