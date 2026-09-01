package com.strings;

public class StringDemo1 {
	
	//string is immutable 
	static String prog = "royal";

	public static void main(String[] args) {

		String s1 ="java";
		System.out.println(s1);
		
		String s2 = new String("javascript");
		System.out.println(s2);
		
		//System.out.println(s1[]);
		System.out.println(s1.charAt(0));
		s1 = "JAVA";
		//s1.toLowerCase(); immutablity
		System.out.println(s1);
		
		System.out.println(prog);
		prog.toUpperCase();
		System.out.println(prog);
		
	}
}
