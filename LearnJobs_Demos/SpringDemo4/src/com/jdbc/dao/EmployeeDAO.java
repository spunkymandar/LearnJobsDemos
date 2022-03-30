package com.jdbc.dao;

import com.jdbc.beans.Employee;

//create an interface to declare CRUD operation methods
public interface EmployeeDAO {
	public int addEmployee(Employee e);
	public boolean deleteEmployee(Employee e);
//	public int updateEmployee(int empId);
//	
  
}
