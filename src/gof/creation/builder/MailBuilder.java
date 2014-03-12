package gof.creation.builder;

import java.util.Date;

public abstract class MailBuilder {

	protected AutoMessage msg;
	
	public MailBuilder(){
		
	}
	
	public abstract void buildSubject();
	
	public abstract void buildBody();
	
	public void buildTo(String toAddr){
		msg.setTo(toAddr);
	}
	
	public void buildFrom(String fromAddr){
		msg.setFrom(fromAddr);
	}
	
	public void buildSendDate(){
		msg.setSendDate(new Date());
	}
	
	public void sendMessage(){
		msg.send();
	}
}
