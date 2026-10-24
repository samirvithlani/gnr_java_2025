package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

	public static void main(String[] args) {
		Path path = Path.of("royal/ahm/gnr");
		try {
			//Files.createFile(path);
			//Files.createDirectory(path);
			Files.createDirectories(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
