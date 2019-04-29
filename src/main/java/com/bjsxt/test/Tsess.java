package com.bjsxt.test;


import java.util.HashMap;
import java.util.Map;

import com.bjsxt.pojo.BlogArticle;

public class Tsess {
	
	
	public static void main(String[] args) {
		int [] arr = {1,333,22,14,99,65,123,564,0};
		int item;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					item = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = item;
				}
			}
		}
		System.out.println(java.util.Arrays.toString(arr));
		
	}
	
	public void s() {
	}
}
