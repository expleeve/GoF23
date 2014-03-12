package gof.creation.builder;

import java.util.Date;

public abstract class AutoMessage {

	protected String subject = "";
	protected String body = "";
	protected String from = "";
	protected String to = "";
	protected Date sendDate = null;
	
	public AutoMessage(){
		
	}
	
	public void send(){
		
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

}