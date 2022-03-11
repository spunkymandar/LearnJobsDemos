
public class Employee {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public void displayEmployee() {
		System.out.println(this.empId +"  , "+this.empName);
	}

}
