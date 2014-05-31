package gof.behaviour.memento.whitebox;

public class Memento {

	private String state;
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String state){
		this.state = state;
	}
}
