package com.util.emp;

public class Employee {
	private int empId;
	public Employee(int empId, String empName, Address empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}



	private String empName;
	private Address empAddress;
    
	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public Employee() {
		empId=101;
		empName="John Doe";
	}
	
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	
	//getter setter for empId
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//getter setter for empName
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public void showEmployee() {
		System.out.println(empId+" , "+empName +" , "+empAddress);
	}
	
	
}
