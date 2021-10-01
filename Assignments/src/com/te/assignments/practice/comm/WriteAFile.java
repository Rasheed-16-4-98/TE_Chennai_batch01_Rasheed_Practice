package com.te.assignments.practice.comm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
	public void write() {
		FileWriter ref = null;
		try {
			ref = new FileWriter("E:\\Rasheed\\hello\\Document.txt");
			ref.write("TechnoElevate");
			ref.write("\n");
			ref.write("Chennai");
			ref.flush();
			System.out.println("Data Transfer Complete");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
