package com.sunwd.pattern.creation.num03;

public class SingletonTest {
	
	/* 持有私有静态实例，防止被引用，此处复制为null，目的是实现延迟加载 */
	private static SingletonTest instance  = null;
	
	/* 私有构造方法，防止被实例化 */
	private SingletonTest(){
	}
	
	/* 此处使用一个内部类来维护单例 */
	private static synchronized void syncInit(){
		if (instance == null){
			instance = new SingletonTest();
		}
	}
	
	/* 获取实例 */
	public static SingletonTest getInstance(){
		if (instance == null){
			syncInit();
		}
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve(){
		return instance;
	}
}
