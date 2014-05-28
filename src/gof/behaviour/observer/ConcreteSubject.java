package gof.behaviour.observer;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector observersVector = new Vector();
	
	@Override
	public void notifyObservers() {
		Enumeration enumeration = observers();
		while(enumeration.hasMoreElements()){
			((Observer)enumeration.nextElement()).update();
		}
	}
	
	public Enumeration observers(){
		return ((Vector)observersVector.clone()).elements();
	}

	@Override
	public void attach(Observer observer) {
		observersVector.addElement(observer);
	}

	@Override
	public void detach(Observer observer) {
		observersVector.removeElement(observer);
	}

}
