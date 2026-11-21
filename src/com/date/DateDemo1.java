package com.date;

import java.util.Date;

//java.util.Date	
//timezone utc:5:30
//Gerogrian Caln
//1000 -->1sec --> 60 -->1min ->60min->1 hour -->1 day -->
public class DateDemo1 {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println(date);
		long timestamp = date.getTime();
		System.out.println(timestamp); //mills
		Date date2 = new Date(0);
		System.out.println(date2);
		
		//Date date3 = new Date(114, 1, 14);
		//System.out.println(date3);
		//Date date4 =new Date(0, 0, 0, 0, 0, 0);
		
		
		System.out.println(date.before(date2));
		System.out.println(date.after(date2));
		System.out.println(date.equals(date2));
		
		

	}
}
