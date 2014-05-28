package gof.behaviour.iterator;

public class BlackConcreteAggregate extends BlackAggregate {

	private Object[] obj = {
			"Monk Tang",
			"Monkey",
			"Horse"
	};
	
	@Override
	public InIterator createIterator() {
		return new InConcreteIterator();
	}
	
	private class InConcreteIterator implements InIterator{

		private int currentIndex = 0;
		
		@Override
		public void first() {
			currentIndex = 0;
		}

		@Override
		public void next() {
			currentIndex++;
		}

		@Override
		public boolean isDone() {
			return currentIndex >= obj.length;
		}

		@Override
		public Object currentItem() {
			return obj[currentIndex];
		}
		
	} 

}
