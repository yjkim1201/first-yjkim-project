package com.kh.variable;

public class D_Printf {

	/*
	 * *��¹� ����
	 * 1.System.out.println(����Ϸ��� ��);=>���� ��� �Ŀ� �ٹٲ����ִ� ����
	 * 2.System.out.print(����Ϸ��� ��);  =>���� ��¸� �ϴ� ����(�ٹٲ�x)
	 *  
	 * [ ǥ���� ] 
	 * System.out.printf("����ϰ��� �ϴ� ����", ����Ϸ��� ��);
	 * => f�� format(����)�� �ǹ�
	 * => ���Ŀ� �°� ������ ��µǰ�, �ٹٲ��� �Ͼ�� ����
	 * => ���ڿ� �ȿ� �� ������ �� �ڸ��� ������ ���� �������� ������ �Ѵ�.
	 * 
	 * ����
	 * %d: ������ �� �ڸ�
	 * %f: �Ǽ��� �� �ڸ�
	 * %c: ���ڰ� �� �ڸ�
	 * %s: ���ڿ��� �� �ڸ�
	 */  
	public void printfTest() {
		
		// ���� �׽�Ʈ(%d)
		int iNum1=10;
		int iNum2=20;
		
		// iNum1: xx,iNum2: xx �̷� �������� ��� 
		//1. println ���
		System.out.println("iNum1: "+iNum1+",iNum2: "+iNum2);
		
		//2. printf ���
		System.out.printf("iNum1: %d, iNum2: %d \n", iNum1, iNum2);
		//�������̹Ƿ� %d��� �������� �ڸ��� ����ش�.
		//��, printf�� �ٹٲ� ����� ���� ������  ���๮�� \n�� �߰��ؼ� �ٹٲ��ؾ� �Ѵ�.
		
		//10+20=30�� ����غ���
		//1. println ���
		System.out.println(iNum1+"+"+iNum2+"="+(iNum1+iNum2));
		
		//2. printf ���
		System.out.printf("%d+%d=%d \n",iNum1, iNum2,(iNum1+iNum2));
		
		//�Բ� ����� �� �ִ� �ɼ�
		System.out.printf("%5d \n", iNum1);  //%5d: 5ĭ�� ���� �� ������ ����
		System.out.printf("%-5d \n", iNum2); //%-5d: 5ĭ�� ���� �� ���� ����(����)
		System.out.printf("%5d \n", 100);
		
		//2. �Ǽ� �׽�Ʈ(%f)
		double dNum = 4.27546789;
		System.out.printf("dNum: %f \n", dNum); //dNum: 4.275468
		//%f: �Ҽ��� �Ʒ� 7��° �ٿ��� �ݿø��� �Ǿ� �Ҽ��� �Ʒ� 6��°������ ����� �ȴ�.
		
		System.out.printf("dNum: %.1f \n", dNum); //dNum: 4.3 
		// %.1f: �Ҽ��� �Ʒ� 2��° �ٿ��� �ݿø��Ǿ� �Ҽ��� �Ʒ� 1��°������ ����� �ȴ�.
		
		// ���ڿ� ���ڿ� �׽�Ʈ(%c, %s)
		char ch = 'a';
		String str="Hello";
		
		System.out.printf("%c\t%s \n", ch, str); //a Hello
			// \t : tab Ű�� ���� �Ͱ� �����ϰ� �鿩�����
		    // \n : enterŰ�� �ѹ� ���� ȿ��
		
		    // �ɼ�!
		System.out.printf("%C %S", ch, str); //���� ���ĺ��� ��� �빮�ڷ� ���
		
		/*
		 * printf : ���� �� �ѹ� ���÷� �����ϰ� ��� �����ϴ�.
		 *          ��, ������ ������ ������ ����, �ڿ� ���� ������ ������ ������ ��Ȯ�� �¾ƾ� �Ѵ�.
		 */
		
		
	}
	
	
	
}
