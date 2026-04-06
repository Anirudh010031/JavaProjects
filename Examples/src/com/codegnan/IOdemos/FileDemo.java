package com.codegnan.IOdemos;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		File dir = new File("my notes");
		 
		 if(!dir.exists()) {
			 
			 if(dir.mkdir()) {
				 
				 System.out.println("Directory is created :" +dir.getAbsolutePath());
			 }else {
				 System.out.println("Failed to create a Directory:" );
			 }
			 
		 }else {
			 System.out.println("Directory already exists:" +dir.getAbsolutePath());
		 }
		 
		 //create file objects 
		 File file1 = new File(dir,"trial1.txt");
		 File file2 = new File(dir,"trial2.txt");
		 File file3 = new File(dir,"trial3.txt");
		 File file4 = new File(dir,"trial4.txt");
		 
		 System.out.println("trial1.txt created "+file1.createNewFile());
		 System.out.println("trial2.txt created "+file2.createNewFile());
		 System.out.println("trial3.txt created "+file3.createNewFile());
		 System.out.println("trial4.txt created "+file4.createNewFile());
		 
		 //list the files present in a directory
		 String[] fileNames = dir.list();
		 if(fileNames==null|| fileNames.length==0) {
			 System.out.println("Directory is empty");
		 }else {
			 System.out.println("Contents of Directory:");
			 for(String fileName : fileNames) {
				 System.out.println(fileName);
			 }
		 }
		 
		 
		 
	}

}
