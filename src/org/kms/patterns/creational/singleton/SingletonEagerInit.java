package org.kms.patterns.creational.singleton;

public class SingletonEagerInit {
	
	private SingletonEagerInit() {
		
	}
	
	private static final SingletonEagerInit eagerInit= new SingletonEagerInit();
	
	public static SingletonEagerInit getInstance(){
		return eagerInit;
	}
	
	public static void main(String[] args) {
		getInstance().instaceMethod();
	}
	
	public void instaceMethod(){
		System.out.println("SingletonEagerInit Instance method executed");
	}
	

}
