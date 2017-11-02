package org.kms.patterns.creational.abstractfactory;

public class GoldLoan implements Loan {
	
	int accountNumber;
	String holder;
	int period;
	double amount;
	float interestRate;

	

	public GoldLoan(int accountNumber, String holder, int period,
			double amount, float interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.period = period;
		this.amount = amount;
		this.interestRate = interestRate;
	}
	
	public String toString() {
		return "GoldLoan [accountNumber=" + accountNumber + ", holder="
				+ holder + ", period=" + period + ", amount=" + amount
				+ ", interestRate=" + interestRate + "]";
	}

	public Loan getLoan(int accountNumber, String holder, int period,
			double amount, float interestRate) {
		
		return new GoldLoan( accountNumber,  holder,  period,
				 amount,  interestRate);
	}
	
	

}
