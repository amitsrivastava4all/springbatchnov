package com.srivastava.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) {
		// DI 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		IProducer iproducer = (IProducer)context.getBean("producerObject");
		iproducer.callMe();
	}

}
