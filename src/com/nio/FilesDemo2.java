package com.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesDemo2 {

	public static void main(String[] args) {
		Path src = Path.of("output.txt");
		Path dest = Path.of("royal/emp12.txt");
		try {
		//	Files.copy(src,dest);
			//Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
			//Files.move(src, dest);
			//Files.move(src, dest,StandardCopyOption.REPLACE_EXISTING);
			//Files.delete(Path.of("log.txt"));
			Files.deleteIfExists(Path.of("log.txt"));
			System.out.println(Files.exists(src));
			System.out.println(Files.notExists(src));
			System.out.println(Files.isRegularFile(src));
			System.out.println(Files.isDirectory(src));
			System.out.println(Files.isReadable(src));
			System.out.println(Files.isWritable(src));
			System.out.println(Files.size(src));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
