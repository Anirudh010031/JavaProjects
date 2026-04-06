package com.codegnan.IOdemos;

import java.io.File;
import java.io.IOException;

public class Demo {

	 public static void main(String[] args) throws IOException {
		File file = new File("jfs51.txt");
		
		//exists() - this return a boolean value if the file is present or not.
		System.out.println(file.exists());
		
		//creates a new file mentioned in the File constructor.
		file.createNewFile();
		System.out.println(file.exists());
		
		File dir = new File("mydirectory");
		dir.mkdir();
		System.out.println(file.isFile());
		System.out.println(dir.isDirectory());
	}
}
