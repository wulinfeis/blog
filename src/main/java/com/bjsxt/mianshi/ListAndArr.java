package com.bjsxt.mianshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * Title:   集合跟数组之间的相互转换
 * @author wulinfei 
 * @date 2019年2月14日
 * Description:
 */
public class ListAndArr {
	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		   list.add("123");
		   list.add("345");
		   list.add("456");
		   
		  //集合转换为数组第一种方式
		  String[] strings = list.toArray(new String[list.size()]);
	      for(String i : strings) {
	    	  System.out.println("集合转换为数组第一种方式:"+i);
	      }
	      System.out.println("---------------------------------");
	      //集合转换为数组第二种方式
		  String[] arr2 = (String[])list.toArray(new String[0]);
		  for(String i : arr2) {
	    	  System.out.println("集合转换为数组第二种方式:"+i);
	      }
		  System.out.println("---------------------------------");
		  //数组转集合
		  //这里特别需要注意的是，使用这种方式转来的list的类型是Arrays的一个内部类，
		  //拥有的方法数量有限，不具备add 、remove等的常用操作
		  List<String> lists = Arrays.asList(arr2);
	      for(String s : lists) {
	    	  System.out.println("数组转集合:"+s);
	      }
	      
	      //数组转集合   使用这种方式，使得转换集合后的数组具有集合的方法
	      List<String> lista = new ArrayList<>(Arrays.asList(arr2));
	      lista.add("111");
	      for(String a : lista) {
	    	  System.out.println(a);
	      }
	}
}
