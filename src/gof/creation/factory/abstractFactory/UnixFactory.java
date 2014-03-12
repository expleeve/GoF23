package gof.creation.factory.abstractFactory;

public class UnixFactory implements OSFactory {

	@Override
	public Button factoryButton() {
		return new UnixButton();
	}

	@Override
	public Text factoryText() {
		return new UnixText();
	}

}
