package com.te.assignments1;

import java.util.Scanner;

public class SimpleInterest {

	public void simple() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		double pAmt=scn.nextDouble();
		System.out.println("Enter the n Value");
		double n=scn.nextDouble();
		System.out.println("Enter The Rate Of Interest ");
		double rate=scn.nextDouble();
		double simple=(pAmt*n*rate)/100;
		System.out.println("Simple Interest : "+simple);
	}
}
