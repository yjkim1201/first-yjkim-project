package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member mem=null;	//null�� ��� �ʱ�ȭ
	private Book[] bList=new Book[5]; //ũ�� 5 �Ҵ�
	
	{
	bList[0]=new CookBook("�������� ����", "������","tvN",true);
	bList[1]=new AniBook("�ѹ� �� �ؿ�","��Ƽ","�����",19);
	bList[2]=new AniBook("������ ���ǽ�","����","japan",12);
	bList[3]=new CookBook("�������� �󸶳� ���ְԿ�","������","����",false);
	bList[4]=new CookBook("������ �� �����غ�","������","�ұ�å",true);
	
	}
	
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] searchList=new Book[5];
		int count=0;
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)==true) {
				searchList[i]=bList[i];
				
				count++;
			}
			
		}
		
		return searchList;
	}
	
	public int rentBook(int index) {
		
		int coupon=mem.getCouponCount();
		int result=0;
		
		//���޹��� index�� bList�� �����ϴ� �ڽ� Ŭ������ AniBook�� ��� 
		if(bList[index] instanceof AniBook) {
			
		    //��ü�� ��ȭå�� �����ϰ�, ��ȭå ���� ���̿� ȸ�� ���̸� ���Ͽ� ȸ�� ���̰� ������ result�� 1�� �ʱ�ȭ
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result=1;
			}
		}
		//���޹��� index�� bList�� �����ϴ� �ڽ� Ŭ������ CookBook�� ���
		if(bList[index] instanceof CookBook) {
			
			//��ü�� �丮å�� �����ϰ�, ���������� "��"�� ���
			if(((CookBook)bList[index]).isCoupon()==true) {
				coupon++;
				mem.setCouponCount(coupon);
				result=2;
			}
		}
		return result;
	}
			
}
