package com.bjsxt.mianshi;

import java.util.Random;
/**
 * 
 * Title:   获取数字随机数、获取随机字符串、获取当前毫秒值的时间戳
 * @author wulinfei 
 * @date 2019年2月19日
 * Description:
 */
public class RandomString {
	public static void main(String[] args) {
		System.out.println(RandomString.getRandomString(10));
		System.out.println(RandomString.getRandomNumberString(10));
		System.out.println(RandomString.getTimeStamp());
	}
	
	private static String  getTimeStamp() {
		return String.valueOf(System.currentTimeMillis() / 1000);
	}

	public static String getRandomString(int length) {
		// 定义一个字符串（A-Z，a-z，0-9）即62位；
		String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		// 由Random生成随机数
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		// 长度为几就循环几次
		for (int i = 0; i < length; ++i) {
			// 产生0-61的数字
			int number = random.nextInt(62);
			// 将产生的数字通过length次承载到sb中
			sb.append(str.charAt(number));
		}
		// 将承载的字符转换成字符串
		return sb.toString();
	}

	public static String getRandomNumberString(int i) {
		 //将0~1之间double类型的数字转换成String对象
		String s = String.valueOf(Math.random());
		//截取.之后的所有字符
		s = s.substring(s.indexOf(".")+1);
		if(i <= s.length()) {
			 //直接截取
			return s.substring(0, i);
		}else {
			//如果需要的字符长度大于获取到的字符长度，就循环调用这个方法，
			return s + getRandomString(i - s.length());
		}
	}

}
