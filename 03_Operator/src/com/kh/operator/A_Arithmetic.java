package com.kh.operator;

public class A_Arithmetic {

	/*
	 * *산술 연산자
	 * 이항연산자로서 연산 방법, 우선순위가 기존에 알던 일반 수학 산술과 동일한 역할을 하는 연산자
	 * 
	 * 종류
	 * + : 덧셈
	 * - : 뺄셈
	 * * : 곱셈
	 * 슬래시(/) : 나눗셈       =>나누기를 하고 몫을 구한다.
	 * % : 모듈러(Modular)=>나누기를 하고 나머지를 구한다.
	 * 
	 */
	
	public void method1() {
		int num1=10;
		int num2=3;
		
		System.out.println("num1+num2 = "+(num1+num2));
	    // (num1+num2)를 괄호로 묶어야 13이라는 결과가 나온다.
		// 만약, num1+num2를 그대로 출력하면
		// String처럼 각각 숫자 10, 숫자 3을 문자열처럼 하나로 연이어 출력하기 때문에 103이 나옴
		// => 앞, 뒤의 우선순위가 동일한 +이기 때문에 연산의 순서가 왼쪽->오른쪽으로 흐르기 때문
	
		System.out.println("num1-num2= "+(num1-num2));
		
		// 뺄셈의 경우, 덧셈과 우선순위가 동일함
		// String처럼 숫자 10과 3을 각각 인식하기 때문에 문법적 오류가 발생한다.=>문자열-숫자가 됨
		// => (num1-num2) 처럼 괄호로 묶어줘야 한다.
		
		System.out.println("num1*num2= "+num1*num2);
		System.out.println("num1/num2= "+num1/num2); //3: 몫
		System.out.println("num1%num2= "+num1%num2); //1: 나머지
	    // 곱셈, 나눗셈, 모듈러의 경우에는 덧셈보다 우선순위가 높기 때문에
		// 괄호로 굳이 묶지 않아도 정확한 결과가 나온다.
		// 권장사항: 다만 괄호로 묶는 것을 권장한다. 가독성이 높아지기 때문
		
		//System.out.println(10/0);
		//System.out.println(10%0);
	    //ArithmeticException: / by zero 오류 발생
		//=>수학과 마찬가지로 0으로 나눌 수 없다. 주의!!
		
		//실수의 경우
	    double a=/*(double)*/35;  //35.0
	    double b=10; //10.0
	    
	    System.out.println("a+b= "+(a+b)); //45.0
		System.out.println("a-b= "+(a-b)); //25.0
		System.out.println("a*b= "+(a*b)); //350.0
		System.out.println("a/b= "+(a/b)); //3.5
		System.out.println("a%b= "+(a%b)); //5.0
		//실수끼리의 연산 결과값은 실수
		
		
	}
	
	
	
}
