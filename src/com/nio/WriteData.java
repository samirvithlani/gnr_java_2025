package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteData {

	public static void main(String[] args) {
		
		Path path = Path.of("java1.txt");
		try {
			//Files.writeString(path,"\n welcome to java 21",StandardOpenOption.APPEND);
			//Files.writeString(path,"\n welcome to java 21",StandardOpenOption.CREATE_NEW);
			Files.writeString(path,"\n welcome to java 21",StandardOpenOption.CREATE,StandardOpenOption.WRITE);
			System.out.println("data has been added...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
