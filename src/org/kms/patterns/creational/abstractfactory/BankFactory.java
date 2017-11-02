package org.kms.patterns.creational.abstractfactory;

public class BankFactory extends BankAbstractFactory{

	public Account createAccount(String type) {
		AccountFactory accountFactory= new AccountFactory();
		return	accountFactory.createAccount(type);
	}

	public Loan createLoan(String type) {
		LoanFactory loanFactory= new LoanFactory();
		return loanFactory.createLoan(type);
	}

	public Payment createPayment(String type) {
		PaymentFactory paymentFactory= new PaymentFactory();
		return paymentFactory.createPayment(type);
	}

	
		
}
