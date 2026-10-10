package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	
	public static void main(String[] args) {
		
		int empid = 1;
		String empName = "amit";
		int empAge = 23;
		int[] leaves = {2,3,2,1,4,5};
		char[] compnay = {'T','C','S'};
			
		
		
		try(FileWriter writer =  new FileWriter(new File("emp.txt"),true)){
			
//			writer.write("id = "+empid+" ");
//			writer.write("Name = "+empName+" ");
//			writer.write("Age = "+empAge+" ");
//			
//			for(int l:leaves) {
//				writer.write(l+" ");
//			}
//			writer.write(compnay);
			
			writer.write(String.format("ID %d | Name %s | Age %d", empid,empName,empAge));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
