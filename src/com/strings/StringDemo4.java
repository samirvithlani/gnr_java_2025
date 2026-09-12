package com.strings;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String s =" ";
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		
		
		int n=100;
		String st = String.valueOf(n);
		System.out.println(st);
		
		System.out.println(st.toString());
		
		//string formatting..
		String name = "Amit";
		int age = 25;
		
		String result = "Name = %s,Age = %d".formatted(name,age);
		System.out.println(result);
		
		//repete
		String s3 = "hi";
		System.out.println(s3.repeat(3));
		
		//indent
		String s4 = "Hello\nWorld";
		System.out.println(s4.indent(5));
		

		//bytes array
		String s5  = "Hello";
		byte[]arr = s5.getBytes();
		System.out.println(arr);
		for(byte b:arr) {
			System.out.println(b);
		}
		
	}
}
