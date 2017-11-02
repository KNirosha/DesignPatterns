package org.kms.patterns.structural.bridge;

public class SonyRemoteController extends AbstarctRemoteController{

	protected SonyRemoteController(LEDTV ledtv) {
		super(ledtv);
	}
	//ledtv is a protected variable available in parent class
	public void switchOn() {
		ledtv.switchOn();
		
	}

	public void switchOff() {
		ledtv.switchOff();
		
	}

	public void setChannel(int channel) {
		ledtv.setChannel(channel);
		
	}

}
