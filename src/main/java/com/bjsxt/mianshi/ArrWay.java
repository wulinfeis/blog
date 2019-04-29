package com.bjsxt.mianshi;

public class ArrWay {
	public static void main(String[] args) {
		int[] arr = {12,4,1,66,54,6,74,-3};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("数组遍历的方式一："+arr[i]);
		}
		for(int i : arr) {
			System.out.println("数组遍历的方式二："+i);
		}
		System.out.println("数组遍历的方式三："+java.util.Arrays.toString(arr));
		
	}
}
