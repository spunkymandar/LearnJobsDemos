package com.factory.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Application context is created !!");

		
		ApplicationContext context1=new ClassPathXmlApplicationContext(new String[]{"beans.xml","beans2.xml"});
		
	}

}
