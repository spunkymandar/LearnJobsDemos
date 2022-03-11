import static java.lang.Math.min;
import static java.lang.System.out;
public class Calculator {
	//data members
	int x,y;
	
	//default constructor
	public  Calculator() {
		
		out.println("Constructor is invoked!!");
		x=10;
		y=5;
	}
	
	//parameterized / overloaded constructor
	public Calculator(int value1, int value2) {
		x=value1;
		y=value2;
	}
	public int addNumbers() {
		return x+y;
	}
	public int substractNumbers() {
		return x-y;
	}
	
	public void doMathProcess() {
		min(10, 4);//static method from Math class from java.lang
		
	}
	
	//Rules for constructor 
	
}






