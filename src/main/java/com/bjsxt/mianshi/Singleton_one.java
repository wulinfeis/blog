package com.bjsxt.mianshi;
/**
 * 
 * Title:   懒汉模式
 * @author wulinfei 
 * @date 2019年2月14日
 * Description:
 */
public class Singleton_one {
	
	private static Singleton_one singleton;
	private Singleton_one() {};
	public static  Singleton_one getSingleton() {
		if(singleton == null) {
			singleton = new Singleton_one();
		}
		return singleton;
	}
}
