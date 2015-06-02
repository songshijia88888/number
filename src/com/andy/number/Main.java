package com.andy.number;

import java.util.HashMap;

public class Main {
	public static void main(String[] args){
		HashMap<String, Long> map = Constant.getHashMap();
		System.out.println(map);
		
		Long arabic = Convertor.ch2Arabic("一千七百二十六");
		System.out.println(arabic);
		Long arabic1 = Convertor.ch2Arabic("一亿三千九百八十二");
		System.out.println(arabic1);
		Long arabic2 = Convertor.ch2Arabic("四亿九千一百三十八万六千五百一十七");
		System.out.println(arabic2);
	}
}
