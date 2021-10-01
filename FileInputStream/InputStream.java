package com.te.assignment.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

	public void steam() {
		String path = "E:\\nethaji\\java.txt";
		FileInputStream fip=null;
		File file = new File(path);
		try {
			fip = new FileInputStream(file);

			System.out.println("File Content is : ");

			int c = 0;
			while ((c = fip.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fip.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
