
public class Task {
	//data members
	int data=100;
	
	//behaviour
	public void doSomething() {
		System.out.println("In the method doSomething");
	}
	
	public static void main(String[] args) {
		
		//classname ref=new class_name();
		Task t1=new Task();
		/*
		 * stack memory : stores reference, local variables
		 * Heap memory : actual object
		 */
		
		
		t1.doSomething();
		
	}
}
