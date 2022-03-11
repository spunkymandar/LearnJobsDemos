package com.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String are first class objects in java
		 */
		String str=new String("LearnJava");
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.toUpperCase());
		
		//Strings are immutable objects :non modifiable
		//I cannot change the content of string objects
		
		String str1="good morning";
		str1="good evening";//reinitialize the string 
		System.out.println(str1);
		str1=str1.toUpperCase();
		System.out.println(str1);
		
		System.out.println(str1.substring(5,8));
		/*
		 * These are not first class object
		StringBuffer :mutable versions of Strings
		StringBuilder
		*/
		StringBuffer sb=new StringBuffer("Java");//synchronized
		
		StringBuilder sb1;//non-synchronized
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
