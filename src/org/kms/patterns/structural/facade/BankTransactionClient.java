package org.kms.patterns.structural.facade;

public class BankTransactionClient {
/*
 * Client program uses facade layer to get the features.
 */
	public static void main(String[] args) {
		//Bank  facade
		BankTransactionFacade facade= new BankTransactionFacadeImpl();
		// account verification service
		if(facade.verifyAccount())
		{   // fund credit service
			facade.creditTransaction(500);
			//show total balance service
			facade.viewTotalBalance();
			//fund debit service
			facade.debitTransaction(250);
			facade.viewTotalBalance();
		}else{
			System.out.println("Invalid account details.");
		}
	}
	
	
}
