package com.functionalinterface;

interface Calculation{
	public int addThem(int a, int b);
}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation mycalculator=(x,  y)->x+y;
		System.out.println(mycalculator.addThem(10, 20));
	}

}
