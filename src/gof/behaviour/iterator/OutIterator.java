package gof.behaviour.iterator;

public interface OutIterator {

	void first();
	
	void next();
	
	boolean isDone();
	
	Object currentItem();
}
