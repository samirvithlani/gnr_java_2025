package com.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		
		try {
			System.out.println(a[1]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("check array size..");
		}
		finally {
			System.out.println("finally...");
		}
		
		
	}
}
