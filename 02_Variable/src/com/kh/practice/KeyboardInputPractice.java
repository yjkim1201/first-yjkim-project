package com.kh.practice;
import java.util.Scanner;

public class KeyboardInputPractice {

	
	public void myCalculator() {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("ù ��° ����:");
	int fir = sc.nextInt();
	sc.nextLine();
	
	System.out.print("�� ��° ����:");
	int sec = sc.nextInt();
	sc.nextLine();
	
	System.out.println("���ϱ� ���:"+(fir+sec));
	System.out.println("���� ���:"+(fir-sec));
	System.out.println("���ϱ� ���:"+(fir*sec));
	System.out.println("������ ���:"+(fir/sec));
	
	
	
	}
	
}



