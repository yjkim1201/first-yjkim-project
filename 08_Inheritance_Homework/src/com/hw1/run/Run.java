package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		//3명의 학생 정보를 기록할 객체 배열을 할당하고 사용데이터(문제에 있음)를 참고하여
		//3명의 학생 객체 생성 후 반복문을 통해 출력
		Student[] s = new Student[3]; //객체 배열 선언, 할당
		
		s[0]=new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1]=new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2]=new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		//객체 배열에 값 대입
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].information());
		}
		
		//최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고
		//반복문을 사용해 키보드로 사원 정보를 입력 받도록 구현
		Employee[] e = new Employee[10];
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		while(true) {
			
				
			System.out.println("이름을 입력하세오: ");
			String name=sc.nextLine();
			
			System.out.println("나이를 입력하세요: ");
			int age=sc.nextInt();
			sc.nextLine();
		
			
			System.out.println("신장을 입력하세요: ");
			double height=sc.nextDouble();
			sc.nextLine();
			
			System.out.println("몸무게를 입력하세요: ");
			double weight=sc.nextDouble();
			sc.nextLine();
	
			System.out.println("급여를 입력하세요: ");
			int salary=sc.nextInt();
			sc.nextLine();
			
			System.out.println("부서를 입력하세요: ");
			String dept=sc.nextLine();
			
			e[count]=new Employee(name,age,height,weight,salary,dept);
			count++;
		
			System.out.println("계속  추가하시겠습니까? ");
			char answer=sc.nextLine().charAt(0);
			
			if(answer=='y') {
				continue;
			}
			else if(answer=='n') {
				break;
			}
			
	} //입력 완료
		
		for(int i=0; i<e.length;i++) {
			if(e[i]!=null) {
			System.out.println(e[i].information());
			}
			
			else {
			break;
			}
		}
	}
		
		
		
	

}
