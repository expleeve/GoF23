package gof.creation.builder;

public class GoodbyeBuilder extends MailBuilder {

	public GoodbyeBuilder(){
		msg = new GoodbyeMessage();
	}
	
	@Override
	public void buildSubject() {
		msg.setSubject("Goodbye");
	}

	@Override
	public void buildBody() {
		msg.setBody("Goodbye");
	}

}
