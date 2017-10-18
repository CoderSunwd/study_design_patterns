package com.sunwd.pattern.creation.num01;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}

}
