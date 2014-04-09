package gof.structure.flyweight.composite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcreteCompositeFlyweight extends Flyweight {

	private HashMap flies = new HashMap(10);
	private Flyweight flyweight;
	
	public ConcreteCompositeFlyweight(){}
	
	public void add(Character key, Flyweight fly){
		flies.put(key, fly);
	}
	
	@Override
	public void operation(String state) {
		Flyweight fly = null;
		for(Iterator it = flies.entrySet().iterator(); it.hasNext();){
			Map.Entry e = (Map.Entry)it.next();
			fly = (Flyweight) e.getValue();
			fly.operation(state);
		}
	}

}
