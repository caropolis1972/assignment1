package com.meritamerica.assignment1;
/*
 * String toString()
i. Sample output:
1. Name: John James Doe
2. SSN: 123-45-6789
3. Checking Account Balance: $100
4. Checking Account Interest Rate: 0.0001
5. Checking Account Balance in 3 years: $100.03
6. Savings Account Balance: $1000
7. Savings Account Interest Rate: 0.01
8. Savings Account Balance in 3 years: $1030.03
 */
public class AccountHolder {
	// Instance variables
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

	// Default constructor
	AccountHolder() {
		
	}
	
	// Constructor with parameters
	AccountHolder(String firstName,
				  String middleName,
				  String lastName,
				  String ssn, 
				  double checkingAccountOpeningBalance, 
				  double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);	
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
		
	}
	
	// Setters and Getters methods for each instance variable
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return this.checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return this.savingsAccount;
	}
	public String toString() {
		String output = "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + "\n";
		       output+= "SSN: " + this.getSSN() +  "\n";
		       output+= this.getCheckingAccount().toString() + "\n";
		       output+= this.getSavingsAccount().toString();
		return output;
	
	}
}