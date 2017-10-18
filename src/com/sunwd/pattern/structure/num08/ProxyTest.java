package com.sunwd.pattern.structure.num08;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
