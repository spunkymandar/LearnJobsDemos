package com.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer1=(x)->System.out.println("Value of x ="+x);
		consumer1.accept(10);
		
		List<String> myList=Arrays.asList("Sachin","Rakesh","Sam","Yogesh");
		myList.forEach(s->System.out.println(s));
		
		myList.forEach(System.out::println);//method reference
		
	}

}
