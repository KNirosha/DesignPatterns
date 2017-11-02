package org.kms.patterns.creational.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		//BANK IS A FACTORY OF FACTORIES
		BankFactory bank= new BankFactory();
		/*
		 * ACCOUNT FACTORY
		 */
		//create saving account
		Account savingsAcc=bank.createAccount("savings");
		//print account details
		System.out.println(savingsAcc.toString());
		//create DMAT account
		Account dmatAcc=bank.createAccount("dmat");
		//print account details
		System.out.println(dmatAcc.toString());
		/*
		 * LOAN FACTORY
		 */
		//create gold loan acc
		Loan goldLoan=bank.createLoan("gold");
		//print account details
		System.out.println(goldLoan.toString());
		//create personal loan acc
		Loan personalLoan=bank.createLoan("personal");
		//print account details
		System.out.println(personalLoan.toString());
		/*
		 * PAYMENT FACTORY
		 */
		//create CC payment
		Payment ccPayment=bank.createPayment("cc");
		System.out.println(ccPayment.toString());
		//create EC payment
		Payment ecPayment=bank.createPayment("ec");
		System.out.println(ecPayment.toString());
	}

}
