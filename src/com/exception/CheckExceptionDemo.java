package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckExceptionDemo {

	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		try {
		Scanner sc = new Scanner(new File("abc.txt"));
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		}
	}
	
}
