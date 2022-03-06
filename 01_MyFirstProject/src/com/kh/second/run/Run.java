package com.kh.second.run;

import com.kh.first.HelloEveryone;
import com.kh.second.MethodTest; //해당 패키지의 해당 클래스를 사용하겠다는 선언(import 문)

//com.kh.second.run.Run
public class Run {

	// main 메소드
	public static void main(String[] args) {
		System.out.println("프로그램 시작"); //ctrl+f11 = run as 버튼
	
	/*
	 * - 같은 클래스에 존재하는 메소드를 호출 
	 *  : 호출하고자하는 메소드명(); 입력 시 호출됨
	 * 
	 * - 서로 다른 클래스에 존재하는 메소드를 호출
	 */
	
	//1. 호출하고 싶은 메소드가 존재하는 클래스 찾아야 함
	//	:호출하고 싶은 메소드가 존재하는 클래스를 생성(new) 해야 한다. ->객체를 생성한다.
    // [표현법] 클래스명 대변할이름 = new 클래스명(); = 객체를 생성한다고 표현함
    //	MethodTest mt = new MethodTest();
	// 참고) static 키워드가 있는 경우는 이 과정을 생략할 수 있다.
		
		
	//-> 기본적으로 현재 같은 패키지 내에 해당 이름을 가진 클래스를 찾게 됨
    //   Run 클래스 기준에서, MethodTest 클래스는 다른 패키지에 존재하기 때문에 못찾아서 오류가 발생
    	
    // 해결 방법
    // 1. 해당 클래스가 정확히 어떤 패키지에 있는 클래스인지 명시(풀 네임)
    //	com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
    
	// 2. 그냥 클래스명만 갖고 작성하되, 이 클래스가 어떤 패키지에 속해있는지 선언문(import)을 추가->주로 사용하는 방법 	
		MethodTest mt=new MethodTest();
	
	//2. 생성 후 해당 클래스에 있는 메소드를 호출(실행)
	//[표현법] 대변할 이름.호출하고자하는 메소드명();
		/*
		 * mt.testPrintA
		 * ();
		mt.testPrintB();
		mt.testPrintC();
		 */
		
		//참고) CTRL+M: 화면 크게 보기 / ctrl+f11: 실행
		
		
		//testPrintA 메소드를 한번만 호출해서 A,B,C 모두 호출하는 결과를 얻으려면?!
		mt.testPrintA();
		
		//일반 메소드: 호출에 의해서만 실행되는 메소드
		//main 메소드: 시작점이기 때문에 시작 시점에서 실행되는 메소드
		// -> main 메소드도 호출이 가능한가?
		//public static이라는 키워드가 붙은 다른 클래스의 메소드를 호출하고자 할 경우
		//위의 1, 2번 과정을 생략할 수 있다.
		//[표현법] 해당클래스명.메소드명();
		HelloEveryone.main(null); // null: 값이 없음을 의미하는 값
		
		
		
		
		
	}
}
