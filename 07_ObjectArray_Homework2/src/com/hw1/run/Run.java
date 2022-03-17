package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
	
		//3명의 사원 정보를 배열을 통해 생성한 후 출력
		Employee[] arr=new Employee[3]; //객체 배열 크기 3으로 할당
		
		arr[0]=new Employee();
		arr[1]=new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		arr[2]=new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i].information());
		
			
		}
		System.out.println("===========================================");
		
		arr[0]=new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
		arr[1].setDept("기획부");
		arr[1].setJob("부장");
		arr[1].setGender('M');
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		
		System.out.println(arr[0].information());
		System.out.println(arr[1].information());
		System.out.println("============================================");
		
		//직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		//보너스가 적용된 연봉=(급여+(급여*보너스포인트))*12
		
		int result=0;
		int number=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getEmpName()+"의 연봉: "+
			(int)(arr[i].getSalary()+(arr[i].getSalary()*arr[i].getBonusPoint()))*12+"원");
			
			result +=(int)(arr[i].getSalary()+(arr[i].getSalary()*arr[i].getBonusPoint()))*12;
			number++;
		}
		
		System.out.println("=================================================");
		
		System.out.println("직원들의 연봉 평균: "+result/number+"원");
		
		
	}

}
