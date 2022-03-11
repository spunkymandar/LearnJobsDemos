package com.iooperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("Enter any value :");
//		char x=(char)isr.read();
//		System.out.println("You entered :"+x);
		
		BufferedReader in=new BufferedReader(isr);
		int value=Integer.parseInt(in.readLine());
		
		
	}

}
