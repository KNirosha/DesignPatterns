package org.kms.patterns.structural.bridge;

public class SonyTV implements LEDTV {

	public void switchOn() {
		System.out.println("SONY is Switched on");
	}

	public void switchOff() {
		System.out.println("SONY is Switched off");
	}

	public void setChannel(int channel) {
		System.out.println("Setting the channel no:"+channel+" in SONY TV");

	}

}
