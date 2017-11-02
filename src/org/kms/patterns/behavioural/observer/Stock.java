package org.kms.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
	
	String stockName;
	int price;
	List<Observer> stockObservers=new ArrayList<Observer>();
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		notifyUpdate(this);
	}

	public void notifyUpdate(Subject subject) {
		for(Observer ob: stockObservers){
			ob.observe(this);
		}
		
	}

	public void addObserver(Observer observer) {
		stockObservers.add(observer);
		
	}

	public void deleteObserver(Observer observer) {
		stockObservers.remove(observer);
		
	}

	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", price=" + price + "]";
	}
	

}
