package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {

	//필드부
	private boolean coupon; //요리 학원 쿠폰 유무
	
	//생성자부
	public CookBook() {
		
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	//메소드부

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [ title="+super.getTitle()+", author="+super.getAuthor()+", publisher="+super.getPublisher()+
				", coupon=" + coupon + "]";
	}
	
	
	
}
