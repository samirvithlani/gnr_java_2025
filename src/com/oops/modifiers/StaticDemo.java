package com.oops.modifiers;

final class Java{
	
}


public class StaticDemo{

	static String collage = "LD";
	final float pi=3.14f;
	static int x;
	final int y=100;
	int p;
	
	public void test() {
	//	static int y1=100;
		final int p=100;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(StaticDemo.collage);
		StaticDemo.collage = "GIT";
		System.out.println(StaticDemo.collage);
		System.out.println(x);
	}
}
