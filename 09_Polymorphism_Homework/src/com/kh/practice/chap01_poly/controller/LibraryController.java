package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member mem=null;	//null로 명시 초기화
	private Book[] bList=new Book[5]; //크기 5 할당
	
	{
	bList[0]=new CookBook("백종원의 집밥", "백종원","tvN",true);
	bList[1]=new AniBook("한번 더 해요","미티","원모어",19);
	bList[2]=new AniBook("루피의 원피스","루피","japan",12);
	bList[3]=new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학",false);
	bList[4]=new CookBook("최현석 날 따라해봐","최현석","소금책",true);
	
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
		
		//전달받은 index의 bList가 참조하는 자식 클래스가 AniBook일 경우 
		if(bList[index] instanceof AniBook) {
			
		    //객체가 만화책을 참조하고, 만화책 제한 나이와 회원 나이를 비교하여 회원 나이가 적으면 result를 1로 초기화
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result=1;
			}
		}
		//전달받은 index의 bList가 참조하는 자식 클래스가 CookBook일 경우
		if(bList[index] instanceof CookBook) {
			
			//객체가 요리책을 참조하고, 쿠폰유무가 "유"일 경우
			if(((CookBook)bList[index]).isCoupon()==true) {
				coupon++;
				mem.setCouponCount(coupon);
				result=2;
			}
		}
		return result;
	}
			
}
