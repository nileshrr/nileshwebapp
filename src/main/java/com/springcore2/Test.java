package com.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context1 =new ClassPathXmlApplicationContext("com/springcore2/config.xml");
Emp emp1=(Emp) context1.getBean("Emp1");
System.out.println(emp1.getEmpName());
System.out.println(emp1.getEmpPhones());
System.out.println(emp1.getEmpAdress());
System.out.println(emp1.getEmpcourses());
}

}
