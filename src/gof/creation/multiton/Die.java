package gof.creation.multiton;

public class Die {
	private static Die die1 = new Die();
	private static Die die2 = new Die();

	private Die() {

	}

	public static Die getInstance(int whichOne) {
		switch (whichOne) {
		case 1:
			return die1;
		case 2:
			return die2;
		default:
			return null;
		}
	}
}
