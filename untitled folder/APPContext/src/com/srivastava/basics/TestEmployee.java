package com.srivastava.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("Main Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee)context.getBean("employeeBeanObject");
//		System.out.println(employee);
//		
//		Employee employee2 = (Employee)context.getBean("employeeBeanObject");
//		Employee employee3 = (Employee)context.getBean("employeeBeanObject");
//		if(employee == employee2 && employee== employee3){
//			System.out.println("Same Ref");
//		}
//		else
//		{
//			System.out.println("Not same ref");
//		}
	}

}
