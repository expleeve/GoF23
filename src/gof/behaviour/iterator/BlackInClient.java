package gof.behaviour.iterator;

public class BlackInClient {

	private InIterator it;
	private BlackAggregate agg = new BlackConcreteAggregate();
	
	public static void main(String[] args){
		BlackInClient client = new BlackInClient();
		client.operation();
	}
	
	public void operation(){
		it = agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem().toString());
			it.next();
		}
	}
}
