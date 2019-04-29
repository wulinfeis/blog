package com.bjsxt.mianshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DictionarySort {
	public static void main(String[] args) {
		DictionarySort.SortList();
		DictionarySort.mapSort();
	}
	
	private static void SortList() {
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("TIDA0001");
		arl.add("userID19959248596551");
		arl.add("kHoSxvLZGxSoFsjxlbzEoUzh5PAnTU7T");
		arl.add("1.0.0");
		arl.add("XO99Qfxlti9iTVgHAjwvJdAZKN3nMuUhrsPdPlPVKlcyS50N6tlLnfuFBPIucaMS");
 
		Collections.sort(arl, new Comparator<String>() {
		    public int compare(String o1, String o2) {
		        try {
		            // 取得比较对象的汉字编码，并将其转换成字符串
		            String s1 = new String(o1.toString().getBytes("GB2312"), "ISO-8859-1");
		            String s2 = new String(o2.toString().getBytes("GB2312"), "ISO-8859-1");
		            // 运用String类的 compareTo（）方法对两对象进行比较
		            return s1.compareTo(s2);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return 0;
		    }
		});// 根据元素的自然顺序 对指定列表按升序进行排序。
 
		for (int i = 0; i < arl.size(); i++) {
		    System.out.println(arl.get(i));
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public static void mapSort() {
		 TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
	        treeMap.put("TIDA0001", 2);
	        treeMap.put("userID19959248596551", 5);
	        treeMap.put("kHoSxvLZGxSoFsjxlbzEoUzh5PAnTU7T", 1);
	        treeMap.put("1.0.0", 0); 
	        treeMap.put("XO99Qfxlti9iTVgHAjwvJdAZKN3nMuUhrsPdPlPVKlcyS50N6tlLnfuFBPIucaMS", 9);
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	        }
	}

}
