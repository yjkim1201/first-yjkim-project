package com.kh.operator;

public class B_InDecrease {

	/*
	 * *����������
	 * ���׿����ڷν� �ѹ��� ���� 1���� ���� �Ǵ� ���ҽ�Ű�� ������
	 * 
	 * ����
	 * ++ : �ѹ��� ���� 1�� ������Ű�ڴ�.
	 * [ ǥ���� ]
	 * ++��: ����������
	 * ��++: ����������
	 *  
	 * -- : �ѹ��� ���� 1�� ���ҽ�Ű�ڴ�.
	 * [ ǥ���� ]
	 * --��: ����������
	 * ��--: ����������
	 * 
	 * => �������� ��ġ�� ���� ������ ���� ���� ������
	 * (����������)��: ������ ���� �ǰ� ���� ���� ó����                =>������ ��ó��
	 * ��(����������): ���� ó���ǰ� ���� �� ������ ������ �̷����=>��ó�� ������
	 */
	
	public void method1() {
		int num =10;
		
		System.out.println("num: "+num);
		
		num++; //num ������ �� ���� 1�� ������Ű�ڴ�.
		       //��, num = num+1; �� ������ ���� �ǹ�
		
		
		System.out.println("����� num: "+num);
	}
	
		public void method2() {
			
			//���������� =>�� ���� �� ó��
			int a=10;
			int b=++a; //++a �� �������� a�� ���� 1 ������(11)
			           //= �̶�� �������� b�� a���� ���ԵǴ� ó�������� ��ħ
			System.out.println("a: "+a+", b: "+b);
			//a: 11, b: 11
			
			//����������=> �� ó�� �� ����
			int c=10;
			int d=c++; // =�̶�� ���� �������� ���� d�� ������ c ���� 10�� ���� ���ԵǴ� ó�������� ��ģ ��
			           // c++��� �� �������� c�� ���� 1 ����(11)
			System.out.println("c: "+c+", d: "+d);
			//c:11, d:10
		} //method2 ���� ��
		
		public void method3() {
			
			//��������
			int num1=20;
			int result1 = num1++ * 3; // result1=60, num1=21
		    // ���������ڴ� ���׿����ڶ� �� �Ѱ����� ������ ����ȴ�.
			// �׷��� num1���� 1������ ����ǰ�, result1���� ���� �ȵ�.
			
		System.out.println("num1: "+num1);
		System.out.println("result1: "+result1);
		
		//��������
		int num2=20;
		int result2 = ++num2*3;
		
		
		
		
		
		//num2=21, result2=63
		
		System.out.println("num2: "+num2);
		System.out.println("result2: "+result2);
		
		//-- ����/��������
		int num3 = 10;
		//int result3 = --num3 * 5; //num3=9, result3=45
		int result3= num3--*5; //result3=50, num3=9
		
		System.out.println("num3: "+num3);
		System.out.println("result3: "+result3);
		
		
		
		}
		//quiz
		
		int a=5;
		int b=10;
		int c= (++a)+b; //a=6, c=16
		int d= c/a; //2
		int e = c%a; //4
		int f = e++;  //f=4, e=5
		int g = (--b)+(d--); //b=9, g=11, d=1
		int h = 2;  
		int i=a++ + b / (--c/f) * (g-- - d)%(++e + h); //6+9/ (15/4)*(11-1)%(5+2)
		                                               //6+9/3*10%7
		                                               //6+3*10%7=8
		
		                                                //�����: 12...^^..(�������� ++e +h) ->(6+2)
		
		
	}
	
	

