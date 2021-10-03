package com.te.assignments3;

import java.util.Scanner;

public class NestedTry {

	public void nested() {

		int[] arr = new int[3];
		arr[0] = 3;
		arr[1] = 6;
		arr[2] = 2;
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Index Value");
			int num = scn.nextInt();
			try {
				System.out.println("Block Starts");
				try {
					System.out.println(arr[num]);
					flag=false;

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("this Index doesn't exists");

				}
			} catch (Exception e) {
				System.out.println("Block ends");

			}
		}

	}

}
