package com.bjsxt.test;

public class MyTest {

	public static void main(String[] args) {

		if (getInt("3") != 0) {
			System.out.println("进来了");
			if (getInt("3") == 1) {
				System.out.println("进来了" + 1);
			} else if (getInt("3") == 2) {
				System.out.println("jinlaile");
			} else {
				System.out.println("!!!!!!!!!!!!!!");
			}
		}
	}

	public static int getInt(String a) {
		System.out.println("执行了");
		if (a.equals("1")) {
			return 1;
		} else if (a.equals("2")) {
			return 2;
		} else {
			return 3;
		}

	}
}
