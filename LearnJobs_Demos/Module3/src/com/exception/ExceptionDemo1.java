package com.exception;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		int num1, num2, add, sub, div, mul;
		num1 = 10;
		num2 = 0;

		add = num1 + num2;
		System.out.println("Addition =" + add);

		sub = num1 - num2;
		System.out.println("Substraction =" + sub);

		try {
			div = num1 / num2;
			System.out.println("Division =" + div);
		} catch (ArithmeticException arithmeticException) {
			//System.out.println("Cannot divide by zero");
			System.err.print("Cannot divide by zero");
		}

		mul = num1 * num2;
		System.out.println("Multiplication =" + mul);

	}

}
