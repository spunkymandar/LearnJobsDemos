
public class Student {
	int studentId;
	String studentName;
	Address studentAddress;//containment :has-a kind relationship
	
	public Student(int studentId, String studentName, Address studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public String toString() {
		return studentId +" , "+studentName+" , "+"Address :"+studentAddress;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1,"Upendra",new Address("Lotus","Mumbai",65));
		System.out.println(s1);
	}
	
}
//Employee:id,name,dtjoing,dtconfm,dateretirement
