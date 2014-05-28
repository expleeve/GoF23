package gof.behaviour.iterator;

public class WhiteConcreteAggregate extends WhiteAggregate {

	private Object[] objs = {
			"Monk Tang",
			"Monkey",
			"Horse"
	};
	
	public OutIterator createIterator(){
		return new OutConcreteIterator(this);
	}
	
	public Object getElement(int index){
		if(index < objs.length){
			return objs[index];
		}else{
			return null;
		}
	}
	
	public int size(){
		return objs.length;
	}
}
