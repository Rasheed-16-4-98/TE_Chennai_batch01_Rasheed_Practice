package com.te.assignments.practice.cfile;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
   public void create() {
	   File ref=new File("E:\\Rasheed\\hello\\Document.txt");
	   boolean bool=ref.exists();
	   if(bool==false) {
		   try {
			ref.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	   }else {
		   System.out.println("File Exists");
	   }
   }
}
