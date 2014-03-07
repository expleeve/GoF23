package gof.creation.factory.factoryMethod;

public class RealCreator2 implements Creator {

	@Override
	public Product factory() {
		return new RealProduct2();
	}

}
