package com.codegnan.IOdemos;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	 public static void main(String[] args) throws IOException {
		 
//		 File f = new File("iostreams.txt");  can be done in this way 
//		 f.createNewFile();
//		 
//		 FileWriter writer = new FileWriter(f);
		 
		 FileWriter writer = new FileWriter("iostreams.txt"); // can be done in this way too
		 
	     writer.write("This the data of the file we have created");
	     writer.write("\n this an additional add on");
	     writer.flush();
	}

}
