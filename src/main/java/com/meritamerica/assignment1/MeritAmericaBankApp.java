package com.meritamerica.assignment1;
/*i. Instantiate an account holder with a checking balance of $100 and a
*savings balance of $1000
*ii. Display the account holder’s toString() output
*iii. Deposit $500 into the checking account
*iv. Withdraw $800 from the savings account
*v. Display the checking account toString() output
*vi. Display the savings account toString() output
*vii. Instantiate another account holder with a checking balance of $200 and
*a savings balance of $500
*viii. Deposit -$500 into the checking account
*ix. Withdraw $600 from the savings account
*x. Display the second account holder’s toString() output
* 
*/
public class MeritAmericaBankApp {

	public static void main(String[] args) {
		AccountHolder accountHolder = new AccountHolder(
	        	"Caro",
	        	"",
	        	"Rodriguez",
	        	"123456789",
	        	100.0,
	        	1000.0);
		System.out.println(accountHolder.toString());
		accountHolder.getCheckingAccount().deposit(500);
		accountHolder.getSavingsAccount().withdraw(800);
		System.out.println(accountHolder.getCheckingAccount().toString());
		System.out.println(accountHolder.getSavingsAccount().toString());
		
		AccountHolder accountHolderJim = new AccountHolder(
	        	"Jimmy",
	        	"",
	        	"Kim",
	        	"123456789",
	        	200.0,
	        	500.0);

		accountHolderJim.getCheckingAccount().deposit(-500);
		accountHolderJim.getSavingsAccount().withdraw(600);
		System.out.println(accountHolderJim.toString());
		
	}
	
	
}