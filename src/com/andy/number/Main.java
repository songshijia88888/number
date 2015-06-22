package com.andy.number;

import java.awt.BorderLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
		Long arabic3 = Convertor.ch2Arabic("一千七百二十");
		System.out.println(arabic3);
		
		//图形界面
		JFrame jframe = new JFrame("简体中文数字转换器");
		jframe.setSize(680, 1040);
//		JPanel jpanel = new JPanel();
//		JButton jFile = new JButton("选择文件");
//		JTextField jtext = new JTextField(1);
//		jpanel.add(jFile, BorderLayout.EAST);
//		jpanel.add(jtext, BorderLayout.WEST);
		
//		jframe.add(jpanel, BorderLayout.NORTH);
		JFileChooser jFileChooser = new JFileChooser();
		jframe.add(jFileChooser, BorderLayout.WEST);
		JTextArea jarea = new JTextArea();
		//jarea.setSize(260, 430);
		jarea.setText("************************************************简体中文数字转换器工作日志************************************************");
		jframe.add(jarea, BorderLayout.CENTER);
		
		jframe.pack();
		jframe.setVisible(true);
	}
}
