package org.kms.patterns.structural.bridge;

public class BridgeDesignPatternTest {
	
	public static void main(String[] args) {
		
		AbstarctRemoteController sony= new SonyRemoteController(new SonyTV());
		sony.switchOn();
		sony.setChannel(136);
		sony.switchOff();
		System.out.println("*******************");
		AbstarctRemoteController samsung= new SamsungRemoteController(new SamsungTV());
		samsung.switchOn();
		samsung.setChannel(366);
		samsung.switchOff();
	}

}
