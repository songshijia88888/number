package com.andy.number;

import java.util.HashMap;

public class Constant {
	private static HashMap<String, Long> map = new HashMap<String, Long>();
	
	static{
		map.put("��", new Long(0));
		map.put("һ", new Long(1));
		map.put("��", new Long(2));
		map.put("��", new Long(3));
		map.put("��", new Long(4));
		map.put("��", new Long(5));
		map.put("��", new Long(6));
		map.put("��", new Long(7));
		map.put("��", new Long(8));
		map.put("��", new Long(9));
		map.put("ʮ", new Long(10));
		map.put("��", new Long(100));
		map.put("ǧ", new Long(1000));
		map.put("��", new Long(10000));
		map.put("��", new Long(100000000));
	}
	
	public static HashMap<String, Long> getHashMap(){
		return map;
	}
}
