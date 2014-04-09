package gof.structure.flyweight.single;

public class FlyweightTest {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");
		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");
	}

}
