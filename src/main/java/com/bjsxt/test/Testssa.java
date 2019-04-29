package com.bjsxt.test;

import java.lang.reflect.Field;

import com.bjsxt.mianshi.Personsa;

public class Testssa {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class c2 = Personsa.class;
		Personsa at = new Personsa();  
	        at.setName("AT");  
	        for (Field f : c2.getDeclaredFields()) {  
	           // f.setAccessible(true);//AccessibleTest类中的成员变量为private,故必须进行此操作  
	            System.out.println(f.get(at));//获取当前对象中当前Field的value  
	        }  
	}
}
