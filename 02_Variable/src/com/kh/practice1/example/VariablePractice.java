package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String name=sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��)");
		String gender=sc.nextLine();
		
		System.out.print("Ű�� �Է��ϼ���(cm)");
		double height=sc.nextDouble();
		
		System.out.println("Ű "+height+"�� "+age+"�� "+gender+"�� "+name+"�� �ݰ����ϴ�^^");
	  
	}
		
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1=sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2=sc.nextInt();
		
		System.out.println("���ϱ� ��� "+(num1+num2));
		System.out.println("���� ��� : "+(num1-num2));
		System.out.println("���ϱ� ��� : "+(num1*num2));
		System.out.println("������ �� ��� : "+(num1/num2));
	}
		
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		double num1=sc.nextDouble();
		
		System.out.print("����: ");
		double num2=sc.nextDouble();
		
		System.out.println("����: "+(num1*num2));
		System.out.println("�ѷ�: "+((num1+num2)*2));
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str=sc.nextLine();
		
		System.out.println("ù ��° ����:"+str.charAt(0));
		System.out.println("�� ��° ����:"+str.charAt(1));
		System.out.println("�� ��° ����:"+str.charAt(2));
		
	}
		
		
		
	}
	
	
