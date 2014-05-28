package gof.behaviour.iterator;

public class OutConcreteIterator implements OutIterator {

	private WhiteConcreteAggregate agg;
	private int index = 0;
	private int size = 0;
	
	public OutConcreteIterator(WhiteConcreteAggregate agg){
		this.agg = agg;
		this.size = agg.size();
		this.index = 0;
	}
	
	@Override
	public void first() {
		index = 0;
	}
	
	@Override
	public void next() {
		if(index < size){
			index++;
		}
	}

	@Override
	public boolean isDone() {
		return (index >= size);
	}

	@Override
	public Object currentItem() {
		return agg.getElement(index);
	}

}
