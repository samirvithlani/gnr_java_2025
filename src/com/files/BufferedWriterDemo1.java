package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo1 {

	public static void main(String[] args) {
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("demo11.txt"))){
			writer.write("");
			writer.append("");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
