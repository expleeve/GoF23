package gof.structure.flyweight.composite;

public class FlyweightTest {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory("aba");
		fly.operation("Composite Call");
	}

}
