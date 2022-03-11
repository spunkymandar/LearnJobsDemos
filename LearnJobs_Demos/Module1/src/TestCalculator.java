
public class TestCalculator {
	public static void main(String[] args) {
		System.out.println("calculator with default behaviour -->");
		Calculator calculator=new Calculator();//create object and instantiate it by invoking
		//default constructor
		//constructor does not create object, it initializes the object 
		System.out.println(calculator.addNumbers());
		System.out.println(calculator.substractNumbers());
		
		System.out.println("Calculator with values 40,20");
		Calculator calculator2 =new Calculator(40,20);//invoke parameterized constructor
		//with 2 integers as an arguemnt 
		System.out.println(calculator2.addNumbers());
		System.out.println(calculator2.substractNumbers());
		
		System.out.println("Calculator with values 50,25 -->");
		Calculator calculator3=new Calculator(50,25);
		System.out.println(calculator3.addNumbers());
		System.out.println(calculator3.substractNumbers());
	}
}
