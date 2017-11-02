package org.kms.patterns.behavioural.observer;

public class StockObserver1 implements Observer {

	public void observe(Subject subject) {
		Stock stock=(Stock) subject;
		System.out.println("Observer::"+this.getClass().getSimpleName());
		System.out.println("Observations"+stock.toString());
		
	}

}
