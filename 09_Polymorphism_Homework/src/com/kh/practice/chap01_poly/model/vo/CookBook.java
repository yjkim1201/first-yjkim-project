package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {

	//�ʵ��
	private boolean coupon; //�丮 �п� ���� ����
	
	//�����ں�
	public CookBook() {
		
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	//�޼ҵ��

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
