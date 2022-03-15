package com.functionalinterface;
//Consumer, Predicate, BiConsumer, IntConsumer, DoubleConsumer, Function
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> mypredicate=(t)->t%2==0;
		System.out.println(mypredicate.test(10));
		
	}

}
