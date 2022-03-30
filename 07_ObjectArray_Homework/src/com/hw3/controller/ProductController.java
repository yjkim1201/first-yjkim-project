package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product[] pd=new Product[10];  //null
	
	public int count=0;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void mainMenu() {
		
		System.out.println("=====제품 관리 메뉴=====");
		
 	do {
		System.out.println(" 1. 제품 정보 추가  \n 2. 제품 전체 조회 \n 9. 프로그램 종료");
		System.out.print("원하는 메뉴 번호를 입력하세요: ");
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
		
		System.out.println("=====도서 정보 입력=====");
		
		for(int i=0; i<1; i++) {
						
		System.out.println("제품 번호: ");
		int num=sc.nextInt();
		sc.nextLine();
		
		System.out.println("제품명: ");
		String name=sc.nextLine();
		
		System.out.println("제품 가격: ");
		int price=sc.nextInt();
		sc.nextLine();
		
		System.out.println("제품 세금: ");
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
