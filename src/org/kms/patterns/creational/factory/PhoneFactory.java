package org.kms.patterns.creational.factory;

public class PhoneFactory {
	
	public PhoneOS createOS(String os){
		if(os.toLowerCase().equals("ios")){
			return new AppleOS();
		}else if(os.toLowerCase().equals("windows")){
			return new WindowsOS();
		}else if(os.toLowerCase().equals("android")){
			return new AndroidOS();
		}
		
		return null;
	}

}
