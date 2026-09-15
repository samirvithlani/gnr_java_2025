package com.array;

public class Arraydemo1 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		System.out.println(a);
		System.out.println(a[0]);
		
		//int arr[]; //declaration
		int arr[] = new int[10];
		arr[0]=10;
		System.out.println(arr[0]);
		
		//default values  0 0  0 0 0  0 0  0 0 0 0
		//for loop
		//to find len  --> length param it is not function
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
		//foreach loop
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		
	}
}
