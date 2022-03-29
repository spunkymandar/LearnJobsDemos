package com.shopping.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//create a bean implicity, without any configuration in xml file. And the Id is generated for the bean which is
//de-capitalized name of your class. It initiates the object via default constructor
public class Customer { //customer
	int custId;
	String custName;
	
	@Autowired
	@Qualifier(value="address1")
	Address custAddress;
	
	public Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public Customer() {
		System.out.println("default constructor invoked");
		custId=101;
		custName="Ajay";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}

		
	
}
