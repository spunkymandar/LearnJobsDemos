package com.factory.init;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		//BeanFactory beanfactory1=new XmlBeanFactory(new FileSystemResource("d:\\beans.xml"));
		
		
		System.out.println("BeanFactory created successfully");
	}

}
