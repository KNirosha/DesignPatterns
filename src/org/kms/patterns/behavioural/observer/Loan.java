package org.kms.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject{
	
	String loanType;
	double rateOfInterest;
	
	List<Observer> loanObservers=new ArrayList<Observer>();
	
	
	public String getLoanType() {
		return loanType;
	}



	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}



	public double getRateOfInterest() {
		return rateOfInterest;
	}



	public void setRateOfInterest(double rateOfInterest) {
		System.out.println("************OBSERVERS STARTED");
		this.rateOfInterest = rateOfInterest;
		notifyUpdate(this);
	}



	public void notifyUpdate(Subject subject) {
		for(Observer ob: loanObservers){
			ob.observe(this);
		}
		
	}



	public void addObserver(Observer observer) {
		loanObservers.add(observer);
		
	}



	public void deleteObserver(Observer observer) {
		
		loanObservers.remove(observer);
	}



	@Override
	public String toString() {
		return "Loan [loanType=" + loanType + ", rateOfInterest="
				+ rateOfInterest + "]";
	}
	
	

}
