package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

public void practice1() {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("정수: ");
	int num=sc.nextInt();
	
	System.out.println((num>0)? "양수다": "양수가 아니다.");
	
	
}
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc.nextInt();
		
		System.out.println((num>0)? "양수다": ((num==0)? "0이다": "음수다"));
	}
	
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc.nextInt();
		
		System.out.println((num%2==0)? "짝수다": "홀수다");
		
		
	}
    public void practice4() {
    	
    	
    }


}
