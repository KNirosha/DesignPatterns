package org.kms.patterns.behavioural.strategy;

import java.util.Date;

public class CreditCardPayment implements PaymentStrategy {
	
	int cardno;
	int cvv;
	Date expDate;
	String nameOnCard;

	public void processPayment(double amount) {
		System.out.println("Payment with Creditcard in progres...");
		System.out.println("Amount Debited ::"+amount);

	}

	public CreditCardPayment(int cardno, int cvv, Date expDate,
			String nameOnCard) {
		super();
		this.cardno = cardno;
		this.cvv = cvv;
		this.expDate = expDate;
		this.nameOnCard = nameOnCard;
	}
	

}
