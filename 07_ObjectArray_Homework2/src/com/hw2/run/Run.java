package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Student[] arr=new Student[10]; //10명의 정보를 기록할 수 있는 객체 배열 할당
		
		int count=0;
		
		while(true) {
			
			System.out.println("학년을 입력하세요: ");
			int grade=sc.nextInt();
			sc.nextLine();
			
			System.out.println("반을 입력하세요: ");
			int classroom=sc.nextInt();
			sc.nextLine();
			
			System.out.println("이름을 입력하세요: ");
			String name=sc.nextLine();
			
			System.out.println("국어점수를 입력하세요: ");
			int kor=sc.nextInt();
			sc.nextLine();
			
			System.out.println("영어점수를 입력하세요: ");
			int eng=sc.nextInt();
			sc.nextLine();
			
			System.out.println("수학점수를 입력하세요: ");
			int math=sc.nextInt();
			sc.nextLine();
			
			arr[count]=new Student(grade, classroom, name, kor, eng, math);
			count++;
			
			System.out.println("계속 추가할건가요?");
			char answer=sc.nextLine().charAt(0);
			
			if(answer=='y'||answer=='Y') {
				continue;
			}
			else if(answer=='n'||answer=='N'){
				
			
			for(int i=0; i<arr.length;i++) {
			
				if(arr[i]!=null) {
				System.out.println(arr[i].information());
				}
				else {
					break;
				}
			}
			return;
			}
		}
		
		
	}

}
