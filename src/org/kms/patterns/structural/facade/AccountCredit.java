package org.kms.patterns.structural.facade;

public class AccountCredit extends Account {
	public void creaditAmout(double balance){
		totalBalance=totalBalance+balance;
		System.out.println("Credit Transaction succeefully executed.\n Total Balance:"+totalBalance);
	}

}
