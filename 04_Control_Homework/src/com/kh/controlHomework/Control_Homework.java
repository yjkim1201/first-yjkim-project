package com.kh.controlHomework;

import java.util.Scanner;

public class Control_Homework {

	//아이디, 비밀번호를 정하고 로그인 기능을 작성하시오.(아이디:boram, 비밀번호: 1234)
	//로그인 성공 시 "로그인 성공"
	//아이디가 틀렸을 경우 "아이디가 틀렸습니다."
	//비밀번호가 틀렸을 경우 "비밀번호가 틀렸습니다."
	
	public void practice5() {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("아이디: ");
	String id=sc.nextLine();
	
	System.out.print("비밀번호: ");
	String pw=sc.nextLine();   //아이디, 비밀번호 입력
	
	if(pw.equals("1234")) {
		if(id.equals("boram")) {    //아이디, 비밀번호를 모두 맞게 입력했을 경우
			System.out.print("로그인 성공");
		}
		else {                      //아이디가 틀렸을 경우
			System.out.print("아이디가 틀렸습니다.");
		 }	
    }
	
	else {
	if(id.equals("boram")) {   //비밀번호가 틀렸을 경우
			System.out.print("비밀번호가 틀렸습니다.");
		}
	 
	else {
		System.out.print("아이디, 비밀번호 모두 틀렸습니다.");
	 }
	}
  }
	
	public void practice6() {
		
		//관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한을 출력
		//관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		//회원은 게시글 작성, 게시글 조회, 댓글 작성
		//비회원은 게시글 조회만 가능
		//잘못 입력했을 경우 "잘못 입력했습니다."라는 출력문 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String grade=sc.nextLine();
		
		switch(grade) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리\n게시글 작성, 댓글 작성 \n게시글 조회");
			break;
			
		case "회원" :
		System.out.println("게시글 작성, 댓글 작성 \n게시글 조회");
	    	break;
		
		case "비회원" :
			System.out.println("게시글 조회");
			break;
			
		default :
			System.out.println("잘못 입력했습니다.");
			return;
		}
	}
	
	
	
	
	
	
	
	public void method1() {
	
	/*
사용자로부터 문자열을 입력받아 
그 문자열만큼 반복을 돌려가면서 각 index 번째 문자를 하나씩 추출하여 출력하세요
실행결과 예시
문자열을 입력하세요 : apple
1번째 문자 : a
2번째 문자 : p
3번째 문자 : p
4번째 문자 : l
5번째 문자 : e	
	 */

		Scanner sc=new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String str=sc.nextLine();
		
		
		for(int i=0; i<str.length(); i++) {  //문자열의 길이
					
		System.out.println((i+1)+"번째 문자: "+str.charAt(i));
		}
		
		
		
	}
	
}
	
