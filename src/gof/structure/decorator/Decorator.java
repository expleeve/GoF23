package gof.structure.decorator;

public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	public Decorator(){
		
	}
	
	@Override
	public void sampleOperation() {
		component.sampleOperation();
	}

}
