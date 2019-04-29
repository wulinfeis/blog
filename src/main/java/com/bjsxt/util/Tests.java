package com.bjsxt.util;

import java.util.Random;

public class Tests {
	public static void main(String[] args) {
		System.out.println("天选之子的名字是：吴"+Tests.getRandomString(2));
		
	}
	public static String getRandomString(int length){
		String str = "佳新圆子涵欣怡紫萱思诗文梦雨馨静晨琪";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(18);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
