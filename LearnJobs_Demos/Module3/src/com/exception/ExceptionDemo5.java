package com.exception;

public class ExceptionDemo5 {

	public static void main(String[] args) {

		calculateGrossSalary(4800);
	}

	private static void calculateGrossSalary(int basicSalary) {
		
		if(basicSalary>5000)
			try {
			throw new SalaryException();
			}catch(SalaryException se) {
				System.out.println(se.getMessage());
			}
		
			
	}

}
