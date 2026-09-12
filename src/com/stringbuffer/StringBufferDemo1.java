package com.stringbuffer;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		//initial cap : 16
		StringBuffer sb = new StringBuffer("Royal");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" Technosoft");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//append..
		
		sb.insert(2,"#");
		System.out.println(sb);
		
		//delete..
		sb.delete(2, 5);
		System.out.println(sb);
		
		//charAt
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		//replace
		sb.replace(0, 2, "Royal");
		System.out.println(sb);
		
		///setcharat
		sb.setCharAt(0, 'r');
		System.out.println(sb);
		
		
		//reverse.
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
	}
}
