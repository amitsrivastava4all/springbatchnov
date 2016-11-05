package com.srivastava.apps;

public class Producer implements IProducer {
	public void callMe(){
		System.out.println("Consumer Call Me");
	}
	
	public void dontCallMe(int x){
		System.out.println("Consumer Don't Call me");
	}

}
