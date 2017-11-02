package org.kms.patterns.behavioural.observer;

public class ObserverDesignTest {

	public static void main(String[] args) {
		Observer observerLoan1= new LoanObserver1();
		Observer observerLoan2= new LoanObserver2();
		
		Loan loanSubject= new Loan();
		System.out.println("**********Adding loan Observer1 & Observer2***********");
		loanSubject.addObserver(observerLoan1);
		loanSubject.addObserver(observerLoan2);
		loanSubject.setLoanType("Gold");
		System.out.println("^^^^^^^^^Setting value to rate of interest^^^^^^^^^^");
		loanSubject.setRateOfInterest(11.5);
		
		System.out.println("***********Removing Loan Observer1********************");
		loanSubject.deleteObserver(observerLoan1);
		
		System.out.println("^^^^^^^^^^^^^^^updating rate of interest^^^^^^^^^^^");
		loanSubject.setRateOfInterest(8.5);
		
		Stock stockSubject= new Stock();
		Observer observerStock1= new StockObserver1();
		Observer observerStock2= new StockObserver2();
		System.out.println("Adding Stock Observer1 & Observer2");
		stockSubject.addObserver(observerStock1);
		stockSubject.addObserver(observerStock2);
		
		stockSubject.setStockName("TCS");
		System.out.println("^^^^^^^^^Setting value to stock price^^^^^^^^^^");
		stockSubject.setPrice(1250);
		
		
		
	}
	
}
