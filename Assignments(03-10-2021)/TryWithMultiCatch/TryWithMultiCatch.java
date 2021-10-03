package com.te.assignments3;

public class TryWithMultiCatch {

	public void multiCatch() {
		try {
			int[] arr = new int[6];
			arr[6] = 8;
			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println("Output is " + k);
		} catch (ArithmeticException e) {
			
			System.out.println("Cannot devided by Zero");
			e.printStackTrace();
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Stay in your Limit");
		
		} catch (Exception e) {
			
			System.out.println("Something Wrong");
		
		} finally {
			
			System.out.println("Task Completed");
		}
	}
}
