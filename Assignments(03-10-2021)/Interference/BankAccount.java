package com.te.assignments4;

public class BankAccount {

	static double accBal=10000.0;
	static int amt=5000;
	static int depsiteamt;
	
}
class Withdraw extends BankAccount{
	static void withDraw() {
		
		if(accBal>amt) {
			System.out.println("Withdrawal Success...");	
		}else {
			System.out.println("Insufficient Balance...");
		}
	}
}
class Deposite extends BankAccount{
	static void deposite(int depositeamt) {
		
		accBal += depositeamt;
		System.out.println("Available Account balance : "+accBal);
		System.out.println("deposite successfull");
		
	}
}
