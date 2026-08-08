package com.oops.inheritance;

class GrandParent{
	
	public GrandParent() {
		
		System.out.println("Grand parent class const called..");
	}
	public int property=1;
	
	public void land() {
		System.out.println("10 acer land..");
	}
	
}

public class Parent extends GrandParent {
	
	public Parent() {
		
		System.out.println("parent class const called !!");
	}

	public void access() {
		System.out.println(property);
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.access();
		p.land();
	}
}
