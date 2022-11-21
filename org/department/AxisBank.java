package org.department;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("From AxisBank class - Deposit ");
	}

	public static void main(String[] args) {
		AxisBank a= new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();

	}

}
