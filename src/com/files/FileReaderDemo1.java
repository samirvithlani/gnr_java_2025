package com.files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("th.txt")) {

//			int x = reader.read();
//			System.out.println(x);
//
//			int ch;
//			int c=0;
//			while ((ch = reader.read()) != -1) {
//				System.out.print((char) ch);
//				c++;
//			}
//			System.out.println(c);

			char [] buffer = new char[10];
			int count;
			int c=0;
			
			while((count=reader.read(buffer))!=-1) {
				c++;
				System.out.print(new String(buffer,0,count));
			}
			
			System.out.println(c);

		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
