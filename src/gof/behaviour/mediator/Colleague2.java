package gof.behaviour.mediator;

public class Colleague2 extends Colleague {

	public Colleague2(Mediator m){
		super(m);
	}
	
	@Override
	public void action() {
		System.out.println("Colleague2");
	}

}
