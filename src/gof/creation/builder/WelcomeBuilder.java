package gof.creation.builder;

public class WelcomeBuilder extends MailBuilder {

	public WelcomeBuilder(){
		msg = new WelcomeMessage();
	}
	
	@Override
	public void buildSubject() {
		msg.setSubject("Welcome");
	}

	@Override
	public void buildBody() {
		msg.setBody("Welcome");
	}

}
