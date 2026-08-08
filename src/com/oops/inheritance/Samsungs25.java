package com.oops.inheritance;

class Google {

	public int version = 17;

	public void notification() {

		System.out.println("notification from Google");
	}
}

class Android extends Google {

	public int getVersion() {

		return version;
	}

	public void notification() {

		System.out.println("notification from android");
	}

}

public class Samsungs25 extends Android {

	public static void main(String[] args) {

		Samsungs25 s25 = new Samsungs25();
		System.out.println(s25.getVersion());
		s25.notification();
		
		Android a = new Android();
		a.notification();
		
		Google g = new Google();
		g.notification();
		
		
	}
}
