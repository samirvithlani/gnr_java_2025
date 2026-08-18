package com.oops.polymorphisam;

public class Shape {

	public void area(int h) {
		System.out.println("square called...");
	}
	
	public int area(int h,int w) {
		return h*w;
	}
	void area(float r) {
		System.out.println("circle");
	}
	
	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.area(20.0f);
	}
}
