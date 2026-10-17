package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo2 {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("log.txt"))){
			
			System.out.println(reader.readLine());
			//save current position 
			reader.mark(1);
			System.out.println("\nPreview");
			System.out.println(reader.readLine());
			System.out.println(reader.readLine());
			
			reader.reset();
			System.out.println("\n process again");
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println("processing "+line);
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
