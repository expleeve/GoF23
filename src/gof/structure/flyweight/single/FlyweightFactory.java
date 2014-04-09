package gof.structure.flyweight.single;

import java.util.HashMap;

public class FlyweightFactory {

	private HashMap flies = new HashMap();
	private Flyweight lnkFlyweight;
	
	public FlyweightFactory(){}
	
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
