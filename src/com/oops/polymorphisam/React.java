package com.oops.polymorphisam;

class JavaScript {

	 public int data(String s) {

		System.out.println("data from js");
		return 0;
	}

}

public class React extends JavaScript {

	
	public int data(String s) {
		System.out.println("data from react");
		return 0;
	}
	public static void main(String[] args) {
		React r = new React();
		r.data("hello");
	}

}
