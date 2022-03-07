package com.kh.operator;
import java.util.Scanner;

public class E_Comparison {

	/*
	 * *비교연산자(관계연산자)
	 * 두개의 값을 가지고 비교하는 이항연산자
	 * 비교 연산 결과가 사실일 경우 true, 거짓일 경우 false
	 * => 후에 특정 조건을 제시할 수 있는[조건문]에서 많이 쓰일 예정!
	 * 
	 * 분류
	 * 1. 크고 작음을 비교 => 숫자, 문자
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b: a가 b보다 작거나 같습니까?
	 * a >= b: a가 b보다 크거나 같습니까?
	 * 
	 * 
	 * 2. 일치함을 비교 =>숫자뿐만 아니라 문자, 주소값, 논리값 등
	 * a==b : a와 b가 일치합니까?
	 * a!=b : a와 b가 일치하지 않습니까? 
	 */
	
	public void method1() {
		
		int a=10;
		int b=25;
		
		//대소비교연산자
		System.out.println("a>b: "+(a>b)); //false
		//비교연산보다 산술연산이 우선순위가 더 높기 때문에
		// (a>b) 는 괄호로 묶어서 우선순위를 높여줘야 한다.
		
		System.out.println("a<=b: "+(a<=b)); //true
		
		//동등비교 연산자
		boolean result1 = (a==b); //가독성을 위해 ()로 묶어줌
		System.out.println("result1: "+result1);
		
		boolean result2= (a!=b);
		System.out.println("result2: "+result2);
		
		//산술연산 + 비교연산
		boolean result3 = 3+5<1;
		System.out.println("result3: "+result3);
		
		/*
		 * 짝수, 홀수
		 * 짝수: 2로 나누었을 때 나누어 떨어지는 수=>나머지 값이 0이다.
		 * 홀수: 2로 나누었을 때 나누어 떨어지지 않는 수 =>나머지 값이 1이다.
		 * => 어떤 값을 2로 나누었을 때 나머지 값 0,1을 갖고 짝수/홀수인지 판별 가능
		 *
		 */
		System.out.println("a가 짝수입니까? "+(a%2==0));
		System.out.println("b가 짝수입니까? "+(b%2==0));
		//2로 나누었을 때 나머지가 0이라면 짝수, 1이라면 홀수
		
		//다르게 표현한 케이스
		System.out.println("a가 홀수입니까? "+(a%2==1));
		System.out.println("a가 짝수가 아닙니까? "+((a%2)!=0));
	
		System.out.println("a가 홀수가 아닙니까? "+((a%2)!=1));
	
		}
	
	public void method2() {
		
		//1. 사용자로부터 값(정수)을 입력받음
		Scanner sc=new Scanner(System.in);
		//입력유도구문
		System.out.println("정수값 한개 입력:");
		int num=sc.nextInt();
		sc.nextLine();
				
		//2. 그 해당 값이 양수입니까?
		System.out.println("사용자가 입력한 값이 양수입니까?"+(num>0));
		//3. 그 해당 값이 짝수입니까?
		System.out.println("사용자가 입력한 값이 짝수입니까?"+((num%2)!=1)); //==0
	
	}
	
}
