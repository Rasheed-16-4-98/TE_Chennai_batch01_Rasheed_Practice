package com.te.assignments3;

public class GCD {

	public void greatest() {
		
		int no1=12;
		int no2=30;
		int min= no1<no2? no1:no2;
		while(min>=2) {
			if((no1%min==0)&&(no2%min==0)){
				System.out.println(min);
				break;
			}
			min--;
		}
	}
}
