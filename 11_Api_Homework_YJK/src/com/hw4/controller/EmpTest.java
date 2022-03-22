package com.hw4.controller;

import com.hw4.model.vo.Employee;

public class EmpTest {

	//Employee[]라는 객체 배열에 5명의 사원 명, 나이, 급여, 세율을 등록한다. 이후 사원 명, 나이, 급여, 세율을 이름 순으로 출력한다.
	
	private Employee[] empArr;
	
	public EmpTest() {
		
	}
	
	
	public void setEmp() {
		empArr = new Employee[5];
		
		empArr[0]=new Employee("문말똥",24,1500000,1.245);
		empArr[1]=new Employee("장소똥",40,2500000,1.4);
		empArr[2]=new Employee("금개똥",22,1780000,1.3);
		empArr[3]=new Employee("봉쥐똥",31,1950000,1.365);
		empArr[4]=new Employee("홍닭똥",34,1650000,1.212);
	}
	
	public void printEmp() {
		
		for(int i=0; i<empArr.length; i++) {
			System.out.println(empArr[i]);
		}
	}
		public void nameSortPrint() {
			
			//for(int i=0;i<empArr.length;i++) {
			//empArr[i].getName().compareTo() &&&&
		    //}
			
			
			//정렬: 여러개의 데이터를 일정 규칙에 따라 차례대로 나열(sort)
			//오름차순: 작은 것-> 큰 순서대로 나열하겠다.(1 2 3 4 5/ ㄱ ㄴ ㄷ ㄹ / a b c d)
			//내림차순: 큰 것-> 작은 순서대로 나열하겠다.
			
			/*
			 * * 대표적인 정렬 기법: 버블정렬(가장 쉽고, 비효율적인 방법)
			 * => 일일이 다 비교하는 원리
			 * => 매 시도마다 제일 뒷자리부터 차곡차곡 정렬이 이루어진다.
			 * => 매 시도마다 반복되는 횟수가 1씩 감소한다.
		 	 * => 맨 처음 반복은 정렬대상개수 - 1 만큼 이루어진다.
		     */
			
			for(int i=0; i<empArr.length -1; i++) { //일단 크게 배열크기-1만큼 반복하겠다.
				
				for(int j=0; j<empArr.length -1 -i; i++) {//매번 4 3 2 1만큼 반복돌리겠다.
					                                   //=>매번 반복 돌릴때마다 조건식 부분에서 1씩 더 빼줘야 함
					//만약 앞이 더 크기가 크다면 자리 바꿈 / 아니면 킵
					if(empArr[j].getName().compareTo(empArr[j+1].getName())>0) {//더 크다면 자리 바꿔주기
						
						//임시저장소를 하나 만들어서 거기에 잠시 보관=>바꿔치기 용도
						Employee tmp=empArr[j];
						
						empArr[j] = empArr[j+1];
						empArr[j+1] = tmp;
					}
					
				}
			}
			
			//적어도 이 시점에 도달했다 == 정렬이 오름차순으로 잘 이루어졌다.
			//위에서 만든 메소드 재활용
			printEmp();
	}

		//나이 기준으로 오름차순
		public void ageSortPrint() {
			for(int i=0; i<empArr.length -1; i++) {//일단 4번 돌림
				for(int j=0; j<empArr.length -1-i; j++) { //4 3 2 1 바퀴를 돌리겠다.
					
					if(empArr[j].getAge()>empArr[j+1].getAge()) {//앞의 것이 더 크다면 자리를 바꾸겠다.
						
						Employee temp=empArr[j];
						empArr[j]=empArr[j+1];
						empArr[j+1]=temp;
					}
				}
			}
			printEmp();
			
		}
		
}