package com.srivastava.apps;

import java.util.ResourceBundle;

public class Factory {
	private Factory(){}
	public static IProducer getInstance(){
		Object object = null;
		ResourceBundle rb = ResourceBundle.getBundle("object");
		String className =rb.getString("classname");
		try {
			 object = Class.forName(className).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (IProducer)object;
	}
}
