package com.sunwd.pattern.creation.num00.multi;

public class SenderFactory {
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
	
}
