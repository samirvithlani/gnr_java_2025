package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedexceptionDemo2 {
	
	
	public static void printData() throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(""));
	}

	
	public static void main(String[] args) throws FileNotFoundException{
		
		printData();
		
		//Scanner scanner = new Scanner(new File(""));
		
	}
}
