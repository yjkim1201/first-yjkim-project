package com.hw1.model.vo;

//�θ�Ŭ����
public class Person {

	//�ʵ��
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	//�����ں�
	public Person() {
		
	}
	public Person(int age, double height, double weight) {
		
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	
	//�޼ҵ��
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String information() {
		return "Person : name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight ;
	}
	
	
	
	
}