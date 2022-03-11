package com.exception;

public class NoException {
	public static void main(String[] args) {
		int num1, num2, add, sub, div, mul;
		num1 = 10;
		num2 = 0;

		add = num1 + num2;
		System.out.println("Addition =" + add);

		sub = num1 - num2;
		System.out.println("Substraction =" + sub);

		if (num2 != 0) {
			div = num1 / num2;// cannot divide any number by zero
			System.out.println("Division =" + div);
		}
		else
			System.out.println("Division is not possible!!");
	
		mul = num1 * num2;
		System.out.println("Multiplication =" + mul);

	}

}
