package gof.creation.factory.simpleFactory;

public abstract class Date {

	public static Date getInstance(){
		return new SimpleDate();
	}
}

class SimpleDate extends Date{
	
}
