package org.kms.patterns.creational.singleton;

public class SingletonThreadSafeSyncBlock {
	
	private SingletonThreadSafeSyncBlock() {
		// TODO Auto-generated constructor stub
	}
	
	private static SingletonThreadSafeSyncBlock safeSyncBlock;
	
	public static SingletonThreadSafeSyncBlock getInstance(){
		if(null==safeSyncBlock)
		{
			synchronized (SingletonThreadSafeSyncBlock.class) {
				//double checked locking
				if(null==safeSyncBlock){
					safeSyncBlock= new SingletonThreadSafeSyncBlock();
				}
			}
		}
		
		return safeSyncBlock;
	}
	public void instanceMethod(){
		System.out.println("SingletonThreadSafeSyncBlock Instance method invoked");
	}
	
	public static void main(String[] args) {
		getInstance().instanceMethod();
	}

}
