package gof.creation.builder;

public class ConcreteBuilder extends Builder{

	private Product product = new Product();
	
	public Product retrieveResult(){
		return product;
	}
	
	public void buildPart1(){
		
	}
	
	public void buildPart2(){
		
	}
}
