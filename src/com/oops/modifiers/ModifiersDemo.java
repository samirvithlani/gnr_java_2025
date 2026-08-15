package com.oops.modifiers;

class ModifiersParent{
	
	int x=100;
	protected float f1 = 100.0f;
	private int grant() {
		System.out.println(x);
		System.out.println(f1);
		return 10000;
		
	}
	
	
}

public class ModifiersDemo extends ModifiersParent {

	private String driverName = "amit";
	int dvar = 10000;
	protected float f2 = 200.0f;
	
	public String name = "rahul";
	
	
	private void demo() {
		System.out.println("demo private method of modifier class");
		System.out.println(driverName);
		System.out.println(f1);
	}
	
	public static void main(String[] args) {
		
		ModifiersDemo m1 = new ModifiersDemo();
		m1.demo();
		System.out.println(m1.x);
		//m1.grant();
//		ModifiersParent m2 = new ModifiersParent();
//		m2.grant();
	}
}
