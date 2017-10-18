package com.sunwd.pattern.creation.num00.multistatic;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}

}
