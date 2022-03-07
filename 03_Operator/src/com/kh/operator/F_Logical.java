package com.kh.operator;
import java.util.Scanner;

public class F_Logical {

	/*
	 * *��������
	 * �� ���� ������ �����ϴ� ������ (���׿�����)
	 * 
	 * [ ǥ���� ] ���� (��������) ���� => ������� ����
	 * 
	 * ����
	 * && : AND ������ (�׸���)
	 *      ���� && ����
	 *      => ����, �������� ������ �� �� true���� ����� true. 
	 * || : OR ������ (�Ǵ�)
	 *      ���� || ����
	 *      => ����, �������� ���� �� �ϳ��� true��� ����� true.
	 *      
	 * ����� ��
	 * 1. true&&true == true
	 * 2. true&&false == false
	 * 3. false&&true == false
	 * 4. false&&false == false
	 * 5. true||true == true     
	 * 6. true||false == true
	 * 7. false||true == true
	 * 8. false||false == false
	 */
	
	public void method1() {
		
		//�񱳿����� + ��������
		//����ڰ� �Է��� �������� ���"�̸鼭(�̰�, �׸���)" ¦������ Ȯ��
		Scanner sc=new Scanner(System.in);
		System.out.print("������ 1�� �Է�: ");
		int num=sc.nextInt();
		
		//�Ǻ��� ����� ���� boolean ������ ������ �ϳ� ����
		boolean result=(num>0) && ((num%2)==0);
		// &&�� �ǹ�: �׸���, ~�鼭, ~�̰�
		
		System.out.println("����ڰ� �Է��� ���� ����̸鼭 ¦���Դϱ�?"+ result); //false
		
	}
	
	public void method2() {
		//����ڰ� �Է��� �������� 1 �̻� 100������ ������ Ȯ���ϱ�
		//=> 1 �̻� �׸��� 100������ ������ Ȯ���ϱ�
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Ѱ� �Է�:");
		int num=sc.nextInt();
		
		// 1<= num <=100 �̷��� ����ó�� �ѹ��� ������ ��� ǥ���� �Ұ���
		// �������� 1���� ũ�ų� ����, 
		// �������� 100���� �۰ų� ���� ���� ������� �Ѵ�.
		
		boolean result= (1<=num)&&(num<=100);
		System.out.println("����ڰ� �Է��� ���� 1�̻� 100�����Դϱ�? "+result);
		
	}
	
	public void method3() {
	
		//����ڰ� �Է��� ���� 'y' "�̰ų�(�Ǵ�)" 'Y'���� Ȯ���ϱ�
		
		Scanner sc=new Scanner(System.in);
		System.out.print("����Ͻ÷��� y �Ǵ� Y�� �Է��ϼ���: ");
		char ch=sc.nextLine().charAt(0); //���� 1���� �ٷ� ���� ���ϱ� ������ ù��° ���ڸ� �����ϴ� charAt ���
		
		boolean result=(ch=='y') || (ch=='Y');
		// ||�� �ǹ�: �Ǵ�, ~�̰ų�
		
		System.out.println("����ڰ� �Է��� ���� y�Ǵ� Y �Դϱ�? "+result);
	}
		
	public void method4() {
		
		/*
		 *  && : �� �� true���� true
		 *  || : �� �� �ϳ��� true�� true (�� �� false���� false)
		 */
		
		int num1 = 10;
		boolean result1=false&&(num1>0);  //result1=false
		// Dead code: �ʿ���� �ڵ�, ���� �� ������ ���� ����(�ܼ� ���)
		// �񱳿��� �� ���� ������ ������� �ʴ´�.
		// => false && ���� ���� ��, ����� ������ false�� �����ٵ� �� �ڵ带 �ۼ��� ������ ���� ����� ��
		
		System.out.println("result1: "+result1);
		
		boolean result2=true || (num1>0); //result2=true
		//Dead code
		//=> true|| ���� ���� ��, ����� ������ true �ϱ� �޺κ��� Dead code�� �Ǵ� ��
		
		System.out.println("result2: "+result2);
		
	}
	
}
	
	
