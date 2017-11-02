package org.kms.patterns.creational.abstractfactory;

import java.util.Date;

public interface Payment {
	
	public Payment getPayment(int accNo, int cvvNo, String cardHolder,
			Date expDate);

}
