package com.oops.inheritance;

class Apple{
	
	public Apple(int model) {
		
		System.out.println("Apple class const called.."+model);
	}
	
}
public class Iphone extends Apple {

//	public Iphone() {
//		//System.out.println("ok"); error... compile time error
//		super(16);
//	}

	public Iphone(int m) {
		super(m);
	}
	public static void main(String[] args) {
		
		Iphone i16 = new Iphone(16);
	}
	
	
}
