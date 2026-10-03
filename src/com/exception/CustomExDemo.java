package com.exception;

class InValidStringException extends Exception{
	
	public InValidStringException(String msg) {
		super(msg);
	}
}

public class CustomExDemo {
	
	
	

	public static void main(String[] args) {
		
	
		String str = "hello";
		try {
		if(str.length()<10) {
			throw new InValidStringException("min 10 chars are required !!");
		}
		}catch (InValidStringException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
}
