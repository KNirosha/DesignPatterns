package org.kms.patterns.behavioural.strategy;

import java.util.List;

public class ShoppingCart {
	
	List<Item> items;
	int orderNum;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public void processPayment(List<Item> items,PaymentStrategy paymentStrategy){
		double totalAmount=0;
		for(Item item:items){
			totalAmount=totalAmount+item.price;
		}
		System.out.println("Total Amount"+totalAmount);
		paymentStrategy.processPayment(totalAmount);
	}
	

}
