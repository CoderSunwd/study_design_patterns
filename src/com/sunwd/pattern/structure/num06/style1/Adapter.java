package com.sunwd.pattern.structure.num06.style1;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is targetable method!");
	}

}
