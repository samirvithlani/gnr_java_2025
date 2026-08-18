package com.oops.polymorphisam;

public class Flipkart {
	
	int price=100;

	public Flipkart() {

		System.out.println("flipkart default const called...");
		price = 1000;
	}

	public Flipkart(int p) {

		System.out.println("flipkart default const called...");
		price = p;
	}
	
	public void getPrice() {
		System.out.println(price);
	}

	public static void main(String[] args) {
		
		Flipkart f1 = new Flipkart();
		Flipkart f2 =new Flipkart(100);
		
		f1.getPrice();
		f2.getPrice();
	}

}
