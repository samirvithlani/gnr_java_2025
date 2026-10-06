package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public void creteNewFile() {

		File file = new File("data.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("file created");
			} else {
				System.out.println("file not creetad..");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public boolean isExists() {
		File file = new File("demo");
		if(file.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void createFolder(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter folder name to create..");
		String foldName = sc.next();
		
		File file = new File(foldName);
		if(file.mkdir()) {
			System.out.println("folder created..");
		}
		else {
			System.out.println("folder not created..");
		}
		
	}
	
	public void checkIsFileDir() {
		
		System.out.println("enter file/folder name to check its type");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		File file = new File(data);
		
		if(file.isDirectory()) {
			System.out.println("this is folder..");
		}
		else if(file.isFile()) {
			System.out.println("it is file..");
		}
		
	}
	
	public void moveFile() {
		
		File src = new File("data1.txt");
		File dest = new File("src/com/files/data1.txt");
		
		src.renameTo(dest);
	}
	
	
	public void fileList () {
		
		File file = new File("src/com");
		File[] f = file.listFiles();
		for(File f1 :f) {
			System.out.println(f1.getName());
		}
		
	}
	
	
	public void deleteFile() {
		
		
		System.out.println("enter file/folder name to delete");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		File file = new File(data);
		
		System.out.println(file.delete());
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FileDemo2 f2 = new FileDemo2();
		System.out.println("enter your choice ::");
		System.out.println("press 1 for create file ");
		System.out.println("press 2 for check file ");
		System.out.println("press 3 for create folder ");
		System.out.println("press 4 for check type ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {

			f2.creteNewFile();

			break;
		}
		case 2: {
			// check if file is exist or nor..
				System.out.println(f2.isExists());
			break;
		}
		case 3:{
				f2.createFolder();
			break;
		}
		case 4:{
			f2.checkIsFileDir();
			break;
		}
		case 5:{
			f2.deleteFile();
			break;
		}
		case 6:{
			f2.moveFile();
			break;
		}

		case 7:{
			f2.fileList();
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}
}
