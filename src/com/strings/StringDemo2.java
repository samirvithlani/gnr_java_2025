package com.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name = "royal";
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		//string con
		
		name += " @";
		System.out.println(name);
		
		
		
	}
}
