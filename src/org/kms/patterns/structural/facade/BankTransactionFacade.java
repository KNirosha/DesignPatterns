package org.kms.patterns.structural.facade;

public interface BankTransactionFacade {

	public abstract boolean verifyAccount();

	public abstract void debitTransaction(double amount);

	public abstract void creditTransaction(double amount);

	public abstract void viewTotalBalance();

}