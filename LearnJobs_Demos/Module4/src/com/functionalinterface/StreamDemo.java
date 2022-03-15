package com.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//creating streams
		Stream<String> s1=Stream.empty();//creates empty stream
		Stream<Integer> s2=Stream.of(10,20,30,40,50);
		
		
		//print stream
		System.out.println(s2);
		
		/*
		 * intermediate operation
		 * terminal operation 
		 */
		
//		intStream.forEach((t)->System.out.println(t));
//		//intStream.forEach(System.out::print);
		List<Integer> myList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		myList.stream()
			.filter(n->n%2==0)
			.map(n->n*n)
			.forEach(System.out::println);
		//System.out.println(data.get());
			
	/*		
		List<String> myCourses=Arrays.asList("Java8","Java9","PHP","Adv.Java","Java13");
		
//		myCourses.stream()
//			.filter(coursename->coursename.startsWith("Java")!=true)
//			.forEach(System.out::println);
//		
		
		List<String> favcourseList=myCourses.stream()
			.filter(coursename->coursename.startsWith("Java"))
			.collect(Collectors.toList());
		
		System.out.println(favcourseList);
		
		
		boolean ans1=myCourses.stream()
			.allMatch(coursename->coursename.contains("Java8"));
		System.out.println(ans1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
