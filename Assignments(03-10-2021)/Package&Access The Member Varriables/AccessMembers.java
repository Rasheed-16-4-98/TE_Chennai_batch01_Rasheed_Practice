package com.te.assignments1;

public class AccessMembers {

public static void main(String[] args) {
		
		Variables v1 = new Variables();
		
		//Access static variable
		System.out.println(Variables.name);
		
	    //Access non static variable
		System.out.println(v1.age);
		System.out.println(v1.salary);
	}

}
