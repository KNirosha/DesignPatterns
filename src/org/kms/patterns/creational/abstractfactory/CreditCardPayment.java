package org.kms.patterns.creational.abstractfactory;

import java.util.Date;

public class CreditCardPayment implements Payment {
	
	int accNo;
	int cvvNo;
	String cardHolder;
	Date expDate;
	public CreditCardPayment(int accNo, int cvvNo, String cardHolder,
			Date expDate) {
		super();
		this.accNo = accNo;
		this.cvvNo = cvvNo;
		this.cardHolder = cardHolder;
		this.expDate = expDate;
	}
	public Payment getPayment(int accNo, int cvvNo, String cardHolder,
			Date expDate) {
		// TODO Auto-generated method stub
		return new CreditCardPayment( accNo,  cvvNo,  cardHolder,
				 expDate);
	}
	@Override
	public String toString() {
		return "CreditCardPayment [accNo=" + accNo + ", cvvNo=" + cvvNo
				+ ", cardHolder=" + cardHolder + ", expDate=" + expDate + "]";
	}
	
	

}
