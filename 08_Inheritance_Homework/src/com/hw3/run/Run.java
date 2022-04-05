package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
	
		Product pd1=new Product("Samsung","Galaxy S9","Blue", 960000);
		Product pd2=new Product("LG","G6", "Red",820000);
		
		System.out.println("������ ù ��° ��ü�� ��: "+pd1.toString());
		System.out.println("������ �� ��° ��ü�� ��: "+pd2.toString());
		System.out.println("=====================================");
		
		boolean answer=pd1.equals(pd2);
		System.out.println("������ �� ��ü�� ���� ������: "+answer);
		System.out.println("=====================================");
		
		
		System.out.println("ù ��° ��ü�� �ؽ��ڵ尪: "+pd1.hashCode());
		System.out.println("�� ��° ��ü�� �ؽ��ڵ尪: "+pd2.hashCode());
		
		System.out.println("=====================================");
		
		Product pd3=new Product("Samsung","Galaxy S9","Blue", 960000);
		System.out.println("������ �� ��° ��ü�� �� :"+pd3.toString());
		
		System.out.println("=====================================");
		
		boolean answer2=(pd1.equals(pd3));
		boolean answer3=(pd1.hashCode()==pd3.hashCode());
		
		System.out.println("ù ��° ��ü�� �� ��° ��ü�� �ʵ尪���� ��ġ�ϴ°�: "+answer2);
		System.out.println("ù ��° ��ü�� �� ��° ��ü�� �ؽ��ڵ尪�� ��ġ�ϴ°�: "+answer3);
	}

}
