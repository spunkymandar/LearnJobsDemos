import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.beans.Employee;
import com.jdbc.dao.EmployeeDAO;

public class Book_OperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new  ClassPathXmlApplicationContext("beans.xml");
		//EmployeeDAO_JdbcTemplate empimpl=(EmployeeDAO_JdbcTemplate)context.getBean("employeeDAO_jdbcTemplate");
		
		EmployeeDAO empDAO=(EmployeeDAO)context.getBean("employeeDAO_jdbcTemplate");
		int count=empDAO.addEmployee(new Employee(110,"Sacha Smith","Sales"));
		if(count>0) {
			System.out.println("Record added successfully");
		}
	}

}
