package com.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Niodemo1 {

	public static void main(String[] args) {

		//java 11
		Path path = Path.of("emp.txt");
		System.out.println(path);
		System.out.println(path.getFileName());
		System.out.println(path.getParent());
		System.out.println(path.isAbsolute());
		
		//before java 11
		
		Path p2 = Paths.get("emp.txt");
		System.out.println(p2);
		
		//resolve vs relatvize
		
		Path base = Path.of("compnay","employee");
		System.out.println(base.resolve("royal.txt"));
		System.out.println(base.relativize(Path.of("compnay","projects","app.java")));
		
		Path p3 = Path.of("data","..","secret.txt");
		System.out.println(p3.normalize());
				
		
		
	}
}

