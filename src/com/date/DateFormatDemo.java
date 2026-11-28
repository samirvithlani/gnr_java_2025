package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {
	
		Date d = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy hh");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm:ss a EE");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm:ss a EEEE");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm:ss a E");
		System.out.println(sdf.format(d));
	}
}
