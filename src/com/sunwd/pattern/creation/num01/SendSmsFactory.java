package com.sunwd.pattern.creation.num01;

public class SendSmsFactory implements Provider{
	
	public Sender produce(){
		return new SmsSender();
	}
	
}
