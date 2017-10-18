package com.sunwd.pattern.creation.num00.multistatic;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sender sender = SenderFactory.produceMail();
		sender.Send();
	}

}
