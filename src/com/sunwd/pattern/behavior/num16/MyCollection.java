package com.sunwd.pattern.behavior.num16;

public class MyCollection implements Collection {
	
	public String string[] = {"A", "B", "C", "D", "E"};
	
	@Override
	public Iterator iterator(){
		return new MyIterator(this);
	}

	@Override
	public Object get(int i){
		return string[i];
	}
	
	@Override
	public int size(){
		return string.length;
	}
}
