package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDriver {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(" com/springcore/lifecycle/configlifecycle.xml");
		Samosa s1=(Samosa) context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook();
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
	}

}
