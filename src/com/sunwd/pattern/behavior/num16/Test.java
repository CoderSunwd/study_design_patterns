package com.sunwd.pattern.behavior.num16;

public class Test {

	public static void main(String[] args){
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
