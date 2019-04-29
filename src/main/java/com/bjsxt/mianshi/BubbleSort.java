package com.bjsxt.mianshi;

import java.util.Arrays;
/**
 * 
 * Title:   冒泡排序
 * @author wulinfei 
 * @date 2019年2月14日
 * Description:
 */
public class BubbleSort {
	public static void bubbkeSort(int [] arr) {
		int tem;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					tem = arr [j];
					arr[j] = arr[ j + 1];
					arr[j+1] = tem;
				}
			}
		}
	}
	public static void bubbkeSorts(int [] arr) {
		int item;
		for (int i = 0; i < arr.length - 1; i++) {//控制外层循环次数
			for (int j = 0; j < arr.length-i-1; j++) {//控制冒泡循环次数
				if(arr[j]<arr[j+1]) {
					item = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = item;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] ars = {1,4,9,23,41,567,2,6,3,5};
		BubbleSort.bubbkeSorts(ars);
		System.out.println(java.util.Arrays.toString(ars));
		BubbleSort.bubbkeSort(ars);
		System.out.println(java.util.Arrays.toString(ars));
	}   
}
