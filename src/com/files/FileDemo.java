package com.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	
	public static void main(String[] args) {
		
		File file = new File("data1.txt");
		//create new file...
		try {
			if(file.createNewFile()) {
				System.out.println("file created !!!");
			}
			else {
				System.out.println("file not created !!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
