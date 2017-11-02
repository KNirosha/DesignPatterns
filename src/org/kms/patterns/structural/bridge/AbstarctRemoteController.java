package org.kms.patterns.structural.bridge;

public abstract class AbstarctRemoteController {
	protected LEDTV ledtv;
	protected AbstarctRemoteController(LEDTV ledtv) {
		this.ledtv=ledtv;
	}
	public abstract void switchOn();
	public abstract void switchOff();
	public abstract void setChannel(int channel);
	
}
