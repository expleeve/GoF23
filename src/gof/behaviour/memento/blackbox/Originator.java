package gof.behaviour.memento.blackbox;

public class Originator {
 
	private String state;
	
	public Originator(){
		
	}
	
	public MementoIF createMemento(){
		return new Memento(this.state);
	}
	
	public void restoreMemento(MementoIF memento){
		Memento aMemento = (Memento)memento;
		this.setState(aMemento.getState());
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String state){
		this.state = state;
		System.out.println(state);
	}
	
	protected class Memento implements MementoIF{
		
		private String savedState;
		private Memento(String someState){
			savedState = someState;
		}
		
		private String getState(){
			return savedState;
		}
	}
}
