package com.te.assignments4;

public class ExceptionUsingThrowTest {

public static void main(String[] args) {
		
		try {
			ExceptionUsingThrow ref = new ExceptionUsingThrow("Future Java FullStackDeveloper");
			throw ref;
		} catch (ExceptionUsingThrow e) {
						System.out.println(e.getMessage());
			
		}
	}
}
