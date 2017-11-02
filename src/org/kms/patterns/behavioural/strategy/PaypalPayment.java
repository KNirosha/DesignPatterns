package org.kms.patterns.behavioural.strategy;

public class PaypalPayment implements PaymentStrategy {
	
	int routingNumber;
	String holderName;
	int pin;

	public void processPayment(double amount) {
		System.out.println("Paypal payment is in progress...");
		System.out.println("Amount debited"+amount);
	}

	public PaypalPayment(int routingNumber, String holderName, int pin) {
		super();
		this.routingNumber = routingNumber;
		this.holderName = holderName;
		this.pin = pin;
	}
	

}
