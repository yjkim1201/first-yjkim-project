package com.kh.operator;

public class D_LogicalNegation {

	/*
	 * *������������
	 * true �Ǵ� false��� ������ ���������ִ� ������
	 * 
	 * [ ǥ���� ] ! ����
	 * 
	 */
	
	public void method1() {
		
		System.out.println("true�� ����: "+!true);
		System.out.println("false�� ����: "+!false);
		
		boolean b1=true;
		boolean b2=!b1;
		
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		
	}
	
	
}
