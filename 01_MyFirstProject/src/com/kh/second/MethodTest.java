package com.kh.second;

//com.kh.second.MethodTest
public class MethodTest { //MethodTest 클래스 영역 시작
/*
 * 한 클래스 내에 여러개의 메소드를 만들 수 있음
 * 무조건 메인 메소드를 포함할 필요가 없음
 */
	
 public void testPrintA() {
	 
	 //이 메소드가 실행되는 순간 실행될 내용
	System.out.println("testPrintA 메소드 실행");
	
	testPrintB();
 }
	
public void testPrintB() {
	System.out.println("testPrintB 메소드 실행");
	
	testPrintC();	
}
 
public void testPrintC() {
	System.out.println("testPrintC 메소드 실행");
	
	//testPrintA();
	
	//만약, testPrintC 메소드에서 testPrintA를 호출할 경우 무한 반복된다.
    //실행결과:
	//프로그램 시작
	//testPrintA 메소드 실행
	//testPrintB 메소드 실행
	//testPrintC 메소드 실행
	//testPrintA 메소드 실행
	//....
	//[오류케이스] 이 경우 무한반복으로 결과가 실행되다가 StackOverflowError라는 에러 발생
	//  (메모리가 더이상 버티지 못하고 과로로 뻗음)
	//Stack 은 메모리 공간의 한 유형 중 하나, Stack의 크기를 벗어난 경우 오류 발생

}


} //MethodTest 클래스 영역 끝


