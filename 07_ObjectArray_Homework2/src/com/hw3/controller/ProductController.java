package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

//사용자로부터 제품 정보를 입력받고, 메뉴 선택하면 선택한 메뉴를 수행하는 코드 작성
public class ProductController {

	Scanner sc=new Scanner(System.in);
	private Product[] pro=new Product[10];
	
	int count=0;
	
	public void mainMenu() {
		
		do {
		System.out.println("====제품관리메뉴====");
		System.out.println("1. 제품 정보 추가");
		
		System.out.println("2. 제품 전체 조회");
		
		System.out.println("3. 제품 정보 삭제");
		
		System.out.println("9. 프로그램 종료");
		
		System.out.println("메뉴 번호를 입력하세요: ");
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
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		}
			while(true);
	}
	
	public void productInput() {
		System.out.println("도서 정보 입력 ");
		
		System.out.println("제품 번호  입력:");
		int name=sc.nextInt();
		sc.nextLine();
		
		System.out.println("제품명 입력: ");
		String pName=sc.nextLine();
		
		System.out.println("제품 가격 입력: ");
		int price=sc.nextInt();
		sc.nextLine();
		
		System.out.println("제품 세금 입력: ");
		double tax=sc.nextDouble();
		sc.nextLine();
				
		pro[count]=new Product(name, pName, price, tax);
		count++;
		
	}
	
	public void productPrint() {
		
		for(int i=0; i<count; i++) {
			System.out.println(pro[i].information());
		}
		System.out.println("제품 정보를 모두 출력하였습니다.");
	}
	
	public void productDelete() {
		
		System.out.println("제품명 입력: ");
		String pName=sc.nextLine();
		
		for(int i=0; i<count; i++) {
			if(pName.equals(pro[i].getpName())) {
				pro[i]=null;
				count--;
		}
			System.out.println("입력하신 제품 정보를 삭제하였습니다.");
		}
		
	}
	
	
}
