package org.kms.patterns.structural.bridge;

public class SamsungRemoteController extends AbstarctRemoteController{
	protected SamsungRemoteController(LEDTV ledtv) {
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
