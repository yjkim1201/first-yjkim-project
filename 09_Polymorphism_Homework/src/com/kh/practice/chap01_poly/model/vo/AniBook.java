package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {

	//필드부
	private int accessAge; //제한 나이

	//생성자부
	public AniBook() {
		super();
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		
		super(title, author, publisher);
		this.accessAge=accessAge;
	}

	//메소드부
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBook [title="+super.getTitle()+", author="+super.getAuthor()+"publisher="+super.getPublisher()+
				", accessAge=" + accessAge + "]";
	}
	
	
	
}
