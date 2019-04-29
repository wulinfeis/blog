package com.bjsxt.mianshi;
/**
 * 
 * Title:   饿汉式
 * @author wulinfei 
 * @date 2019年2月14日
 * Description:
 */
public class Singleton_two {
	private static Singleton_two singleton = new Singleton_two();
	private Singleton_two() {};
	public static Singleton_two getSingleton() {
		return singleton;
	}
}
