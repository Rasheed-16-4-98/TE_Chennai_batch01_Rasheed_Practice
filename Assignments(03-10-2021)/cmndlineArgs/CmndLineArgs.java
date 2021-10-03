package com.te.assignments3;

public class CmndLineArgs {

	public static void main(String[]args){
		int s=0;
		int i=0;
		int avg=0;
			for( i=0;i<args.length;i++){
			s= s+ Integer.parseInt(args[i]);
			}
			System.out.println("sum = "+s);
			avg=s/args.length;
			System.out.println("the average is :"+ avg);
		}
}
