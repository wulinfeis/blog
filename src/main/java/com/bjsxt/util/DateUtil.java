package com.bjsxt.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	public static void main(String[] args) {
		getNowTime();
	}
	public static String getNowTime(){
		 //自定义格式化器
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 //获取当前日期和时间
        LocalDateTime ldt=LocalDateTime.now();
        //第二种自定义格式化方式
        String nowTime=dtf.format(ldt);
        System.out.println(nowTime);
		return nowTime;
	}
}
