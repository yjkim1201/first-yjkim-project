package com.kh.operator;

public class A_Arithmetic {

	/*
	 * *��� ������
	 * ���׿����ڷμ� ���� ���, �켱������ ������ �˴� �Ϲ� ���� ����� ������ ������ �ϴ� ������
	 * 
	 * ����
	 * + : ����
	 * - : ����
	 * * : ����
	 * ������(/) : ������       =>�����⸦ �ϰ� ���� ���Ѵ�.
	 * % : ��ⷯ(Modular)=>�����⸦ �ϰ� �������� ���Ѵ�.
	 * 
	 */
	
	public void method1() {
		int num1=10;
		int num2=3;
		
		System.out.println("num1+num2 = "+(num1+num2));
	    // (num1+num2)�� ��ȣ�� ����� 13�̶�� ����� ���´�.
		// ����, num1+num2�� �״�� ����ϸ�
		// Stringó�� ���� ���� 10, ���� 3�� ���ڿ�ó�� �ϳ��� ���̾� ����ϱ� ������ 103�� ����
		// => ��, ���� �켱������ ������ +�̱� ������ ������ ������ ����->���������� �帣�� ����
	
		System.out.println("num1-num2= "+(num1-num2));
		
		// ������ ���, ������ �켱������ ������
		// Stringó�� ���� 10�� 3�� ���� �ν��ϱ� ������ ������ ������ �߻��Ѵ�.=>���ڿ�-���ڰ� ��
		// => (num1-num2) ó�� ��ȣ�� ������� �Ѵ�.
		
		System.out.println("num1*num2= "+num1*num2);
		System.out.println("num1/num2= "+num1/num2); //3: ��
		System.out.println("num1%num2= "+num1%num2); //1: ������
	    // ����, ������, ��ⷯ�� ��쿡�� �������� �켱������ ���� ������
		// ��ȣ�� ���� ���� �ʾƵ� ��Ȯ�� ����� ���´�.
		// �������: �ٸ� ��ȣ�� ���� ���� �����Ѵ�. �������� �������� ����
		
		//System.out.println(10/0);
		//System.out.println(10%0);
	    //ArithmeticException: / by zero ���� �߻�
		//=>���а� ���������� 0���� ���� �� ����. ����!!
		
		//�Ǽ��� ���
	    double a=/*(double)*/35;  //35.0
	    double b=10; //10.0
	    
	    System.out.println("a+b= "+(a+b)); //45.0
		System.out.println("a-b= "+(a-b)); //25.0
		System.out.println("a*b= "+(a*b)); //350.0
		System.out.println("a/b= "+(a/b)); //3.5
		System.out.println("a%b= "+(a%b)); //5.0
		//�Ǽ������� ���� ������� �Ǽ�
		
		
	}
	
	
	
}
