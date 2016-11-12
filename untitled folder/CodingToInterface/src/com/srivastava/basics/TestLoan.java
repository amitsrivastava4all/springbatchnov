package com.srivastava.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestLoan {
public static void main(String[] args) {
	// Read the XML From Specified Location 
	BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	//Loan loan = (Loan)beanFactory.getBean("loanObject");
	//AutoLoan loan = (AutoLoan)beanFactory.getBean("loanObject");
	
	//System.out.println("EMI is "+loan.getEMI());
	int ch=1;
	if(ch==1){
		
		Loan loan = (Loan)beanFactory.getBean("loanObject1");
		System.out.println("EMI is "+loan.getEMI());
	}
	else
	if(ch==2){
		Loan loan = (Loan)beanFactory.getBean("loanObject2");
		System.out.println("EMI is "+loan.getEMI());
	}
}
}
