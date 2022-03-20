package com.kh.arrayHomework;

import java.util.Scanner;

public class Array_Homework {
	
	public void practice13() {
		
		//주민등록번호를 String 문자열로 입력 받고, 입력 받은 문자열을 각 인덱스 별 문자를
		//char[]에 옮겨 담기(단 성별 자리 이후부터 *로 담기)
		//ex. 주민등록번호(-포함): 123456-1234567
		//123456-1******
		
		Scanner sc=new Scanner(System.in); //문자열 입력
		
		System.out.print("주민등록번호(-포함): ");
		String personId = sc.nextLine();
		
		char[] number = new char[14];  //char 배열 선언 및 할당
		
		for(int i=0; i<number.length; i++) {
			number[i] = personId.charAt(i);
			
			if(i<8) {
				System.out.print(number[i]);
				}
			else {
				System.out.print("*");
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
