package com.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.beans.Employee;

@Repository(value="employeeDAO_jdbcTemplate")
public class EmployeeDAO_JdbcTemplate implements EmployeeDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		int rows=0;
		String INSERT_EMPLOYEE="insert into employee values(?,?,?)";
		rows=jdbcTemplate.update(INSERT_EMPLOYEE, e.getEmpId(),e.getEmpName(), e.getEmpDept());
		return rows;
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}
