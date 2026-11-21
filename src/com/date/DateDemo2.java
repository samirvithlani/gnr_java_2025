package com.date;

import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		long sevenDays = 7l *24*60*60*1000;
		
		Date d2 = new Date(d.getTime()+sevenDays);
		System.out.println(d2);
				
		
//		d.setDate(14);
//		d.setHours(0);
//		d.setMinutes(0);
//		d.setMonth(0);
//		d.setSeconds(0);
//		d.setYear(0);
//		
		
		
	}
}
	