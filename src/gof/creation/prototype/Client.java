package gof.creation.prototype;

public class Client {

	private Prototype prototype;
	
	public void operation(Prototype prototype){
		this.prototype = (Prototype)prototype.clone();
	}
}
