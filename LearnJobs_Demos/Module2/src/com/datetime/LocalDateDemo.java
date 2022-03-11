package com.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo {
	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();//LocalDate.now returns current date
		LocalDate date2=date1.plusDays(10).plusMonths(5).plusYears(1);
		
		int days=Period.between(date1, date2).getDays();
		System.out.println(days);
		
		
		
		
		
//		String formattedDate=today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
//		System.out.println(formattedDate);
		
		/*
		LocalDate specifiedDate=LocalDate.of(2020, Month.APRIL, 30);
		System.out.println(specifiedDate);
		
//		LocalDate todayIndia=LocalDate.now(ZoneId.of("Asia/Kolkota"));
//		System.out.println(todayIndia);
//		
		LocalDate datefromFormat=LocalDate.ofEpochDay(365);
		System.out.println(datefromFormat);
		*/

	}

}
