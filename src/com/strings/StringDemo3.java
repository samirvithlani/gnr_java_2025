package com.strings;

public class StringDemo3 {

	
	public static void main(String[] args) {
		
		String name  = "java";
		char[] arr = name.toCharArray();
		System.out.println(arr);
		
		for(char c:arr) {
			System.out.println(c);
		}
		
		//compare 2 strings
		String a = "java";
		String b = "java";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String a1 = new String("java");
		String a2 = new String("java");
		
		System.out.println(a1==a2); //same object..
		System.out.println(a1.equals(a2)); //same value..
		
		System.out.println(a1.equalsIgnoreCase(a2)); //cap same ignore
		
		
		
		//compare alph
		
		String ap = "apple";
		String bn = "banana";
		System.out.println(ap.compareTo(bn)); // int
		System.out.println(bn.compareTo(ap)); // int
		
		//ap.compareToIgnoreCase(//bn)
		
		
		//upercase
		
		String country = "india";
		country = country.toUpperCase();
		System.out.println(country);
		country = country.toLowerCase();
		System.out.println(country);
		
		//
		String email = "   samir@gmail.com  ";
		System.out.println(email.length());
		email = email.trim();
		System.out.println(email);
		System.out.println(email.length());
		
		email = "   samir@gmail.com  ";
		System.out.println(email.length());
		email = email.strip();
		System.out.println(email.length());
		
		//email.stripLeading(); //right side
		//email.stripTrailing(); // left
		
		//starstwith
		
		String data = "Hello India";
		System.out.println(data.startsWith("Hello"));
		System.out.println(data.startsWith("India",6));
		
//		data.endsWith(//data)e
		
		//contains..
		System.out.println(data.contains("I"));
		
		//indexOf
		System.out.println(data.indexOf("I"));
		System.out.println(data.lastIndexOf("I"));
		
		
		//subString
		String str = "Python";
		System.out.println(str.substring(2));
		System.out.println(str.substring(3, 5));
		
		String data1 = "hi this is java , java is programming language";
		//data1 = data1.replace("java", "Python"); //except only string
		//data1 = data1.replaceFirst("java", "Python");
		data1 = data1.replaceAll("java", "Python"); //can except regex also
		System.out.println(data1);
		
		//split
		String strs[] = data1.split(" ");
		for(String x:strs) {
			System.out.println(x);
		}
		
		//join..
		String res = String.join("-", "h","e","l","l","o");
		System.out.println(res);
		
		
	}
}
