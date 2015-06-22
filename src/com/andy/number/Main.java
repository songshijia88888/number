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
		
		Long arabic = Convertor.ch2Arabic("һǧ�߰ٶ�ʮ��");
		System.out.println(arabic);
		Long arabic1 = Convertor.ch2Arabic("һ����ǧ�Űٰ�ʮ��");
		System.out.println(arabic1);
		Long arabic2 = Convertor.ch2Arabic("���ھ�ǧһ����ʮ������ǧ���һʮ��");
		System.out.println(arabic2);
		Long arabic3 = Convertor.ch2Arabic("һǧ�߰ٶ�ʮ");
		System.out.println(arabic3);
		
		//ͼ�ν���
		JFrame jframe = new JFrame("������������ת����");
		jframe.setSize(680, 1040);
//		JPanel jpanel = new JPanel();
//		JButton jFile = new JButton("ѡ���ļ�");
//		JTextField jtext = new JTextField(1);
//		jpanel.add(jFile, BorderLayout.EAST);
//		jpanel.add(jtext, BorderLayout.WEST);
		
//		jframe.add(jpanel, BorderLayout.NORTH);
		JFileChooser jFileChooser = new JFileChooser();
		jframe.add(jFileChooser, BorderLayout.WEST);
		JTextArea jarea = new JTextArea();
		//jarea.setSize(260, 430);
		jarea.setText("************************************************������������ת����������־************************************************");
		jframe.add(jarea, BorderLayout.CENTER);
		
		jframe.pack();
		jframe.setVisible(true);
	}
}
