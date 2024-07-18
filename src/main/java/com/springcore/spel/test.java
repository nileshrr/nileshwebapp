package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/spel/anna.xml");
		Demo de=context.getBean("demo",Demo.class);
		System.out.println(de);
	}

}
