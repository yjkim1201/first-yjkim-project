package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

public void practice1() {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("����: ");
	int num=sc.nextInt();
	
	System.out.println((num>0)? "�����": "����� �ƴϴ�.");
	
	
}
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		int num=sc.nextInt();
		
		System.out.println((num>0)? "�����": ((num==0)? "0�̴�": "������"));
	}
	
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����: ");
		int num=sc.nextInt();
		
		System.out.println((num%2==0)? "¦����": "Ȧ����");
		
		
	}
    public void practice4() {
    	
    	
    }


}
