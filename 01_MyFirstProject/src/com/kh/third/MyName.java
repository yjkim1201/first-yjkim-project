package com.kh.third;

public class MyName {

	public void callMyName() {
	System.out.println("안녕하세요 김유진입니다.");
	
	}
	
}

/*
 * Workspace>Project>Package>Class>Method
 * 폴더 안에 동일한 폴더명이 올 수 없음
 * -> 하나의 Workspace 안에 동일한 이름의 Project 중복될 수 없다.
 * -> 한 Project 안에 동일한 이름의 Package 중복될 수 없다.
 * -> 한 Package 안에 동일한 이름의 class 중복될 수 없다.
 * -> 한 Class 안에 동일한 이름의 Method 중복될 수 있다.(오버로딩이라는 개념으로 가능)
 * -> 한 Method 안에 동일한 이름의 대변할이름(일종의 변수)들이 중복될 수 없다.
 * 
 */

/*
 * JAVA의 명명규칙(개발자들 사이의 약속=코딩컨벤션)
 * 1. 영어 사용
 * 2. 띄어쓰기 불가
 * 3. 의미 부여를 해서 여러 단어를 조합하여 짓기
 * 4. Package 명은 소문자로 짓기
 * 5. Class 명은 첫글자가 대문자여야 한다.
 * 6. Method 명은 첫글자가 소문자여야 한다.
 * 7. 변수명의 첫글자는 소문자여야 한다.
 * 8. *공통 원칙: 여러 단어를 조합해서 이름을 지을 때는 띄어쓰기 대신 각 단어별 첫글자를 대문자로 적어 가독성을 높인다.
 *            -> 이를 "낙타봉 표기법(Camel Case)"이라고 함
 *            
 * ex) 클래스명 Methodtest->MethodTest
 *     메소드명testprint->testPrint             
 * 
 */

/*
 * Quiz
 * 1. com.kh.first.MethodTest 클래스
 *    com.kh.second.MethodTest 클래스
 * 위 두개 클래스는 공존이 가능한가?
 * A: 가능함. 패키지 위치가 다르기 때문.
 * 
 *
 */





