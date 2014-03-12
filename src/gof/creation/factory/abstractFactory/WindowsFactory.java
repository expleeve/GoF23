package gof.creation.factory.abstractFactory;

public class WindowsFactory implements OSFactory {

	@Override
	public Button factoryButton() {
		return new WindowsButton();
	}

	@Override
	public Text factoryText() {
		return new WindowsText();
	}

}
