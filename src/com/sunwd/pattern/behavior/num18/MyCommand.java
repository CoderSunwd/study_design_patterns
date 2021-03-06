package com.sunwd.pattern.behavior.num18;

public class MyCommand implements Command {

	private Receiver receiver;
	
	public MyCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public void exe(){
		receiver.action();
	}
}
