package org.kms.patterns.structural.bridge;

public class SamsungTV implements LEDTV {

	public void switchOn() {
		System.out.println("SAMSUNG is Switched on");
	}

	public void switchOff() {
		System.out.println("SAMSUNG is Switched off");

	}

	public void setChannel(int channel) {
		System.out.println("Setting the channel no:"+channel+" in SAMSUNG TV");

	}

}
