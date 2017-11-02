package org.kms.patterns.structural.facade;

public class BankTransactionFacadeImpl implements BankTransactionFacade {
	
	private AccountDetailsVerifier verifier= new AccountDetailsVerifier();
	private AccountDebit debit= new AccountDebit();
	private AccountCredit credit= new AccountCredit();
	
	public boolean verifyAccount(){
		return verifier.verifyAccountDetails();
	}
	
	public void debitTransaction(double amount){
		debit.debitAmout(amount);
	}
	
	
	public void creditTransaction(double amount){
		credit.creaditAmout(amount);
	}
	
	public void viewTotalBalance(){
		debit.showTotalBalance();
	}

}
