package org.kms.patterns.creational.abstractfactory;

public class DMatAccount implements Account {
	
	int accNo;
	String holder;
	String accountType;

	public DMatAccount(int accNo, String holder, String accountType) {
		super();
		this.accNo = accNo;
		this.holder = holder;
		this.accountType = accountType;
	}

	public String toString() {
		return "DMatAccount [accNo=" + accNo + ", holder=" + holder
				+ ", accountType=" + accountType + "]";
	}
	
	public Account getAccount(int accNo, String holder, String accountType) {
		return new DMatAccount(accNo,holder,accountType);
	}

}
