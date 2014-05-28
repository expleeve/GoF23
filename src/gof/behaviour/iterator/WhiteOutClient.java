package gof.behaviour.iterator;

public class WhiteOutClient {

	public static void main(String[] args) {
		WhiteOutClient client = new WhiteOutClient();
		client.operation();
	}

	private OutIterator it;
	private WhiteAggregate agg = new WhiteConcreteAggregate();
	
	public void operation(){
		it = agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem().toString());
			it.next();
		}
	}
}
