package com.sunwd.pattern.structure.num10;

public abstract class Brige {
	private Sourceable source;
	
	public abstract void method();
	
	public Sourceable getSource(){
		return source;
	}
	
	public void setSource(Sourceable source){
		this.source = source;
	}
}
