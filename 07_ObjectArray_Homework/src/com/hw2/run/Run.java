package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("�г� �Է�: ");
		int grade=sc.nextInt();
		sc.nextLine();
		
		System.out.println("�� �Է�: ");
		int classroom=sc.nextInt();
		sc.nextLine();
			
		System.out.println("�̸� �Է�: ");
		String name=sc.nextLine();	
			
		System.out.println("��������: ");
		int kor=sc.nextInt();
		sc.nextLine();
		
		System.out.println("��������: ");
		int eng=sc.nextInt();
		sc.nextLine();
		
		System.out.println("��������: ");
		int math=sc.nextInt();
		sc.nextLine();
		
		count++;
		
		st[count]=new Student(grade, classroom,name, kor, eng, math); //��ü ����
		
		System.out.println("��� �߰��� ���ΰ���? ");
	    char answer=sc.nextLine().charAt(0);
	    
	    if(answer=='n') {
	    	break;
	    }
	}
		System.out.println("���� �Է��� �� �л� ��: "+count);
		
		for(int i=0; i<st.length; i++) {
		if(st[i]==null) {
			continue;
		}
		else {
		System.out.println(st[i].information());
		System.out.println("��� ���� : "+(st[i].getKor()+st[i].getEng()+st[i].getMath())/3);
	    }
	 }
		
  }

}
