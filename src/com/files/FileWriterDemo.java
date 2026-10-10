package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			//FileWriter writer = new FileWriter("output.txt");
			//FileWriter writer = new FileWriter("output1.txt",true); //by default false
			FileWriter writer = new FileWriter("output2.txt",StandardCharsets.US_ASCII); //by default false
			
//			writer.write("\n");
//			writer.write(" નમસ્તે ");
//			writer.write("नमस्ते");
//			writer.write("Testing File ");
//			writer.write("Testing File 1 ");
			//writer.write("ok");
			writer.append(" hi");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
