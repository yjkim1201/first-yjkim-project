package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

//����ڷκ��� ��ǰ ������ �Է¹ް�, �޴� �����ϸ� ������ �޴��� �����ϴ� �ڵ� �ۼ�
public class ProductController {

	Scanner sc=new Scanner(System.in);
	private Product[] pro=new Product[10];
	
	int count=0;
	
	public void mainMenu() {
		
		do {
		System.out.println("====��ǰ�����޴�====");
		System.out.println("1. ��ǰ ���� �߰�");
		
		System.out.println("2. ��ǰ ��ü ��ȸ");
		
		System.out.println("3. ��ǰ ���� ����");
		
		System.out.println("9. ���α׷� ����");
		
		System.out.println("�޴� ��ȣ�� �Է��ϼ���: ");
		int answer=sc.nextInt();
		sc.nextLine();
		
		switch(answer) {
		case 1:
			productInput();
			break;
			
		case 2:
			productPrint();
			break;
			
		case 3:
			productDelete();
			break;
			
		case 9:
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		}
			while(true);
	}
	
	public void productInput() {
		System.out.println("���� ���� �Է� ");
		
		System.out.println("��ǰ ��ȣ  �Է�:");
		int name=sc.nextInt();
		sc.nextLine();
		
		System.out.println("��ǰ�� �Է�: ");
		String pName=sc.nextLine();
		
		System.out.println("��ǰ ���� �Է�: ");
		int price=sc.nextInt();
		sc.nextLine();
		
		System.out.println("��ǰ ���� �Է�: ");
		double tax=sc.nextDouble();
		sc.nextLine();
				
		pro[count]=new Product(name, pName, price, tax);
		count++;
		
	}
	
	public void productPrint() {
		
		for(int i=0; i<count; i++) {
			System.out.println(pro[i].information());
		}
		System.out.println("��ǰ ������ ��� ����Ͽ����ϴ�.");
	}
	
	public void productDelete() {
		
		System.out.println("��ǰ�� �Է�: ");
		String pName=sc.nextLine();
		
		for(int i=0; i<count; i++) {
			if(pName.equals(pro[i].getpName())) {
				pro[i]=null;
				count--;
		}
			System.out.println("�Է��Ͻ� ��ǰ ������ �����Ͽ����ϴ�.");
		}
		
	}
	
	
}
