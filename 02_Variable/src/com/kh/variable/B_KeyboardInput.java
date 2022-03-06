package com.kh.variable;

import java.util.Scanner;
//����ڰ� Ű����� �Է��� ���� ������ ����ϴ� ���
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * * Scanner Ŭ����
		 * �ڹٿ��� �̹� �����ϰ� �ִ� java.util.Scanner�� �̿��ؾ� ��
		 * Scanner Ŭ���� �ȿ� �ۼ��Ǿ��ִ� �޼ҵ���� ȣ���ؼ� ���
		 * 
		 */
		
		// 1. �ٸ� ��Ű��, �ٸ� Ŭ������ �޼ҵ带 ȣ���� ��쿡�� �뺯�� �̸��� ���� ����(new)�ؾ� �Ѵ�.
		// 2. import �� �߰�
		// import java.util.Scanner;
		Scanner sc = new Scanner(System.in);
		// System.in : Ű����� �Է¹��� ���� byte ������ �޾Ƶ��̰ڴ�.��� �ǹ�
		// ����) ��� �ÿ��� System.out ������ ���
		
		//������� ��������(�̸�, ����, Ű) �Է¹޴� ���α׷�
		//�Է� �ް��� �ϴ� ������ ���� ����ؼ� ����ڷκ��� �Է��� ����
		System.out.print("����� �̸��� �����Դϱ�?: ");
		
		//����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�: next(), nextLine()
		//������� �̸��� �Է¹޾Ƽ� ������ ���ÿ� ���ʹ�!
		//String name = sc.next(); 
		//next(): ����ڰ� ����Ű�� ���� ������ �ϴ� ����Ѵ�.(next �迭�� ��� �޼ҵ��� ���� Ư¡)
		//        ����ڰ� �Է��� �� �� ������ ���� ��� ���� ���������� �Է¹޴´�.
		
		//nextLine() �޼ҵ带 ȣ��
		//sc.nextLine(); //�Է¸� �ް� ��
		String name = sc.nextLine(); //�Է� �ް�, ������ ���ÿ� ��´�
		//nextLine(): ���� ���� ������ ����Ѵ�.
		//            ����ڰ� �Է��� �� �߿��� ����Ű�� ġ�� ������ ���鿡 �����ϰ� �� �ٿ� ��� ��� ���ڿ��� �Է¹޴´�.      
		//            Ư�� ����ڰ� �Է��� �� ��, ������ ���Ե� ������ ���� ��� ����(��ǥ���� ��: �ּ�)
		//System.out.println(name);
		
		//���� �Է¹ޱ�
		System.out.print("����� ���̴� ����Դϱ�?: ");
		
		//����ڰ� �Է��� ���� int �� ������ �޾Ƶ��̴� �޼ҵ�: nextInt()
		//sc.nextInt(); // �� �Է¸� �ް� ��
		int age = sc.nextInt(); 
		//**���ǻ���: nextInt() �޼ҵ� ȣ�� �� '�ݵ��' nextLine() �޼ҵ带 �ѹ� ������ ��!
		
		sc.nextLine(); //���� ������ �����ִ� ���͸� ����� ���͸� ģ ȿ���� ��
		//nextInt()�� nextLine()�� ����ǰ� �ۼ��Ǿ� ���� ���
		//����(�ӽ� �����)�� �����ִ� ���Ͱ�(\n, ���๮��) ����ڰ� �ڵ����� �Է��ߴٰ� �����Ͽ�
		//��ٷ� �޸𸮷� ����ȴ�. (��, ������ ����.)
		
		//Ű �Է¹ޱ�
		
		//����ڰ� �Է��� ���� �Ǽ��� double ���·� �޾Ƶ��̴� �޼ҵ�: nextDouble()
		System.out.print("����� Ű�� ��cm�Դϱ�?: ");
		//sc.nextDouble(); //�� �Է¸� �ް� ��
		double height = sc.nextDouble();
		
		sc.nextLine(); //���ۿ� �����ִ� ���Ͱ��� ����ֱ� ���� ����
		
		//���ݱ��� �Է¹��� ������ �Է¹��� ���� name, age, height��� ������ ������
		System.out.println("Ű"+height+"cm, "+"����"+age+"��, "+"�̸�"+name+"�� �ȳ��ϼ���~^^");
		
		/*
		 * Scanner Ŭ���� ���� �Է� �޴� �޼ҵ� ������
		 * 1. next(): ���ڿ��� ���� ��(��, ���� ������)
		 * 2. nextLine(): ���ڿ��� ���� ��(���� �����ؼ�)
		 * 3. nextInt(): int Ÿ���� �������� ���� ��
		 * 4. nextByte(): byte Ÿ���� �������� ���� ��
		 * 5. nextShort(): short Ÿ���� �������� ���� ��
		 * 6. nextLong(): long Ÿ���� �������� ���� ��
		 * 7. nextDouble(): double Ÿ���� �Ǽ����� ���� ��
		 * 8. nextFloat(): float Ÿ���� �Ǽ����� ���� ��
		 *  
		 *  =>� Ÿ���� ���� ������ �� �ľ��ؼ� ��Ȳ�� �´� �޼ҵ带 ȣ���ؼ� ���� ��.
		 */
		
	} //inputTest1 �޼ҵ� ���� ��
	
	  //�׷��� ���� 1���� �Է¹ް��� �Ѵٸ�?
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in); //��ĳ�� Ŭ���� �뺯�� ���� ����(new)
		//���ڿ��� ���� ���� next() �Ǵ� nextLine()
		//���ڸ� ���� ���� nextChar()�� �������� ����
		
		//����ڷκ��� ��������(�̸�, ����, ����, Ű)�� Ű����� �Է¹޾� ����ϴ� ���α׷�
		//���� �Է� ����: ����(Male) / ����(Female)
		
		System.out.print("�̸�: ");
		String name =sc.nextLine();
		
		System.out.print("����: ");
		int age=sc.nextInt();
		sc.nextLine(); //���۸� �����=����Ű ������
		
		System.out.print("����(M/F): ");
		char gender=sc.nextLine().charAt(0);
		//���� ���ڿ��� �Է¹��� ��, �� ���ڿ��� 0��° ���ڸ� ����
		
		// ! ���ǻ���: ���࿡ ���� �̰��� �ϴ� ��ġ���� ���ڿ��� ũ�⺸�� ũ�ٸ�?
		// StringIndexOutOfBoundsException: String index out of range: 10
		// =>���ڿ� �ε��� ������ ����� �� �߻��ϴ� ����
		// =>���� �Է��� Male�� �� 4�����ε�, 10��° index ���ڸ� �����Ϸ��ؼ� �߻��� ����
		
		/*
		 * ���ڿ��� ���� ���ڵ��� �����̱� ������, 
		 * �ϴ� ���ڿ��� �Է¹��� �� ù��° ���� �ϳ��� �̾Ƴ��ڴ�.
		 * 
		 * "apple" �̶� ���ڿ� => �ε���(index) ����: ��ǻ�ʹ� ���ڸ� 0���� ��
		 * 1��° ���ڴ� a => 0��° ����
		 * 2��° ���ڴ� p => 1��° ����
		 * 3��° ���ڴ� p => 2��° ����
		 * 4��° ���ڴ� l => 3��° ����
		 * 5��° ���ڴ� e => 4��° ����
		 * 
		 * *���ڿ��κ��� �ش� ��ġ��(index) ���� �ϳ��� �̾Ƴ��ִ� �޼ҵ�
		 * => �ش繮�ڿ�.charAt(�����̰����ϴ���ġ��) �޼ҵ�
		 * 
		 * 1. �ϴ� Ű����� �Է� �޴´�.=>nextLine()
		 * 2. �Է� ���� ���ڿ��κ��� charAt �޼ҵ带 ����
		 * => �� �ܰ��(���ٷ�) ǥ���غ���
		 *    sc.nextLine().charAt(0)	
		 */
			
		System.out.print("Ű: ");
		double height=sc.nextDouble();
		
		sc.nextLine();
		
		//����غ���
		System.out.println(name+"���� ��������");
		System.out.println("����: "+gender);
		System.out.println("����: "+age);
		System.out.println("Ű: "+height);
		
	} //inputTest2 �޼ҵ� ���� ��
	
	//����) ���࿡ nextInt ������ nextLine���� ���۸� ����� ���� ���
	public void inputTest3() {
		//����ڷκ��� ���������� �Է¹޴� ��(�̸�, ����, �ּ�)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		
		System.out.print("����: ");
		int age=sc.nextInt();
		
		sc.nextLine();
		//������ �� �ڸ��� nextLine()�޼ҵ尡 ȣ��Ǿ�� ��=>���� ����ֱ� ���ؼ�
		//***�� ���̽��� nextInt�� �̿��ؼ� ���ڰ��� ���� �� nextLine�� �̿��� ���ڿ��� �ް����� �� �߻�
		
		System.out.print("�ּ�: ");
		String address=sc.nextLine(); //�ּ�: ����� ������ ������=>nextLine()
		
		//���� ������ ���� ������ ���
		//000�� ��� 00�� 000�� ȯ���մϴ�.
	    System.out.println(address+"�� ���"+age+"�� "+name+"�� ȯ���մϴ�.");
	    
		
	}
	
	
	
	
}
