package com.util.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e=(Employee)context.getBean("emp2"); //emp2 is id which is present in beans.xml
		
		e.showEmployee();
		
		Employee e1=(Employee)context.getBean("emp3");
		e1.showEmployee();
		
		Employee e2=(Employee)context.getBean("emp4");
		e2.showEmployee();
		
		
	}

}
