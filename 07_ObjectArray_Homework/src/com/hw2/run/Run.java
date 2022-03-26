package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("학년 입력: ");
		int grade=sc.nextInt();
		sc.nextLine();
		
		System.out.println("반 입력: ");
		int classroom=sc.nextInt();
		sc.nextLine();
			
		System.out.println("이름 입력: ");
		String name=sc.nextLine();	
			
		System.out.println("국어점수: ");
		int kor=sc.nextInt();
		sc.nextLine();
		
		System.out.println("영어점수: ");
		int eng=sc.nextInt();
		sc.nextLine();
		
		System.out.println("수학점수: ");
		int math=sc.nextInt();
		sc.nextLine();
		
		count++;
		
		st[count]=new Student(grade, classroom,name, kor, eng, math); //객체 생성
		
		System.out.println("계속 추가할 것인가요? ");
	    char answer=sc.nextLine().charAt(0);
	    
	    if(answer=='n') {
	    	break;
	    }
	}
		System.out.println("현재 입력한 총 학생 수: "+count);
		
		for(int i=0; i<st.length; i++) {
		if(st[i]==null) {
			continue;
		}
		else {
		System.out.println(st[i].information());
		System.out.println("평균 점수 : "+(st[i].getKor()+st[i].getEng()+st[i].getMath())/3);
	    }
	 }
		
  }

}
