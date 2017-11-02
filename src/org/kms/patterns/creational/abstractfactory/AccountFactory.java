package org.kms.patterns.creational.abstractfactory;

public class AccountFactory {
	
	public Account createAccount(String accType){
		if(accType.equalsIgnoreCase("savings")){
			return new SavingsAccount(125,"MUNI","SAVINGS");
		}else if(accType.equalsIgnoreCase("dmat")){
			return new DMatAccount(456,"NEERU","DMAT");
		}
		return null;
	}

}
