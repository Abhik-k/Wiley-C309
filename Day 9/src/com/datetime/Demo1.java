package com.datetime;//first statement than import statement

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
//import java.time.*;

public class Demo1 {
	public static void main(String[] args) {
		//EARLIER
		Date date=new Date();
		System.out.println(date);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.YEAR));
		
		//NOW
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		
		LocalDate jan1= LocalDate.of(2022,Month.FEBRUARY,1);
		System.out.println(jan1);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate ld= LocalDate.parse("12-Mar-2022",formatter);//Convert String to LocalDate
		System.out.println(ld);
		//DateTimeFormatter is a class that will format the date
		
	}
	
	
}
