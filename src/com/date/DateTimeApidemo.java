package com.date;

import java.time.LocalDate;

public class DateTimeApidemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate tom = LocalDate.of(2026, 11,25);
		System.out.println(tom);
		
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getEra());
		System.out.println(today.getChronology());
		
	}
}
