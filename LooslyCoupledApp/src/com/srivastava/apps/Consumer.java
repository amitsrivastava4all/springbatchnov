package com.srivastava.apps;

public class Consumer {
	
	public static void main(String[] args) {
		IProducer producer = Factory.getInstance();
		//IProducer  producer = new Producer(); // Tightly Coupled App
		producer.callMe();
		
	}

}
