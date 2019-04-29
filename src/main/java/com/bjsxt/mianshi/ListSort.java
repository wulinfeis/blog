package com.bjsxt.mianshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bjsxt.pojo.Student;


/**
 * 
 * Title:   集合排序
 * @author wulinfei 
 * @date 2019年2月15日
 * Description: 
 */
public class ListSort {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("张三",22));
		list.add(new Student("李四",19));
		list.add(new Student("王五",23));
		list.add(new Student("赵六",18));
		
		//在实体类里面重现排序方法
		Collections.sort(list);
		System.out.println(list);
	}
}
