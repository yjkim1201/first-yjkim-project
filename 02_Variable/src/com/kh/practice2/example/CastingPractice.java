package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	//ù��° ����
	public void method1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		String num=sc.nextLine();
		int ch=num.charAt(0);
			
		
		System.out.println("A Unicode: "+ch);
		
	}
	
	// �� �𸣰���;; �����ڵ� Ű���忡�� ��� ��������..?
	
	//�ι��� ����
	public void method2() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		double num1=sc.nextDouble();
		System.out.print("����: ");
		double num2=sc.nextDouble();
		System.out.print("����: ");
		double num3=sc.nextDouble();
		
		int sum=(int)(num1+num2+num3);
		int avg=(int)((num1+num2+num3)/3);
		
		System.out.println("����: "+sum);
		System.out.println("���: "+avg);
	}
	public void method3() {
	int iNum1=10;
	int iNum2=4;
	
	float fNum=3.0f;
	double dNum=2.5;
	char ch='A';
	
	//System.out.println(iNum1%iNum2);
	//System.out.println((int)dNum);
	
	//System.out.println((double)iNum2*dNum);
	//System.out.println((double)iNum1);
	
	//System.out.println((double)iNum1/iNum2);
	//System.out.println(dNum);
	
	//System.out.println((int)fNum);
	//System.out.println(iNum1/(int)fNum);
	
	//System.out.println((float)iNum1/fNum);
	//System.out.println(iNum1/(double)fNum);
	
	//System.out.println(ch);
	//System.out.println((int)ch);
	//System.out.println((int)ch+iNum1);
	System.out.println((char)(ch+iNum1));
	}



}
