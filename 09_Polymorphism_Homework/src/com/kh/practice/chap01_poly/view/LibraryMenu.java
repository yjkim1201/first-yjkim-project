package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	LibraryController lc=new LibraryController();
	Scanner sc=new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.println("=====도서대여 프로그램=====");
		System.out.println("이름 입력: ");
		String name=sc.nextLine();
		
		System.out.println("나이 입력: ");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별 입력: ");
		char gender=sc.nextLine().charAt(0);
		
		Member mem=new Member(name, age, gender);//입력받은 후 Member 객체 생성
		lc.insertMember(mem);
		
		while(true) {
		System.out.println("====메뉴====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.println("메뉴 번호:");
		int num=sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			
			Member member=lc.myInfo();
			System.out.println(member);
			break;
			
		case 2:
			selectAll();
			break;
			
		case 3:
			searchBook();
			break;
		
		case 4:
			rentBook();
			break;
			
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
			}
		}
	}
	public void selectAll() {
		//LibraryController의 selectAll()메소드를 호출하여 결과 값 Book[] 자료형 bList에 담기
		//for문 이용하여 bList의 모든 도서 목록 출력
		//단 i를 이용하여 인덱스도 같이 출력=> 대여할 때 도서번호 알기 위해
		//ex) 0번도서: 백종원의 집밥/백종원/tvN/true
		
		Book[] bList=lc.selectAll();
		
		int index=0;
		for(int i=0; i<bList.length; i++) {
			System.out.println((index+1)+"번째 도서: "+bList[i]);
				index++;
		}
	}
	
	public void searchBook() {
		
		System.out.println("검색할 제목 키워드 : ");
		String keyword=sc.nextLine();//키워드 입력받은 후 searchBook()에 전달
		Book[] searchList=lc.searchBook(keyword);//결과 값을 담아 목록 출력
		
		for(int i=0; i<searchList.length;i++) {
			if(searchList[i] != null) {
				System.out.println(searchList[i]);
		}
	}
}	
	public void rentBook() {
		
		//도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll()메소드 호출
		selectAll();
		
		System.out.println("대여할 도서 번호 선택: ");
		int index=sc.nextInt();
		sc.nextLine();
		
		int result=lc.rentBook(index);
		
		if(result==0) {
			System.out.println("성공적으로 대여되었습니다.");
		}
		else if(result==1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}
		else if(result==2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
	
}
