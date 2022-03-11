package com.inheritance;
/*
 * Every Java class has inbuilt super class : Object
 * any class extends Object class by default 
 * Object class is termed as cosmic super class 
 * Object class provides methods like: toString(), equals(), hashCode(), clone(), finalize()
 */
public class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	//overridden method: Invoked when you print reference of object
	public String toString() {
		return empId + ", "+empName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"John Doe");
		
		System.out.println(e1);//System.out.println(e1.toString());
		//toString() method is String representation of Object
		int location=e1.hashCode();
		System.out.println("Hash value of e1 ="+location);

	}

}
