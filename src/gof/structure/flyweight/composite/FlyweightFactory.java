package gof.structure.flyweight.composite;

import java.util.HashMap;

public class FlyweightFactory {
	
	private HashMap flies = new HashMap();
	
	public FlyweightFactory(){};
	
	public Flyweight factory(String compositeState){
		ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
		int length = compositeState.length();
		Character state = null;
		for(int i = 0; i < length; i++){
			state = new Character(compositeState.charAt(i));
			System.out.println("factory("+state+")");
			compositeFly.add(state, this.factory(state));
		}
		return compositeFly;
	}
	
	public Flyweight factory(Character state){
		if(flies.containsKey(state)){
			return (Flyweight) flies.get(state);
		}else{
			Flyweight fly = new ConcreteFlyweight(state);
			flies.put(state, fly);
			return fly;
		}
	}
}
