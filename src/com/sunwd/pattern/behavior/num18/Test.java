package com.sunwd.pattern.behavior.num18;

public class Test {

	public static void main(String[] args){
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
	
}
