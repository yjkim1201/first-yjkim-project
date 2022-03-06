package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	//첫번째 문제
	public void method1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자: ");
		String num=sc.nextLine();
		int ch=num.charAt(0);
			
		
		System.out.println("A Unicode: "+ch);
		
	}
	
	// 잘 모르겟음;; 유니코드 키보드에서 어떻게 가져오지..?
	
	//두번재 문제
	public void method2() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("국어: ");
		double num1=sc.nextDouble();
		System.out.print("영어: ");
		double num2=sc.nextDouble();
		System.out.print("수학: ");
		double num3=sc.nextDouble();
		
		int sum=(int)(num1+num2+num3);
		int avg=(int)((num1+num2+num3)/3);
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
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
