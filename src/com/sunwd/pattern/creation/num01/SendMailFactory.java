package com.sunwd.pattern.creation.num01;

public class SendMailFactory implements Provider{
	
	public Sender produce(){
		return new MailSender();
	}
	
}
