
public class ArrayDemo {
	public static void main(String[] args) {
		
		//datatype[] array_name=new datatype[size]
		//int[] intArray=new int[5];
	//	int[] intArray=new int[] {12,43,12};
		int[] intArray= {23,54,23,54};
		/*
		 * 1. the reference is stored on stack 
		 * 2. Actual array is stored on heap: One memory block is assigned to entire array
		 *    ** anything that is present in heap, will have default value 
		 */
		
//		intArray[0]=45;
//		intArray[1]=34;
		
		
		
		
//		System.out.println(intArray);
//		for(int i=0;i<intArray.length;i++) {
//			System.out.println(intArray[i]);
//		}
//		
//		//enhanced for loop
//		for(int x:intArray) {
//			System.out.println(x);
//		}
		
		int x =10;
	//	Employee e =new Employee(1,"John Doe");
		
		
//		int[] arr1=new int[] {10,20,40};
//		Employee[] empArray=new Employee[] {new Employee(1,"John Doe")};
//		
		
		Employee[] empArray=new Employee[] {new Employee(101,"Rajesh"),
											new Employee(102,"Umesh"),
											new Employee(103,"Sachin")};
		
		//System.out.println(empArray);
		
		for(Employee e:empArray) {
			
			e.displayEmployee();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
