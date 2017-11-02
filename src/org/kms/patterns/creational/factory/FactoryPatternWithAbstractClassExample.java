package org.kms.patterns.creational.factory;

public class FactoryPatternWithAbstractClassExample {
	public static void main(String[] args) {
		PhoneFactory shapeFactory= new PhoneFactory();
		// client class uses abstract class and uses the factory class to get actual class object.
		PhoneOS ios=shapeFactory.createOS("ios");
		System.out.println(ios.getClass().getName()+ios.getPhoneOS());
		PhoneOS windows=shapeFactory.createOS("windows");
		System.out.println(windows.getClass().getName()+windows.getPhoneOS());
		PhoneOS android=shapeFactory.createOS("android");
		System.out.println(android.getClass().getName()+android.getPhoneOS());
	}
}
