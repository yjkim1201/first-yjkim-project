package com.kh.operator;

public class B_InDecrease {

	/*
	 * *증감연산자
	 * 단항연산자로써 한번에 값을 1씩만 증가 또는 감소시키는 연산자
	 * 
	 * 종류
	 * ++ : 한번에 값을 1만 증가시키겠다.
	 * [ 표현법 ]
	 * ++값: 전위연산자
	 * 값++: 후위연산자
	 *  
	 * -- : 한번에 값을 1만 감소시키겠다.
	 * [ 표현법 ]
	 * --값: 전위연산자
	 * 값--: 후위연산자
	 * 
	 * => 연산자의 위치에 따라서 연산이 언제 될지 결정됨
	 * (증감연산자)값: 연산이 먼저 되고 나서 값을 처리함                =>선증감 후처리
	 * 값(증감연산자): 값이 처리되고 나서 그 다음에 연산이 이루어짐=>선처리 후증감
	 */
	
	public void method1() {
		int num =10;
		
		System.out.println("num: "+num);
		
		num++; //num 변수에 든 값에 1을 증가시키겠다.
		       //즉, num = num+1; 이 구문과 같은 의미
		
		
		System.out.println("변경된 num: "+num);
	}
	
		public void method2() {
			
			//전위연산자 =>선 증감 후 처리
			int a=10;
			int b=++a; //++a 이 시점에서 a의 값이 1 증가함(11)
			           //= 이라는 시점에서 b에 a값이 대입되는 처리과정을 거침
			System.out.println("a: "+a+", b: "+b);
			//a: 11, b: 11
			
			//후위연산자=> 선 처리 후 증감
			int c=10;
			int d=c++; // =이라는 구문 시점에서 먼저 d에 기존의 c 값인 10이 먼저 대입되는 처리과정을 거친 후
			           // c++라는 이 시점에서 c의 값이 1 증가(11)
			System.out.println("c: "+c+", d: "+d);
			//c:11, d:10
		} //method2 영역 끝
		
		public void method3() {
			
			//후위연산
			int num1=20;
			int result1 = num1++ * 3; // result1=60, num1=21
		    // 증감연산자는 단항연산자라서 값 한개에만 연산이 적용된다.
			// 그래서 num1에만 1증가가 적용되고, result1에는 적용 안됨.
			
		System.out.println("num1: "+num1);
		System.out.println("result1: "+result1);
		
		//전위연산
		int num2=20;
		int result2 = ++num2*3;
		
		
		
		
		
		//num2=21, result2=63
		
		System.out.println("num2: "+num2);
		System.out.println("result2: "+result2);
		
		//-- 전위/후위연산
		int num3 = 10;
		//int result3 = --num3 * 5; //num3=9, result3=45
		int result3= num3--*5; //result3=50, num3=9
		
		System.out.println("num3: "+num3);
		System.out.println("result3: "+result3);
		
		
		
		}
		//quiz
		
		int a=5;
		int b=10;
		int c= (++a)+b; //a=6, c=16
		int d= c/a; //2
		int e = c%a; //4
		int f = e++;  //f=4, e=5
		int g = (--b)+(d--); //b=9, g=11, d=1
		int h = 2;  
		int i=a++ + b / (--c/f) * (g-- - d)%(++e + h); //6+9/ (15/4)*(11-1)%(5+2)
		                                               //6+9/3*10%7
		                                               //6+3*10%7=8
		
		                                                //결과값: 12...^^..(마지막에 ++e +h) ->(6+2)
		
		
	}
	
	

