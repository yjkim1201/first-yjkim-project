package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pd=new Product[10];  //null
	
	public int count=0;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void mainMenu() {
		
		System.out.println("=====��ǰ ���� �޴�=====");
		
 	do {
		System.out.println(" 1. ��ǰ ���� �߰�  \n 2. ��ǰ ��ü ��ȸ \n 9. ���α׷� ����");
		System.out.print("���ϴ� �޴� ��ȣ�� �Է��ϼ���: ");
		int input=sc.nextInt();
		sc.nextLine();
		if(input==1) {
			productInput();
		}
		if(input==2) {
			productPrint();
		}
		if(input==9) {
			break;
		}	
	} while(true);
 	
	
}
	public void productInput() {
		
		System.out.println("=====���� ���� �Է�=====");
		
		for(int i=0; i<1; i++) {
						
		System.out.println("��ǰ ��ȣ: ");
		int num=sc.nextInt();
		sc.nextLine();
		
		System.out.println("��ǰ��: ");
		String name=sc.nextLine();
		
		System.out.println("��ǰ ����: ");
		int price=sc.nextInt();
		sc.nextLine();
		
		System.out.println("��ǰ ����: ");
		double tax=sc.nextDouble();
		sc.nextLine();
		
		pd[i]=new Product(num, name, price, tax);
		count++;
		
		}
	}
	
	
	public void productPrint() {
		
		for(int i=0; i<count; i++) {
			if(pd[i]!=null) {
		System.out.println(pd[i].information());
			}
			else {
				break;
			}
		}
	}
}
