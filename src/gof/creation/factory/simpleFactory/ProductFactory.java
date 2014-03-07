package gof.creation.factory.simpleFactory;

public class ProductFactory {

	public static Product getProductInstance(){
		return new Product();
	}
	
	public static Product getProductInstanceByName(String name) throws Exception{
		Class<?> cls = Class.forName(name);
		return (Product) cls.newInstance();
	}
}

class Product{
	
}

class Cookie extends Product{
	
}

class Bread extends Product{
	
}

class Cheese extends Product{
	
}
