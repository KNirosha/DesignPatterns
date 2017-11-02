package org.kms.patterns.creational.singleton;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonEagerInit.getInstance().instaceMethod();
		SingletonLazyInit.getInstance().instaceMethod();
		SingletonThreadSafeSyncBlock.getInstance().instanceMethod();
		SingletonThreadsafeSynchronizedMethod.getInstance().instanceMethod();
		SingletonWithInnerClass.getInstance().instanceMethod();
		SingletonWithStaticBlockInit.getInsstance().instanceMethod();
	}

}
