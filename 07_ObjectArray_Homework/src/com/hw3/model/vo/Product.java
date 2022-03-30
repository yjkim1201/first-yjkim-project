package com.hw3.model.vo;

public class Product {

	//鞘靛何
	private int pld;
	private String pName;
	private int price;
	private double tax;
	
	
	//积己磊何
	public Product() {
		
	}
	public Product(int pld, String pName, int price, double tax) {
		this.pld=pld;
		this.pName=pName;
		this.price=price;
		this.tax=tax;
		
	}
	
	//皋家靛何
	public void setPld(int pld) {
		this.pld=pld;
	}
	public void setpName(String pName) {
		this.pName=pName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setTax(double tax) {
		this.tax=tax;
	}
	
	public int getPld() {
		return pld;
	}
	public String getpName(){
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
	public String information() {
		return pld+" "+pName+" "+price+" "+tax;
	}
}
