package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

//java.util.Arrays
public class ArraysDemo2 {

	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,23,2,45,6,78,89,0};
		//System.out.println(Arrays.toString(a));
		String str = Arrays.toString(a);
		System.out.println(str);
		System.out.println(str.charAt(0));
		
		//array sort..
		
		//Arrays.sort(a); //it will change og array
		//Arrays.sort(a,java.util.Collections.reverseOrder()); : doubt..
	
		
//		for(int i:a) {
//			System.out.println(i);
//		}
		
		//bin search
		
		int index = Arrays.binarySearch(a, 23);
		System.out.println(index);
		
		
		
		int x[] = {1,2,3,33,44,67,89,12};
		int y[] = {1,2,3};
		
		System.out.println(Arrays.equals(x, y));
		
		
		//fill
		
		int x1[] = new int[10];
		// default 0
		Arrays.fill(x1, 100);
		System.out.println(Arrays.toString(x1));
		
		//x ->fil
		Arrays.fill(x, 0,2,99); //0 1
		System.out.println(Arrays.toString(x));
		
		//copy
		
		int p1[] = Arrays.copyOf(x,2);
		System.out.println(Arrays.toString(p1));
		
		//copy range
		int p2[] = Arrays.copyOfRange(x, 2, 5);
		System.out.println(Arrays.toString(p2));
		
		
		//compare..
		System.out.println(Arrays.compare(x,y));
		
		
		
		
		
		
		
	}
}
