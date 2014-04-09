package gof.structure.flyweight.single;

public class ConcreteFlyweight extends Flyweight {

	private Character intrinsicState = null;
	
	public ConcreteFlyweight(Character state){
		this.intrinsicState = state;
	}
	
	@Override
	public void operation(String state) {
		System.out.println("IntrinsicState = " + intrinsicState + " Extrinsic State = " + state);
	}

}
