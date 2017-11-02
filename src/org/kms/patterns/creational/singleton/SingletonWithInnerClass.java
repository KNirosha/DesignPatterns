package org.kms.patterns.creational.singleton;

public class SingletonWithInnerClass {
	private SingletonWithInnerClass() {
		// TODO Auto-generated constructor stub
	}
	
	private static class Inner{
		
		private static final SingletonWithInnerClass instance= new SingletonWithInnerClass();
		
	}
	
	public static SingletonWithInnerClass getInstance(){
		return Inner.instance;
	}
	
	public void instanceMethod(){
		System.out.println("SingletonWithInnerClass Instance method executed");
	}

}
