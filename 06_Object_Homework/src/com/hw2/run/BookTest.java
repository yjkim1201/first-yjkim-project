package com.hw2.run;

//도서 등록 프로그램
//제목, 가격, 할인율, 작가
import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
	Book b1=new Book(); //첫번째 Book 객체 생성
	
	Book b2=new Book("자바의정석", 20000, 0.2, "윤상섭");
	
	System.out.println(b1.information());
	System.out.println(b2.information());
	System.out.println("========================");
	
	b1.setTitle("c언어");
	b1.setPrice(30000);
	b1.setDiscountRate(0.1);
	b1.setAuthor("홍길동");
	
	System.out.println("수정된 결과 확인");
	System.out.println(b1.information());
	System.out.println("========================");
	
	System.out.println("도서명 = "+b1.getTitle());
	System.out.println("할인된 가격 = "+b1.getPrice());
	System.out.println("도서명 = "+b2.getTitle());
	System.out.println("할인된 가격 = "+b2.getPrice());
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
