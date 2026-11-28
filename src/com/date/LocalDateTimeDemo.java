package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime dt1 = LocalDateTime.of(2026, 12,25,10,20,25);
		System.out.println(dt1);
		
		LocalDate date = dt.toLocalDate();
		System.out.println(date);
		
		LocalTime time = dt.toLocalTime();
		System.out.println(time);
		
		System.out.println(dt.plusDays(5));
		//dt.minusDays(2);
		//dt.plusHours(10)
		//dt.minusHours(0);
		
		
		
		LocalDateTime checkin = LocalDateTime.now();
		LocalDateTime checkout = checkin.plusHours(8).plusMinutes(30);
		System.out.println(checkin);
		System.out.println(checkout);
		
		
		LocalDateTime today = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yy");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh mm ss HH a EEEE");
		System.out.println(today.format(formatter));
		
		String bd = "14-02-1995";
		LocalDate date3 = LocalDate.parse(bd,formatter);
		System.out.println(date3);
		
		
		
		
	}
}
