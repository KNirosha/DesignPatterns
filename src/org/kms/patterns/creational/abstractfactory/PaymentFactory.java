package org.kms.patterns.creational.abstractfactory;

import java.util.Date;

public class PaymentFactory {

		public Payment createPayment(String type){
			if(type.equalsIgnoreCase("cc")){
				return new CreditCardPayment(5689,34,"kkkk", new Date());
			}else if(type.equalsIgnoreCase("ec"))
			{
				return new ECheckPayment(3456,78,"jjjj", new Date());
			}
			return null;
		}
}
