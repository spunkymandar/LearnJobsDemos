package com.collectiondemo;

import java.util.Comparator;

public class EmpSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.lastName.compareTo(o1.lastName);
	}

}
