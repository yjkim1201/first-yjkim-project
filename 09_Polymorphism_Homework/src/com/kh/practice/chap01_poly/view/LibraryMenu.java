package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	LibraryController lc=new LibraryController();
	Scanner sc=new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.println("=====�����뿩 ���α׷�=====");
		System.out.println("�̸� �Է�: ");
		String name=sc.nextLine();
		
		System.out.println("���� �Է�: ");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� �Է�: ");
		char gender=sc.nextLine().charAt(0);
		
		Member mem=new Member(name, age, gender);//�Է¹��� �� Member ��ü ����
		lc.insertMember(mem);
		
		while(true) {
		System.out.println("====�޴�====");
		System.out.println("1. ����������");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� �뿩�ϱ�");
		System.out.println("9. ���α׷� �����ϱ�");
		System.out.println("�޴� ��ȣ:");
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
			System.out.println("���α׷��� �����մϴ�.");
			return;
			}
		}
	}
	public void selectAll() {
		//LibraryController�� selectAll()�޼ҵ带 ȣ���Ͽ� ��� �� Book[] �ڷ��� bList�� ���
		//for�� �̿��Ͽ� bList�� ��� ���� ��� ���
		//�� i�� �̿��Ͽ� �ε����� ���� ���=> �뿩�� �� ������ȣ �˱� ����
		//ex) 0������: �������� ����/������/tvN/true
		
		Book[] bList=lc.selectAll();
		
		int index=0;
		for(int i=0; i<bList.length; i++) {
			System.out.println((index+1)+"��° ����: "+bList[i]);
				index++;
		}
	}
	
	public void searchBook() {
		
		System.out.println("�˻��� ���� Ű���� : ");
		String keyword=sc.nextLine();//Ű���� �Է¹��� �� searchBook()�� ����
		Book[] searchList=lc.searchBook(keyword);//��� ���� ��� ��� ���
		
		for(int i=0; i<searchList.length;i++) {
			if(searchList[i] != null) {
				System.out.println(searchList[i]);
		}
	}
}	
	public void rentBook() {
		
		//�����뿩�� ���� ������ȣ�� �˾ƾ� �ϱ� ������ selectAll()�޼ҵ� ȣ��
		selectAll();
		
		System.out.println("�뿩�� ���� ��ȣ ����: ");
		int index=sc.nextInt();
		sc.nextLine();
		
		int result=lc.rentBook(index);
		
		if(result==0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}
		else if(result==1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		}
		else if(result==2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}
	
}
