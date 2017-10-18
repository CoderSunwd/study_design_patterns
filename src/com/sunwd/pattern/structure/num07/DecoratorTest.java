package com.sunwd.pattern.structure.num07;

public class DecoratorTest {
	
	public static void main(String[] args){
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}
