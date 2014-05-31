package gof.behaviour.memento.blackbox;

public class CareTaker {

	private MementoIF memento;
	
	public MementoIF retrieveMemento(){
		return this.memento;
	}
	
	public void saveMemento(MementoIF memento){
		this.memento = memento;
	}
}
