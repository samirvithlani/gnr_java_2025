package com.abstraction;

public abstract class Fen {
	
	public Fen() {
		System.out.println("fen const called...");
	}
	public static void demo() {
		System.out.println("demo");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		Fen.demo();
	}
}
