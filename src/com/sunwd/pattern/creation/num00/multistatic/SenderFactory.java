package com.sunwd.pattern.creation.num00.multistatic;

public class SenderFactory {
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
	
}
