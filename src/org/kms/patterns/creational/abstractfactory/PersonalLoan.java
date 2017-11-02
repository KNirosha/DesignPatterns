package org.kms.patterns.creational.abstractfactory;

public class PersonalLoan implements Loan {

	int accountNumber;
	String holder;
	int period;
	double amount;
	float interestRate;

	public Loan createLoanAccount(int accountNumber, String holder, int period,
			double amount, float interestRate) {
		return new PersonalLoan(accountNumber, holder, period, amount, interestRate);

	}

	public PersonalLoan(int accountNumber, String holder, int period,
			double amount, float interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.period = period;
		this.amount = amount;
		this.interestRate = interestRate;
	}
	
	
	public String toString() {
		return "PersonalLoan [accountNumber=" + accountNumber + ", holder="
				+ holder + ", period=" + period + ", amount=" + amount
				+ ", interestRate=" + interestRate + "]";
	}

	public Loan getLoan(int accountNumber, String holder, int period,
			double amount, float interestRate) {
		
		return new PersonalLoan( accountNumber,  holder,  period,
				 amount,  interestRate);
	}

}
