package com.sunwd.pattern.structure.num10;

public class BrigeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Brige brige = new MyBrige();
		
		/* 调用第一个对象 */
		Sourceable source1 = new SourceSub1();
		brige.setSource(source1);
		brige.method();
		
		/* 调用第二个对象 */
		Sourceable source2 = new SourceSub2();
		brige.setSource(source2);
		brige.method();
	}

}
