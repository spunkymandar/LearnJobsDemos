package com.collectiondemo;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	String firstName,lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	@Override
	public int hashCode() {
		return this.firstName.length() *7;
	}


	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName))
			return true;
		return false;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	//Natural sorting for TreeSet for sorting 
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.firstName.compareTo(this.firstName);
		/* -1 :if first object is less than second object
		 * 0  : if both the objects are equal
		 * 1  : if first object is more than second object
		 * 
		 */
	}
	

}
