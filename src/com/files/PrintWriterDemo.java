package com.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		int age =21;
		char grade ='A';
		boolean passed = true;
		String name = "ram";
		
		String []names = {"vedant","raj","parth"};
		int [] marks = {92,88,79};
		
		try {
			//PrintWriter pw = new PrintWriter("studentres.txt");
			PrintWriter pw = new PrintWriter(new FileWriter("studentres.txt",true));
			
			//pw.println(age);
//			pw.printf("Name:%s%n",name);
//			pw.printf("Age:%s%n",age);
			
			for(int i=0;i<names.length;i++) {
				pw.printf("%-20s %d%n", names[i],marks[i]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
