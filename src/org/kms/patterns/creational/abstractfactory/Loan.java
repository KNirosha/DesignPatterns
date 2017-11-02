package org.kms.patterns.creational.abstractfactory;

public interface Loan {

	public Loan getLoan(int accountNumber, String holder, int period,
			double amount, float interestRate);
}
