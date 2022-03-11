//demonstration of equals() method
public class Employee {
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//overridden method from Object class
	public boolean equals(Object o) {
		Employee e=(Employee)o;//covert object ref to employee ref
		if(this.empId==e.empId && this.empName.equals(e.empName))
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"John Doe");
		Employee e2=new Employee(102,"John Doe");
		
		if(e1.equals(e2))
			System.out.println("Objects are equals");
		else
			System.out.println("Objects are not equal");
	}
	

}
