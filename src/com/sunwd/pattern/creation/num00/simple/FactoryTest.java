package com.sunwd.pattern.creation.num00.simple;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}

}
