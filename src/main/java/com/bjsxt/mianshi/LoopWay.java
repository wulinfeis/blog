package com.bjsxt.mianshi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LoopWay {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("蛇皮1");
		list.add("蛇皮2");
		list.add("蛇皮3");
		list.add("蛇皮4");
		
		//普通for循环
		for (int i = 0; i < list.size(); i++) {
			System.out.println("遍历集合的第一种方式："+list.get(i));
		}
		
		//迭代器遍历，Iterator
		Iterator iterator = (Iterator) list.iterator();
		while (iterator.hasNext()) {
			System.out.println("遍历集合的第二种方式："+iterator.next());
		}
		
		//foreach
		for(String s : list) {
			System.out.println("遍历集合的第三种方式："+s);
		}
	}
}
