package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
	
		Product pd1=new Product("Samsung","Galaxy S9","Blue", 960000);
		Product pd2=new Product("LG","G6", "Red",820000);
		
		System.out.println("생성한 첫 번째 객체의 값: "+pd1.toString());
		System.out.println("생성한 두 번째 객체의 값: "+pd2.toString());
		System.out.println("=====================================");
		
		boolean answer=pd1.equals(pd2);
		System.out.println("생성한 두 객체의 값이 같은가: "+answer);
		System.out.println("=====================================");
		
		
		System.out.println("첫 번째 객체의 해쉬코드값: "+pd1.hashCode());
		System.out.println("두 번째 객체의 해쉬코드값: "+pd2.hashCode());
		
		System.out.println("=====================================");
		
		Product pd3=new Product("Samsung","Galaxy S9","Blue", 960000);
		System.out.println("생성한 세 번째 객체의 값 :"+pd3.toString());
		
		System.out.println("=====================================");
		
		boolean answer2=(pd1.equals(pd3));
		boolean answer3=(pd1.hashCode()==pd3.hashCode());
		
		System.out.println("첫 번째 객체와 세 번째 객체의 필드값들이 일치하는가: "+answer2);
		System.out.println("첫 번째 객체와 세 번째 객체의 해쉬코드값이 일치하는가: "+answer3);
	}

}
