package com.te.assignment.deletefie;

import java.io.File;

public class DeleteAFile {
      
	public void delete() {
		File ref=new File("E:\\Rasheed\\hello\\Document.txt");
		boolean bool=ref.exists();
		if(bool==true) {
			ref.delete();
			System.out.println("Delete Complete");
		}else {
			System.out.println("File Does Not Exists");
		}
	}
}
