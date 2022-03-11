package com.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime t1=LocalTime.now();
		LocalTime t2=t1.plusHours(10).plusMinutes(15).plusSeconds(15);
		
		long secs=Duration.between(t1, t2).getSeconds();
		System.out.println(secs);
		
//		System.out.println("Current Time :"+today);
//		
//		LocalTime specifiedTime=LocalTime.of(12, 20,25,40);
//		System.out.println(specifiedTime);
//		
//		
//		LocalDateTime today1=LocalDateTime.now();
//		System.out.println(today1);
//		
	}

}
