package gof.creation.builder;

public class MailDirector {

	MailBuilder builder;
	
	public MailDirector(MailBuilder builder){
		this.builder = builder;
	}
	
	public void construct(String toAddr, String fromAddr){
		builder.buildSubject();
		builder.buildBody();
		builder.buildTo(toAddr);
		builder.buildFrom(fromAddr);
		builder.buildSendDate();
		builder.sendMessage();
	}
}
