package org.kms.patterns.structural.facade;

public class AccountDebit extends Account {
	
	public void debitAmout(double balance){
		totalBalance=totalBalance-balance;
		System.out.println("Debit Transaction succeefully executed.\n Total Balance:"+totalBalance);
	}

}
