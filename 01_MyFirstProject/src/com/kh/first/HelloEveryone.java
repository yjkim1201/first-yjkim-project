package com.kh.first; // 패키지 선언부 : 클래스 생성 시 선택한 패키지의 위치를 지정, 현재 내 클래스 위치를 알려줌->삭제하면 안됨
                      // 만약에 기본 패키지에 클래스를 만들게 될 경우, 패키지 선언부가 없음


//글씨크기조절: ctrl shift +/-

// 클래스 선언부
// 클래스의 풀 네임: com.kh.first.HelloEveryone
// 참고! 패키지명이 항상 소문자인 이유? 대소문자로 구분하기 위해 패키지명은 항상 소문자로 작성 / 클래스명은 항상 대문자로 작성

public class HelloEveryone { //HelloEveryone이라는 클래스 영역 시작

	// 클래스에 작성할 내용물들
	// 단, 소스코드를 그냥 작성하는 것은 불가하고, 메소드라는 영역에 작성해야 한다.
	/*
	 *  Method: 사전적으로 기능 을 의미함
	 *          즉, 하나의 기능 단위
	 *        
	 *  메소드는 main 메소드와 이름이 main이 아닌 일반 메소드로 나뉜다.
	 *  main 메소드의 경우, 프로그램이 실행되면 스스로 실행되는 메소드
	 *  일반 메소드의 경우, 스스로 실행되지 못하는 메소드(실행=호출이라고도 부름)
	 *   -> 다른 메소드에서 호출을 해주면 됨
         -> 메소드를 실행하는 것을 "호출한다.(call)"라고 한다.       	 
	 */
	// main이라는 이름의 메소드 : 일종의 고유명사, 프로그램의 시작점을 담당하는 메소드
	//                     프로그램 당 최소 1개씩은 갖고있어야 함
	public static void main(String[]args) { // main 메소드 영역 시작
	
		// 소스코드를 작성
		System.out.println("Hello Everyone!"); //출력문: 해당 내용물을 출력하는 역할
		
		//System.out.println(내용물); : 해당 내용물을 출력 후 "한 줄 띄워주는" 역할(Enter 키 누르기=줄바꿈=개행)
		System.out.println("안녕하세요~"); //ln : line의 약자
		
		// System.out.print(내용물); : 해당 내용물을 출력해주는 역할
		System.out.print("점심\n시간\n입니다\n"); // "\" = 역슬래시(Escape 문자)
		                                     // \n :개행문자(Enter 키를 누른 효과)
		
		System.out.print("점심 드세요");
		
		//System.out.printf("내용물");
		
		
	} // main 메소드 영역 끝
	
} //HelloEveryone 클래스 영역 끝
