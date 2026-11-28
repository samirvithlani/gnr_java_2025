package com.date;

import java.util.Calendar;

//java.util.Calendar ---> abstract class
public class CalendarDemo1{

	@Override
	public String toString() {
		
		return "hello";
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.AM));
		//System.out.println(c.get(Calendar.PM));
		
		
		c.set(2026, Calendar.DECEMBER,25);
		c.set(2027, Calendar.NOVEMBER,25,14,30);
		System.out.println(c.getTime());
		
		
	}
}
