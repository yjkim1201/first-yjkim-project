package com.kh.arrayHomework;

import java.util.Scanner;

public class Array_Homework {
	
	public void practice13() {
		
		//�ֹε�Ϲ�ȣ�� String ���ڿ��� �Է� �ް�, �Է� ���� ���ڿ��� �� �ε��� �� ���ڸ�
		//char[]�� �Ű� ���(�� ���� �ڸ� ���ĺ��� *�� ���)
		//ex. �ֹε�Ϲ�ȣ(-����): 123456-1234567
		//123456-1******
		
		Scanner sc=new Scanner(System.in); //���ڿ� �Է�
		
		System.out.print("�ֹε�Ϲ�ȣ(-����): ");
		String personId = sc.nextLine();
		
		char[] number = new char[14];  //char �迭 ���� �� �Ҵ�
		
		for(int i=0; i<number.length; i++) {
			number[i] = personId.charAt(i);
			
			if(i<8) {
				System.out.print(number[i]);
				}
			else {
				System.out.print("*");
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
