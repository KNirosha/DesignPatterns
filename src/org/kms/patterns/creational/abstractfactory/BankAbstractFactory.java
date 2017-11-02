package org.kms.patterns.creational.abstractfactory;

public abstract class BankAbstractFactory {
	
	public abstract Account createAccount(String type);
	public abstract Loan createLoan(String type);
	public abstract Payment createPayment(String type);
	
}
