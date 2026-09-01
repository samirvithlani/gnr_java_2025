package com.abstraction;

abstract class TRAI{
	
	public abstract void call();
	public void mms() {};
	
	public TRAI() {
		
		System.out.println("trai const...");
	}

	
}

class JIO extends TRAI{
	
	
	public void call() {
		
		System.out.println("call from jio");
	}
}

class Airtel extends TRAI{

	public void call() {
		System.out.println("call from airtel");
	}
}


public class User {

	public static void main(String[] args) {
		
		//poly
		TRAI t = new JIO();
		t.call();
		
		//TRAI t1 = new TRAI();
		
	}
}
