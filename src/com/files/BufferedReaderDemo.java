package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("th.txt"));
//			int ch;
//			while((ch=reader.read())!=-1) {
//				
//				System.out.print((char)ch);
//			}
			String line;
			reader.skip(10);
			System.out.println(reader.ready()); //it return true if stram is availabe for read without block
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
