package com.hw2.run;

//���� ��� ���α׷�
//����, ����, ������, �۰�
import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
	Book b1=new Book(); //ù��° Book ��ü ����
	
	Book b2=new Book("�ڹ�������", 20000, 0.2, "����");
	
	System.out.println(b1.information());
	System.out.println(b2.information());
	System.out.println("========================");
	
	b1.setTitle("c���");
	b1.setPrice(30000);
	b1.setDiscountRate(0.1);
	b1.setAuthor("ȫ�浿");
	
	System.out.println("������ ��� Ȯ��");
	System.out.println(b1.information());
	System.out.println("========================");
	
	System.out.println("������ = "+b1.getTitle());
	System.out.println("���ε� ���� = "+b1.getPrice());
	System.out.println("������ = "+b2.getTitle());
	System.out.println("���ε� ���� = "+b2.getPrice());
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
