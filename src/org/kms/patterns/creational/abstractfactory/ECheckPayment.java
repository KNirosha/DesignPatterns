package org.kms.patterns.creational.abstractfactory;

import java.util.Date;

public class ECheckPayment implements Payment {

	int accNo;
	int cvvNo;
	String cardHolder;
	Date expDate;
	
	public ECheckPayment(int accNo, int cvvNo, String cardHolder, Date expDate) {
		super();
		this.accNo = accNo;
		this.cvvNo = cvvNo;
		this.cardHolder = cardHolder;
		this.expDate = expDate;
	}




	public Payment getPayment(int accNo, int cvvNo, String cardHolder, Date expDate) {
		// TODO Auto-generated method stub
		return new ECheckPayment(accNo, cvvNo, cardHolder, expDate);
	}




	@Override
	public String toString() {
		return "ECheckPayment [accNo=" + accNo + ", cvvNo=" + cvvNo
				+ ", cardHolder=" + cardHolder + ", expDate=" + expDate + "]";
	}

	
	
	
	

}
