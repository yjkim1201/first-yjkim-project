package com.kh.operator;
import java.util.Scanner;

public class G_Triple {

	/*
	 * *���׿�����
	 * 3���� �׸��� ������ �����ϴ� ������
	 * 
	 * [ ǥ���� ] ���ǽ� ? ���ǽ��� ����� true�� ��� �����: ����� false�� ��� �����
	 * 
	 * =>��, ���ǽ��� ����� true �ƴϸ� false�� ����
	 * (���ǽ�: ������ �Ǻ��ϴ� ��, ����� true �ƴϸ� false�� ���� �� �ִ� ��� ��)
	 * =>�ַ� true �ƴϸ� false�� ����� ���� �� �ִ� �����ڵ��� ����: **������������, �񱳿�����, �������� 
	 * 
	 */
	
	public void method1() {
		
		//����ڰ� �Է��� �������� ������� �ƴ��� �Ǻ� �Ŀ� �׿� �´� ����� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int num=sc.nextInt();
	
		//������� String�̱� ������ String ������ �����Ͽ� ����
		String result= (num>0)? "����Դϴ�.": "����� �ƴմϴ�.";

	    System.out.println(num+"�� "+result);
	    
	}
	
	
	public void method2() {
		
		//����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ������ ����� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("�������Է�: ");
		int num=sc.nextInt();
		
		//(���ǽ�)? true�� ���: false�� ���
		//(num%2)==0 =>¦��
		//String result= ((num%2)==0)? "¦���Դϴ�.": "Ȧ���Դϴ�.";
		
		//(num%2)==1 =>Ȧ��
		String result=(num%2)==1 ? "Ȧ���Դϴ�.":"¦���Դϴ�.";
		
		
		//System.out.println(num+"�� "+result);
		System.out.printf("%d�� %s", num, result);
		
	}
	
	public void method3() {
		
		//����ڷκ��� �Է¹��� ������ �ϳ��� �빮������, �빮�ڰ� �ƴ��� �Ǻ� �� ���
		//=> �ƽ�Ű�ڵ带 Ȱ�� ('A' = 65, 'a' = 97)
		//=> �ڵ�����ȯ Ư�����̽� 4�� ����!
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �� ���� �Է�: ");
		char ch=sc.nextLine().charAt(0);
		
		//�ش� ���ڰ� �빮�� ������ �ִ��� üũ (65 <=�ش� ������ �ڵ�<=90)
		//String result=((ch>=65)&&(ch<=90))? "�빮��": "�빮�� �ƴ�";
		String result=((ch>='A')&&(ch<='Z'))? "�빮��" : "�빮�� �ƴ�"; //�ڵ� ����ȯ�Ǳ� ������ �׳� ���ڷ� �ٷ� �Է��ص� ��
		
		
		System.out.printf("%c�� %s.", ch, result);
		
	}
	public void method4() {
		
		/*
		 * ���� method1 �� ������ �����Ͽ� 
		 * ����ڰ� �Է��� �������� �������, 0����, �������� �Ǻ� ��
		 * �׿� �´� ����� ����ϱ�
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int num=sc.nextInt();
		
		String result=(num>0) ? "����Դϴ�.": ((num==0)? "0�Դϴ�.": "�����Դϴ�.") ;
		System.out.println(result);
	
		//���� �����ڸ� ��ø ��� ��, ǥ�� ������ ����� ���� �� �ø� �� �ִ�.
	}
	
	
	
}	

