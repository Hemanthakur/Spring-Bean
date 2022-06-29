package com.Spring.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)ctx.getBean("employee1");
		System.out.println("Employee ID: "+ emp.getId());
		System.out.println("Employee Name: "+emp.getName());
	
    }
}
