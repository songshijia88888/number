package com.andy.number;

import java.util.HashMap;

public class Main {
	public static void main(String[] args){
		HashMap<String, Long> map = Constant.getHashMap();
		System.out.println(map);
		
		Long arabic = Convertor.ch2Arabic("һǧ�߰ٶ�ʮ��");
		System.out.println(arabic);
		Long arabic1 = Convertor.ch2Arabic("һ����ǧ�Űٰ�ʮ��");
		System.out.println(arabic1);
		Long arabic2 = Convertor.ch2Arabic("���ھ�ǧһ����ʮ������ǧ���һʮ��");
		System.out.println(arabic2);
	}
}
