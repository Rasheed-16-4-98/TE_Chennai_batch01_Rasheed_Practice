package com.te.assignments2;

import java.util.Scanner;

public class StringClass {

	public void changeCase() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String Value");
		String str=scn.next();
		String str1="Rasheed";
		char[] ch=str.toCharArray();
		str=" ";
		for(int i=ch.length-1;i>=0;i--) {
			
			str=str+ch[i];
			
		}
		System.out.println("String Reverse  :  "+str);
		
		
		System.out.println("Executing equals() Method......");
		System.out.println(str1.equals("rasheed"));//false
		System.out.println(str1.equals("rAsheed"));//false
		System.out.println(str1.equals("Rasheed"));//true
	}
}
