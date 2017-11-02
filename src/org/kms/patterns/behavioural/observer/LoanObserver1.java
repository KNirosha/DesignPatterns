package org.kms.patterns.behavioural.observer;

public class LoanObserver1 implements Observer {

	public void observe(Subject subject) {
			Loan loan=(Loan) subject;
			System.out.println("Observer::"+this.getClass().getSimpleName());
			System.out.println("Observations"+loan.toString());
	}

}
