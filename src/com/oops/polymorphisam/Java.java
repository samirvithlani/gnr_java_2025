package com.oops.polymorphisam;


public class Java {

	public void test() {};
	
	public Java getJava() {
//		Java j = new Java();
//		return j;

		return new Java(); //002
	}
	
	public static void main(String[] args) {

		
		Java j1 = new Java(); //001
		System.out.println(j1); //001
		
		//Java j2 = j1.getJava();
		j1 = j1.getJava(); //002
		System.out.println(j1);
		//System.out.println(j2);
		
	}
}
