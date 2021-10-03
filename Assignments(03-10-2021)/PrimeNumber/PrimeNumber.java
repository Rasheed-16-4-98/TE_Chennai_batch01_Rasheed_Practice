package com.te.assignments1;

import java.util.Scanner;

public class PrimeNumber {
	
	public void prime(){
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		System.out.println("Enter the divide value");
		int i=scn.nextInt();
		while(i<=num/2) {
			if(num%i==0) {
				break;
			}
			i++;
		}
		String str= i>=num/2 ? "PrimeNumber" : "Not A primeNumber" ;
		System.out.println("Given Number Is : "+str);
	}

}
