package org.kms.patterns.behavioural.strategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StrategyPatternTest {
	
	public static void main(String[] args) {
		ShoppingCart shoppingCart= new ShoppingCart();
		List<Item> items= new ArrayList<Item>();
		Item item1= new Item(1, "LUX", 27.8);
		Item item2= new Item(1, "Santoor", 17.8);
		items.add(item1);
		items.add(item2);
		shoppingCart.setItems(items);
		
		PaymentStrategy paymentStrategy= new CreditCardPayment(111222, 234, new Date(), "testuser");
		
		PaymentStrategy paymentStrategy2= new PaypalPayment(11112222, "xyx", 13);
		
		shoppingCart.processPayment(shoppingCart.getItems(), paymentStrategy);
		shoppingCart.processPayment(shoppingCart.getItems(), paymentStrategy2);
	}

}
