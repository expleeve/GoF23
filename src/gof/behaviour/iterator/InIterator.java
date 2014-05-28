package gof.behaviour.iterator;

public interface InIterator {

	void first();
	
	void next();
	
	boolean isDone();
	
	Object currentItem();
}
