package org.kms.patterns.behavioural.observer;


public interface Subject {
	
	
	void notifyUpdate(Subject Subject);
	void addObserver(Observer observer);
	void deleteObserver(Observer observer);

}
