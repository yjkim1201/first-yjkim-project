package com.kh.variable;

public class A_Variable {

 // �ñް� �ٹ��ð��� �ٹ��ϼ��� ���ؼ� ������ ����Ͽ� ����ϴ� �޼ҵ�
	public void printSalary() {
		
		System.out.println("===== ���� ��� �� ====="); //�굵 ��� �޼ҵ���
		
		// ��� �� �ʿ��� ������(�ñ� ����, �ٹ��ð� ��ð�����, �ٹ��ϼ� �Ѵ޿� ��������)
	   System.out.println("�ñ�:9160��");
	   System.out.println("�ٹ��ð�:6�ð�");
	   System.out.println("�ٹ��ϼ�:15��");
	   
	   //2022�� 2�� 9�� ���� ���� ����
	   // ���� = �ñ�x�ٹ��ð�x�ٹ��ϼ� 
	   // �谩��: 000000�� �������� ���
	   // 1. �ڹٿ��� ���� ������ *�� ǥ���Ѵ�.
	   // 2. �ڹٿ��� ���ڿ��� ""�� ��� ǥ���ϰ�, ���ڴ� �׳� ǥ���ϸ� �ȴ�.
	   // 3. �ڹٿ��� ���� �ٸ� ������ ���� ������ ���̾� ���̰� ���� ��쿡�� + ��ȣ�� ����.
	   System.out.println("���μ�: "+9160*6*15+" ��");
	   // ���⼭ ���ϴ� ����? ���� ����� 824,400��
	   
	   System.out.println("�赿��: "+9160*6*15+" ��");
	   
	   System.out.println("������: "+9160*6*15+" ��");
	   
	   System.out.println("���Ѽ�: "+9160*6*15+" ��");
	   
	   System.out.println("������: "+9160*6*15+" ��");
	   
	   // ������ ����غ���
	   System.out.println(); //�ٹٲ޸� �̷����
	   //System.out.print("\n"); //���� ����
	   
	   System.out.println("=====���� ��� ��======");
	   //������� ������ �����ϰ� ���� �����غ���
	   //�Ʒ� ������ printSalary �޼ҵ� �������� ��� �����ϴ�.
	   int pay=9200; //�ñ��� ��Ƶδ� ����
	   int time=6; //�ٹ��ð��� ��Ƶδ� ����
	   int day=15; //�ٹ��ϼ��� ��Ƶδ� ����
	   
	   //������ �̸��� ���� ����غ���
	   System.out.println("�ñ�: "+pay+" ��");
	   System.out.println("�ٹ��ð�: "+time+" �ð�");
	   System.out.println("�ٹ��ϼ�: "+day+" ��");
	   
	   // ����=�ð�*�ٹ��ð�*�ٹ��ϼ�
	   System.out.println("������: "+pay*time*day+" ��");
	   System.out.println("�ڰ�ȭ: "+pay*time*day+" ��");
	   System.out.println("�ڹα�: "+pay*time*day+" ��");
	   
	   /*
	    * *������ ����ϴ� ����, ������ �ʿ伺
	    * 1. ������ �켱������ ���� �ǹ̸� �ο��� �������� ���(�������� ��������.)
	    * 2. �� �ѹ��� ���� ����ϰ�, �ʿ��� ������ �̸��� �ҷ��� ����� �������� ��(���뼺�� ��������.)
	    * 3. ��������(AS)�� ���� ���� �� �� �ִ�.
	    */
	   	     
	} //printSalary �޼ҵ� ���� ��
	
	//������ ����
	public void declareVariable() {
	
		/*
		 * *������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ Ȯ���صΰڴ�.
		 * =>���� �뷮�� ���� ���ڸ� ����ڴ�.
		 * [ ǥ���� ] �ڷ��� ������;
		 * 
		 * �ڷ���: ������ ũ�� �� ����� �����ϴ� �κ�
		 * ������: ������ �̸��� ���ϴ� �κ�
		 * 
		 * *���� ���� �� ������ ��
		 * 1. �������� �ҹ��ڷ� �����ϰԲ� �̸��� ���� ��(��, ��Ÿ��ǥ����� ��ų ��)
		 * 2. ���� ����({�߰�ȣ ���� ��})�ȿ����� ������ ���������� ���� �Ұ��ϴ�.(�̸��� �ߺ��� �� ����.)
		 * 3. �ش� ����({ }) �ȿ� ����� ������ �� ���� �ȿ����� ��� �����ϴ�.
		 *    ��, �ٸ� �޼ҵ忡���� ��� �Ұ��ϴ�. =>�������� ����
		 */
		
		//----- �ڷ����� ���� ���� -----
		//1. ����(true/false=>����)
		boolean isTrue; //1byte
		
		//2. ������(������/�Ǽ���)
		//2.1 ������
		byte bNum; //1byte(-128~127)
		short sNum; //2byte
		int iNum; //4byte(-21��xxx~21��xxx)=>������ �ڷ��� �� �⺻ �ڷ���
		long lNum; //8byte		
		
		//2.2 �Ǽ��� : ����� ���� �Ҽ��� �Ʒ��� �� ���� ���ڸ� ǥ���� �� �ִ�.
		float fNum; //4byte => �Ҽ��� �Ʒ� 7�ڸ����� ǥ�� ����
		double dNum; //8byte => �Ҽ��� �Ʒ� 15�ڸ����� ǥ�� ����,�Ǽ��� �ڷ��� �� �⺻ �ڷ���
		             //         �Ҽ����� �� ����� ������ ǥ���� �����ϱ� ������ �⺻ �ڷ����̴�.
		
		//3. ������
		char ch; //2byte
		
		// ----- ��������� �� 8���� �⺻�ڷ��� -----
		
		//4. ���ڿ���(�����ڷ���)
		String str; 
		
		// ----- ������� �� 9���� �ڽ��� ������ ��(�޸��� stack ����) -----
		
		/*
		 * ������ ���� ����(=�ڽ��� ���� ���)
		 * [ ǥ���� ] ������=��;
		 */
		
		isTrue=true;
		bNum=1;
		sNum=2;
		iNum=4;
		lNum=8L; //long���� ����� �˷��ֱ� ���� l �Ǵ� L�� ���� �ڿ� ǥ�����ִ� ��(���� �빮�ڸ� ����)
		
		fNum=4.0f; //�ݵ�� f�� �ٿ���� �Ѵ�.
		dNum=8.0; 
		
		ch='A'; //�ڹٿ��� �������� ���� �ݵ�� ' '(��������ǥ)�� ���� ǥ���Ѵ�.
		str="�ȳ��ϼ���"; //���ڿ��� ��� �ݵ�� " "(�ֵ���ǥ)�� ���� ǥ���Ѵ�.
		
		// ---- �� ������ ��� ���� ��� -----
		System.out.println("isTrue: "+isTrue);
		System.out.println("bNum: "+bNum);
		System.out.println("sNum: "+sNum);
		System.out.println("iNum: "+iNum);
		System.out.println("lNum: "+lNum);
		System.out.println("fNum: "+fNum);
		System.out.println("dNum: "+dNum);
		System.out.println("ch: "+ch);
		System.out.println("str: "+str);
		
	} // declareVariable �޼ҵ� ���� ��
	
	// ���� ����� ���ÿ� ���� = ������ �ʱ�ȭ�Ѵ�.
	public void initVariable() {
		
		/*
		 * ���� ����� ���ÿ� �� ����(=�ʱ�ȭ)
		 * [ ǥ���� ] �ڷ��� ������ = ��;
		 */
		
		//1. ����
		boolean isTrue=3+5<1; //1byte		
		// 3+5<1 : 8�� 1���� �۽��ϱ�? => �ƴϿ�, �� Ů�ϴ�.=>false
		// ������� true �ƴϸ� false ������ ���� �� �ִ� ���ĵ� boolean Ÿ���� ������ ��� �� �ִ�.
		
		//2.1 ������
		byte bNum=1; //1byte
		short sNum=2; //2byte
		int iNum=4; //4byte
		long lNum=8L; //8byte
		
		//2.2 �Ǽ���
		float fNum=4.0f; //4byte
		double dNum=8.0; //8byte
		
		//3. ������
		char ch='��'; //2byte
		
		//4. ���ڿ���(�����ڷ���)
		String str="�ڹ� ���� ��";
		
		// �� ������ ��� �� ���
		System.out.println("isTrue: "+isTrue);
		System.out.println("bNum: "+bNum);
		System.out.println("sNum: "+sNum);
		System.out.println("iNum: "+iNum);
		System.out.println("lNum: "+lNum);
		System.out.println("fNum: "+fNum);
		System.out.println("dNum: "+dNum);
		System.out.println("ch: "+ch);
		System.out.println("str: "+str);
		
	} // initVariable �޼ҵ� ���� ��
	
	  // ���(constant)
	public void constant() {
		// ������ ����
		int age = 20; //���� ����� ���ÿ� ����
		System.out.println("age: "+age);
		
		// ������ Ư¡: ���� �ٲ� �� �ִ�.
		age=25; //����
		
		System.out.println("����� age: "+age);
		/*
		 * ���: ������ �ʴ� ��
		 *      �ѹ� ��ϵ� ���� ���� �Ұ��ϴ�.
		 *      =>�׻� �������� ���� ����� �� ���
		 *      ex) ����: ������
		 *   
		 * ��� ���� �� ������ ��
		 * 1. final�̶�� Ű���带 �ٿ��� ����
		 * 2. ������� �׻� �빮�ڷ� ���
		 * [ ǥ���� ] final �ڷ��� �����=��;
		 */
		
		final int AGE=20;
		System.out.println("��� AGE: "+AGE);
		//�̹� ���� ���ԵǾ� �ִ� ���¿��� ����� ���ο�  ���� ����
		//AGE=25;
		//The final local variable AGE cannot be assigned
		//final�̶�� Ű���尡 ���� ���������� AGE�� ���Դ��� �� ����.
		// =>����� �̹� ���� ������ ���, ���� ��ü�� �ȵ�
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
