package com.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FIleextcount {

	public static void main(String[] args) {
		
		Path path = Path.of("C:\\Users\\Samir\\Downloads");
		
		//check folder existance
		if(!Files.exists(path) || !Files.isDirectory(path)) {
			System.out.println("invalid dir..");
			return;
		}
		
		String[]exts = new String[100];
		int[]counts =new int[100];
		
		int extCount =0;
		
		//read direct
		try(DirectoryStream<Path> ds  = Files.newDirectoryStream(path)){
			
			for(Path file:ds) {
				//ignore folders
				if(Files.isDirectory(file)) {
					continue;
				}
				//get filename:
				String fileName = file.getFileName().toString();
				int dotIndex =fileName.lastIndexOf(".");
				if(dotIndex <=0 || dotIndex == fileName.length()-1) {
					continue;
				}
				//exten
				String extension = fileName.substring(dotIndex+1).toLowerCase();
				
				//extenstion -->array store..
				boolean found = false;
				for(int i=0;i<extCount;i++) {
					if(exts[i].equals(extension)) {
						counts[i]++;
						found = true;
						break;
					}
				}
				
				if(!found) {
					exts[extCount]=extension;
					counts[extCount]=1;
					extCount++;
					
				}
			}
			
			//display data...
			int totalFiles = 0;
			
			for(int i=0;i<extCount;i++) {
				System.out.println(exts[i] + " - "+counts[i] + "files");
				totalFiles += counts[i];
			}
			
			System.out.println("ext count  "+extCount);
			System.out.println("total files "+totalFiles);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
