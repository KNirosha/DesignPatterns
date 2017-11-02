package org.kms.patterns.creational.singleton;

public class SingletonWithStaticBlockInit {
	
	private SingletonWithStaticBlockInit() {
		// TODO Auto-generated constructor stub
	}
	
	private static SingletonWithStaticBlockInit staticBlockInit;
	// Through static block we can handle the exception handling while object creation
	static{
		try{
			staticBlockInit= new SingletonWithStaticBlockInit();
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}
	
	public static SingletonWithStaticBlockInit getInsstance(){
		return staticBlockInit;
	}
	
	public void instanceMethod(){
		System.out.println("SingletonWithStaticBlockInit Instance method executed");
	}
	
	public static void main(String[] args) {
		getInsstance().instanceMethod();
	}

}
