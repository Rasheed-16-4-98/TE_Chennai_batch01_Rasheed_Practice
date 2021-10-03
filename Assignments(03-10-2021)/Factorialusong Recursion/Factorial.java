package com.te.assignments3;

public class Factorial {

	public static int fact(int n) {
		if(n==1) {
			System.out.println("factorial(" + n + ") = 1");
			return 1;
		}else {
			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n-1) + ")");
			return n*fact(n-1);
		}
	}
}
