package gof.creation.factory.factoryMethod;

public class TestFactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Creator creator1, creator2;
		Product product1, product2;
		
		creator1 = new RealCreator1();
		product1 = creator1.factory();
		
		creator2 = new RealCreator2();
		product2 = creator2.factory();
	}

}
