package com.exception;
//instanceof operator checks the instance which is pointed by the refrence 
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 10,0 };
		int div;

		try {
			div = numbers[0] / numbers[1];
			System.out.println("Division =" + div);
		} 
		//Multicatch block : update in JDK 1.8
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e ) {
			if(e instanceof ArithmeticException) {
				
			}
			if(e instanceof ArrayIndexOutOfBoundsException ) {
				
			}
		}
	}

}
/*display(Animal a){   
 *    instanceof 
 * }
 * Animal-->Dog,Cat
 * display(new Dog()); display(new Cat())
 * Exception --> ArithmeticException, ArrayIndexBut ...... 
 */
 