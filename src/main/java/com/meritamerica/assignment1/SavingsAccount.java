package com.meritamerica.assignment1;
/*
 * Similarly, a savings account has a balance, and an annual interest rate of 1.00%. It is possible
to withdraw and deposit funds into the account which affects its balance. It is also possible to
determine the future value of the account balance based on the interest calculation given N
months.
It should not be possible to withdraw a negative amount nor more than the available balance in
a bank account. It should not be possible to deposit a negative amount.
The formula for future value is FV = PV(1+i) n
- FV: future value
- PV: present value
- i: interest rate
- n: number of periods/years
For example:
- PV: $100
- i: 1.00%
- Note: 1% is also written as 1/100 or 0.01
- n: 3 years
- FV = 100(1+0.01) 3 = $103.03
Hint: you can use the Math.pow(x,y) method to implement this formula:
 */
public class SavingsAccount {
	// Instance variables
		private double balance;
		private static final double INTEREST_RATE = 0.01;
		
		public SavingsAccount (double openingBalance) {
			this.balance = openingBalance;
		}
		
	public double getBalance () {
		return this.balance;
	}
	
	public double getInterestRate () {
		return INTEREST_RATE;
	}
	
	public boolean withdraw (double amount) {
		if (amount >= 0 && amount <= this.balance) {
			this.balance-= amount;
			return true;
		}
		// Withdraw amount was negative or greater than balance
		return false;
	}
	
	public boolean deposit (double amount) {
		if (amount >= 0) {
			this.balance+= amount;
			return true;
		}
		// Deposit amount was negative 
		return false;
	}
	
	public double futureValue (int years) {
		return (this.balance*(Math.pow(1 + INTEREST_RATE, years)));
	}
	
	public String toString() {
		String output = "Savings Account Balance: $" + this.getBalance() + "\n";
		       output+= "Savings Account Interest Rate: " + String.format("%.2f", this.getInterestRate())+ "\n";
		       output+= "Savings Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3));
		return output;
	}
}