package org.kms.patterns.structural.facade;

public class Account {
	int accNo;
	double totalBalance=500;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public void showTotalBalance(){
		System.out.println("TOTAL BALANCE::"+getTotalBalance());
	}
	
	
}
