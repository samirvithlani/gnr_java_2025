package com.oops.modifiers2;

import com.oops.modifiers.ModifiersDemo;

public class ModifiersDemo2 extends ModifiersDemo {
	
	void demo() {
		//System.out.println(dvar);
		System.out.println(f2);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
	}
}
class Modifif {
	
	void test() {
		ModifiersDemo m2 = new ModifiersDemo();
		//System.out.println(m2.f2);
		System.out.println(m2.name);
	}
}
