package org.kms.patterns.creational.singleton;

public class SingletonThreadsafeSynchronizedMethod {

	private SingletonThreadsafeSynchronizedMethod() {
		// TODO Auto-generated constructor stub
	}
	
	private static SingletonThreadsafeSynchronizedMethod synchronizedBlock;
	
	public static synchronized SingletonThreadsafeSynchronizedMethod getInstance(){
		if(null==synchronizedBlock){
			synchronizedBlock= new SingletonThreadsafeSynchronizedMethod();
		}
		return synchronizedBlock;
	}
	
	public void instanceMethod(){
		System.out.println("SingletonThreadsafeSynchronizedMethod Instance method executed");
	}
	
	public static void main(String[] args) {
		new SingletonThreadsafeSynchronizedMethod().instanceMethod();
	}
}
