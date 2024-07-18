package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Nilesh" );
      ApplicationContext  context=new ClassPathXmlApplicationContext("com/springcore/configFile.xml");
    Student student2=(Student) context.getBean("student1");
    Student student4=(Student) context.getBean("student3");
    System.out.println(student2);
    System.out.println(student4);
    }
}
