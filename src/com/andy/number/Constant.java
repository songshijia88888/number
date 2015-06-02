package com.andy.number;

import java.util.HashMap;

public class Constant {
	private static HashMap<String, Long> map = new HashMap<String, Long>();
	
	static{
		map.put("零", new Long(0));
		map.put("一", new Long(1));
		map.put("二", new Long(2));
		map.put("三", new Long(3));
		map.put("四", new Long(4));
		map.put("五", new Long(5));
		map.put("六", new Long(6));
		map.put("七", new Long(7));
		map.put("八", new Long(8));
		map.put("九", new Long(9));
		map.put("十", new Long(10));
		map.put("百", new Long(100));
		map.put("千", new Long(1000));
		map.put("万", new Long(10000));
		map.put("亿", new Long(100000000));
	}
	
	public static HashMap<String, Long> getHashMap(){
		return map;
	}
}
