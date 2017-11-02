package org.kms.patterns.creational.singleton;

public class SingletonLazyInit {
	
	 private SingletonLazyInit() {
		 
	}
	 
	private static SingletonLazyInit lazyInit;
	
	public static SingletonLazyInit getInstance(){
		if(null==lazyInit){
			return new SingletonLazyInit();
		}else{
			return lazyInit;
		}
	}
	
	public void  instaceMethod(){
		System.out.println("SingletonLazyInit Instance method executed");
	}
	
	public static void main(String[] args) {
		SingletonLazyInit.getInstance().instaceMethod();
	}

}
