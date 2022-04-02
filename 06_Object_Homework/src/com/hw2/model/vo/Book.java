package com.hw2.model.vo;

public class Book {
//필드부
	
	private String title;  //책제목
	private int price;     //가격
	private double discountRate;   //할인율
	private String author;   //작가
	
	//생성자부
	
	public Book() {
		
	}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title=title;
		this.price=price;
		this.discountRate=discountRate;
		this.author=author;
	}
	
	//메소드부
	public void setTitle(String title) {
		this.title=title;
		
	}
	public void setPrice(int price) {	
	this.price=price;
	}
	public void setDiscountRate(double discountRate) {
	this.discountRate=discountRate;
	}
	public void setAuthor(String author) {
	this.author=author;
	}
	
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public String information() {
		return title+" "+price+" "+discountRate+" "+author;
	}
	
	
	
	
	
	
	
}
