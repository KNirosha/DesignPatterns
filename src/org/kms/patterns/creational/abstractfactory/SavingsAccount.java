package org.kms.patterns.creational.abstractfactory;

public class SavingsAccount implements Account {
	int accNo;
	String holder; 
	String accountType;

	public SavingsAccount(int accNo, String holder, String accountType) {
		super();
		this.accNo = accNo;
		this.holder = holder;
		this.accountType = accountType;
	}

	
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", holder=" + holder
				+ ", accountType=" + accountType + "]";
	}

	public Account getAccount(int accNo, String holder, String accountType) {
		return new SavingsAccount(accNo,holder,accountType);
	}
	

}
