package com.te.assignments.practice;

import java.io.File;
import java.util.Scanner;

public class CreateFolder {
	
	  public void create() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Create a path whereever you want");
		String path = scn.next();
		System.out.println();
		path = path + "\\";
		System.out.println("create folder name");
		path += scn.next();
		System.out.println("Folder name added");
		File f = new File(path);
		if (f.mkdir()) {
			System.out.println("Folder created");
		} else {
			throw new RuntimeException("Folder Not created");
		}

	}
}
