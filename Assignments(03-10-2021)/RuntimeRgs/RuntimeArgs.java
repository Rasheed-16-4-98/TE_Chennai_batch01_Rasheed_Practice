package com.te.assignments1;

public class RuntimeArgs {

	public static void main(String[] args) {
		System.out.println("Arguments passed at runtime. "+
				args.length  + " here ");
	          
	        for(int i = 1; i < args.length; i++) {
	            System.out.println("Argument " + i + " = " 
	                               + args[i]);
	        }
	}
}
