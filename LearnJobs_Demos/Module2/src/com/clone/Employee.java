package com.clone;
//ways to create object: 1. by using new keyword 2. by using clone
//cloning : cloneable interface is marker interface present in java.lang
public class Employee implements Cloneable{
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId +","+empName;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"John Doe");
		Employee e2=null;
		try {
			e2=(Employee)e1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("content of e1:"+e1);
		System.out.println("content of e2:"+e2);
		
		System.out.println("hash of e1:"+e1.hashCode());
		System.out.println("hash of e2:"+e2.hashCode());
		
		
	}
	

}
