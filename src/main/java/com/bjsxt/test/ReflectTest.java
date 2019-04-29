package com.bjsxt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.bjsxt.mianshi.Personsa;

public class ReflectTest {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Personsa p1 = new Personsa();
		Class c1 = p1.getClass();
		Class c2 = Personsa.class;
		Class c3 = Class.forName("com.bjsxt.mianshi.Personsa");
		
		System.out.println(c1+"-----------"+c2+"---------"+c3);
		
		System.err.println("获取类完整的名字："+c1.getName());//获得类完整的名字
		System.out.println("--------------------------------------------------------------------");
		//获取类的public类型的属性
		Field[] fields = c1.getFields();
		for(Field field : fields) {
			System.out.println("获取类的public属性："+field);
		}
		System.out.println("--------------------------------------------------------------------");
		//获取类的所有属性,包括私有的
		Field [] allFields = c1.getDeclaredFields();
		for(Field field : allFields) {
			System.out.println("获取类的所有属性："+field.getName());
		}
		System.out.println("--------------------------------------------------------------------");
		//获得类的public类型方法,这里包括 Object 类的一些方法
		Method [] methods = c1.getMethods();
		for(Method method : methods) {
			System.out.println("获取类的public方法："+method.getName());
		}
		System.out.println("--------------------------------------------------------------------");
		//获取类的所有方法
		Method [] allMethods = c1.getDeclaredMethods();
		for(Method method : allMethods) {
			System.out.println("获取类的所有方法："+method.getName());
		}
		System.out.println("--------------------------------------------------------------------");
		//获取指定public类型的属性
		Field f1 = c1.getField("age");
		System.out.println("获取指定的public类型的属性："+f1);
		//获取指定的私有属性
		Field f2 = c1.getDeclaredField("name");
		f2.setAccessible(true);
		System.out.println(f2);
		
		//创建类的一个对象
		Object p2 = c2.newInstance();
		f2.set(p2, "Bob");
		System.out.println(f2.get(p2));
		
		//获取构造方法
		Constructor [] constructors = c2.getConstructors();
		for(Constructor constructor : constructors){
			System.out.println(constructor.toString());//public com.ys.reflex.Person()
		}
		
		
		
		
	}
}
