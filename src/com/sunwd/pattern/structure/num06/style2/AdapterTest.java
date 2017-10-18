package com.sunwd.pattern.structure.num06.style2;

public class AdapterTest {
	
	public static void main(String[] args){
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
