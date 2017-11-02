package org.kms.patterns.creational.abstractfactory;

public class LoanFactory {
     public Loan createLoan(String type){
    	 if(type.equalsIgnoreCase("gold")){
    		return new GoldLoan(4567, "KMS", 2, 12500, 8);
    	 }else if(type.equalsIgnoreCase("personal")){
    		return new PersonalLoan(3457, "KMD", 2, 12500, 11);
    	 }
    	 
    	 return null;
     }
}
