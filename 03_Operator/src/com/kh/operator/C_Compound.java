package com.kh.operator;

public class C_Compound {

	/*
	 * *���մ��Կ�����
	 *  ��������ڿ� ���Կ����ڸ� �Բ� ����ϴ� ������
	 *  
	 *  ����
	 *  += -= *= /= %=
	 *  
	 *  ��� ����
	 *  a += 3; -> a=a+3;
	 *  ������ a��� ������ �� ����  3�� ���ؼ� �ٽ� a��� ������ �����Ѵٴ� ��	 
	 */
	
	public void method1() {
		
		int num = 12;
		
		System.out.println("���� num: "+num); //12
		
		//����) ����������� num 3 ������Ű��=> ����
		num=num+3;
		System.out.println("������ num: "+num); //15
		
		//���մ��Կ����ڸ� �̿��Ͽ� num�� 3 ������Ű��=> ����
		num += 3;  //num=num+3;
		System.out.println("�� ������ num: "+num); //18
		
	   //num�� 5 ���ҽ�Ű�� => ����
		num -= 5;  //num=num-5;
		System.out.println("���ҵ� num: "+num); //13
		
		//num�� 6�� ������Ű��=> ����
		num *= 6;  //num=num*6; 
		System.out.println("6�� ������ num: "+num); //78
		
		//num�� 2�� ���ҽ�Ű��=> ������
		num /= 2;  //num=num/2;
		System.out.println("2�� ���ҽ�Ų num: "+num); //39
	
		//num�� 4�� ������ ���� �������� num�� ���Խ�Ű�� =>��ⷯ
		num %= 4; //num=num%4;
		System.out.println("���� num: "+num); //3
		
		// += �� ��� ���ڿ� ���յ� ����
		String str= "Hello";
				
		//HelloWorld ���
		//str = str+"World";
		
		str+= "World";
		
		System.out.println(str);
	
	}
	
}
