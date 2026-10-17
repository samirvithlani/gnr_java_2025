package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("th.txt")){
			
			
			
			int ch;
//			while((ch=fis.read())!= -1) {
//				System.out.print((char)ch);
//			}
			
			//byte []data = fis.readAllBytes();
			fis.skip(5);
			byte []data = fis.readNBytes(10);
			System.out.println(new String(data,java.nio.charset.StandardCharsets.UTF_8));
 			
//			byte[] data = new byte[10];
//			while((ch =fis.read(data))!=-1) {
//				System.out.write(data,0,ch);
//			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
