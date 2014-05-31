package gof.behaviour.memento.blackbox;

public class Client {

	private static Originator o = new Originator();
	private static CareTaker c = new CareTaker();
	
	public static void main(String[] args){
		o.setState("On");
		c.saveMemento(o.createMemento());
		o.setState("Off");
		o.restoreMemento(c.retrieveMemento());
	}
}
