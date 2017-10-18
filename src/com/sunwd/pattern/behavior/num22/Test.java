package com.sunwd.pattern.behavior.num22;

public class Test {

	public static void main(String[] args){
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
