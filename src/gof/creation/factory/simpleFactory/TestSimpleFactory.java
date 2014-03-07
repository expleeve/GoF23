package gof.creation.factory.simpleFactory;

public class TestSimpleFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		//
		Product product = ProductFactory.getProductInstance();
		//
		String name = "gof.creation.factory.simpleFactory.Cookie";
		Product subProduct = ProductFactory.getProductInstanceByName(name);
		//
 		Date date = Date.getInstance();
	}

}
