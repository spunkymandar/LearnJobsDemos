package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;



public class EmpCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Sachin","Patil");
		Employee e2=new Employee("Vishal","Powar");
		Employee e3=new Employee("Aman","Verma");
		Employee e4=new Employee("Sachin","Patil");
		Employee e5=new Employee("Bipin","Patukule");
		
		TreeSet<Employee> empSet=new TreeSet<Employee>();
		//Employee class must override equals() and hashCode
		//To compare the object you must need to implemente Comparable in the class
		empSet.add(e1);empSet.add(e2);empSet.add(e3);empSet.add(e4);empSet.add(e5);
//		
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);empList.add(e5);
//		
		for(Employee e:empSet)
			System.out.println(e);//toString() method of employee
//	
		//Sorting of object in descending order of lastname
		
		Collections.sort(empList, new EmpSort());
		
		for(Employee e:empList)
			System.out.println(e);//toString() method of employee
//	
	}

}
