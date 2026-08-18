package com.oops.polymorphisam;

class Meta{
	
	public void smile() {
		System.out.println("smile from metas");
	}
	
	
}
class Os1 extends Meta{
	
	public void smile() {
		System.out.println("smile from os1");
	}
	
}

class Os2 extends Meta{
	
	public void smile() {
		System.out.println("smile from os2");
	}
	
}

public class Facebook {

	
	public static void main(String[] args) {
		
	//parent class Meta child os1,os2
		//polymorphic object
		
	//parent class reg child class memory
	Meta m1 = new Os2();
	m1.smile();
		
	}
}
