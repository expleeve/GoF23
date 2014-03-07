package gof.creation.factory.factoryMethod;

public class RealCreator1 implements Creator {

	@Override
	public Product factory() {
		return new RealProduct1();
	}

}
