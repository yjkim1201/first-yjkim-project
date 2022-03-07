package com.kh.operator;
import java.util.Scanner;

public class E_Comparison {

	/*
	 * *�񱳿�����(���迬����)
	 * �ΰ��� ���� ������ ���ϴ� ���׿�����
	 * �� ���� ����� ����� ��� true, ������ ��� false
	 * => �Ŀ� Ư�� ������ ������ �� �ִ�[���ǹ�]���� ���� ���� ����!
	 * 
	 * �з�
	 * 1. ũ�� ������ �� => ����, ����
	 * a < b : a�� b���� �۽��ϱ�?
	 * a > b : a�� b���� Ů�ϱ�?
	 * a <= b: a�� b���� �۰ų� �����ϱ�?
	 * a >= b: a�� b���� ũ�ų� �����ϱ�?
	 * 
	 * 
	 * 2. ��ġ���� �� =>���ڻӸ� �ƴ϶� ����, �ּҰ�, ���� ��
	 * a==b : a�� b�� ��ġ�մϱ�?
	 * a!=b : a�� b�� ��ġ���� �ʽ��ϱ�? 
	 */
	
	public void method1() {
		
		int a=10;
		int b=25;
		
		//��Һ񱳿�����
		System.out.println("a>b: "+(a>b)); //false
		//�񱳿��꺸�� ��������� �켱������ �� ���� ������
		// (a>b) �� ��ȣ�� ��� �켱������ ������� �Ѵ�.
		
		System.out.println("a<=b: "+(a<=b)); //true
		
		//����� ������
		boolean result1 = (a==b); //�������� ���� ()�� ������
		System.out.println("result1: "+result1);
		
		boolean result2= (a!=b);
		System.out.println("result2: "+result2);
		
		//������� + �񱳿���
		boolean result3 = 3+5<1;
		System.out.println("result3: "+result3);
		
		/*
		 * ¦��, Ȧ��
		 * ¦��: 2�� �������� �� ������ �������� ��=>������ ���� 0�̴�.
		 * Ȧ��: 2�� �������� �� ������ �������� �ʴ� �� =>������ ���� 1�̴�.
		 * => � ���� 2�� �������� �� ������ �� 0,1�� ���� ¦��/Ȧ������ �Ǻ� ����
		 *
		 */
		System.out.println("a�� ¦���Դϱ�? "+(a%2==0));
		System.out.println("b�� ¦���Դϱ�? "+(b%2==0));
		//2�� �������� �� �������� 0�̶�� ¦��, 1�̶�� Ȧ��
		
		//�ٸ��� ǥ���� ���̽�
		System.out.println("a�� Ȧ���Դϱ�? "+(a%2==1));
		System.out.println("a�� ¦���� �ƴմϱ�? "+((a%2)!=0));
	
		System.out.println("a�� Ȧ���� �ƴմϱ�? "+((a%2)!=1));
	
		}
	
	public void method2() {
		
		//1. ����ڷκ��� ��(����)�� �Է¹���
		Scanner sc=new Scanner(System.in);
		//�Է���������
		System.out.println("������ �Ѱ� �Է�:");
		int num=sc.nextInt();
		sc.nextLine();
				
		//2. �� �ش� ���� ����Դϱ�?
		System.out.println("����ڰ� �Է��� ���� ����Դϱ�?"+(num>0));
		//3. �� �ش� ���� ¦���Դϱ�?
		System.out.println("����ڰ� �Է��� ���� ¦���Դϱ�?"+((num%2)!=1)); //==0
	
	}
	
}
