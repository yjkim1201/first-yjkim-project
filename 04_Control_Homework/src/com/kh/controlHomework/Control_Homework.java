package com.kh.controlHomework;

import java.util.Scanner;

public class Control_Homework {

	//���̵�, ��й�ȣ�� ���ϰ� �α��� ����� �ۼ��Ͻÿ�.(���̵�:boram, ��й�ȣ: 1234)
	//�α��� ���� �� "�α��� ����"
	//���̵� Ʋ���� ��� "���̵� Ʋ�Ƚ��ϴ�."
	//��й�ȣ�� Ʋ���� ��� "��й�ȣ�� Ʋ�Ƚ��ϴ�."
	
	public void practice5() {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("���̵�: ");
	String id=sc.nextLine();
	
	System.out.print("��й�ȣ: ");
	String pw=sc.nextLine();   //���̵�, ��й�ȣ �Է�
	
	if(pw.equals("1234")) {
		if(id.equals("boram")) {    //���̵�, ��й�ȣ�� ��� �°� �Է����� ���
			System.out.print("�α��� ����");
		}
		else {                      //���̵� Ʋ���� ���
			System.out.print("���̵� Ʋ�Ƚ��ϴ�.");
		 }	
    }
	
	else {
	if(id.equals("boram")) {   //��й�ȣ�� Ʋ���� ���
			System.out.print("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	 
	else {
		System.out.print("���̵�, ��й�ȣ ��� Ʋ�Ƚ��ϴ�.");
	 }
	}
  }
	
	public void practice6() {
		
		//������, ȸ��, ��ȸ�� �� �ϳ��� �Է¹޾� �� ����� ���� �� �ִ� ������ ���
		//�����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�
		//ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�
		//��ȸ���� �Խñ� ��ȸ�� ����
		//�߸� �Է����� ��� "�߸� �Է��߽��ϴ�."��� ��¹� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���: ");
		String grade=sc.nextLine();
		
		switch(grade) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����\n�Խñ� �ۼ�, ��� �ۼ� \n�Խñ� ��ȸ");
			break;
			
		case "ȸ��" :
		System.out.println("�Խñ� �ۼ�, ��� �ۼ� \n�Խñ� ��ȸ");
	    	break;
		
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
			
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			return;
		}
	}
	
	
	
	
	
	
	
	public void method1() {
	
	/*
����ڷκ��� ���ڿ��� �Է¹޾� 
�� ���ڿ���ŭ �ݺ��� �������鼭 �� index ��° ���ڸ� �ϳ��� �����Ͽ� ����ϼ���
������ ����
���ڿ��� �Է��ϼ��� : apple
1��° ���� : a
2��° ���� : p
3��° ���� : p
4��° ���� : l
5��° ���� : e	
	 */

		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str=sc.nextLine();
		
		
		for(int i=0; i<str.length(); i++) {  //���ڿ��� ����
					
		System.out.println((i+1)+"��° ����: "+str.charAt(i));
		}
		
		
		
	}
	
}
	
