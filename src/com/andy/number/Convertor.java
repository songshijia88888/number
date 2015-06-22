package com.andy.number;

import java.util.HashMap;

public class Convertor {
	private static HashMap<String, Long> map = Constant.getHashMap();
	
	public static String chFormator(String ch){
		String lastChar = ch.substring(ch.length() - 1, ch.length());
		if(map.get(lastChar) > 9){
			ch = ch + "¡„“ª";
		}
		else{
			ch = ch + "“ª";
		}
		
		return ch;
	}
	
	public static Long ch2Arabic(String ch){
		System.out.println(ch);
		Long sumAll = 0l;
		Long sumPart = 0l;
		ch = chFormator(ch);
		
		for(int i = 0; i < ch.length() - 1;){
			String c = ch.substring(i, i + 1);
			Long temp = map.get(c);
			//System.out.println(c + "," + temp);
			if(temp < 10l){				
				String c1 = ch.substring(i + 1, i + 2);
				Long temp1 = map.get(c1);
				//System.out.println(c1 + "," + temp1);
				if(temp1 < 1001l){
					sumPart = sumPart + temp * temp1;
					//System.out.println(sumPart);
				}
				else{
					sumPart = sumPart + temp;
					sumAll = sumAll + sumPart * temp1;
					//System.out.println(sumPart);
					//System.out.println(sumAll);
					sumPart = 0l;
				}
			}
			i = i + 2;
		}
		
		sumAll = sumPart + sumAll;
		
		return sumAll;
	}
	
}
