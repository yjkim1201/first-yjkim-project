package com.kh.variable;

public class C_Cast { //형변환 = cast(ing)

	/*
	 *** 형변환
	 * 값의 자료형을 바꾸는 개념
	 * 
	 ** 컴퓨터 상에서 값 처리 규칙
	 * 1.= (대입연산자) 을 기준으로 왼쪽, 오른쪽은 같은 자료형이여야 한다.
	 *     => 즉, 같은 자료형에 해당하는 값만 대입 가능
	 *     => 다른 자료형 값을 대입하고자 한다면 "형변환"이 필수
	 * [ 표현법 ] 자료형 변수명  = (바꿀 자료형) 값;
	 *         
	 * 2.같은 자료형끼리만 연산이 가능하다.
	 *     => 즉,다른 자료형끼리 연산을 수행하고 싶을 경우에 "형변환"이 필수
	 * [ 표현법 ] 값 + (바꿀 자료형)값;     
	 *     
	 ** 형변환의 종류
	 * 1.자동형변환=>자동으로 형변환이 진행되기 때문에 직접 코드 상으로 형변환할 필요 없음/컴파일하는 시점에서 진행됨
	 *          =>작은 바이트의 자료형 값->큰 바이트의 자료형 변수에 담을 경우
	 * 2.강제형변환=>자동형변환이 진행되지 않는 경우, 내가 직접 강제로 형변환해야하는 경우 
	 *          =>큰 바이트의 자료형 값->작은 바이트의 자료형 변수에 담을 경우
	 *          강제형변환을 명시적형변환 이라고도 부른다.
	 *   
	 * [ 표현법 ] (바꿀 자료형)자료형을 바꾸고 싶은 값;  //강제 형변환
	 *  => (바꿀 자료형): 형변환 연산자, Cast 연산자
	 */
	
	//자동형변환: 작은 바이트의 자료형 값->큰 바이트의 자료형 변수에 담을 경우 발생
	public void autoCasting() {
		
		//자동 형변환이 되는 case
		//1. int(4byte) -> double(8byte)
		int i1 = 10;
		double d1 = /* (double) */ i1;
		
		System.out.println("d1: "+d1);
		//자동으로 형변환이 되었다.
		//그런데 int는 정수, double은 실수이기에 
		//d1은 10->10.0으로 형변환이 된다.
		
		int i2=12;
		double d2=3.3;
		
		double result2= /*(double)*/i2+d2; //12.0+3.3=15.3
		
		System.out.println("result2: "+result2);
		
		//2. int(4byte)->long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		System.out.println("l3: "+l3);
		
		long l4 = 2000; //L을 붙이지 않아도 문제가 없는 이유: 자동 형변환이 되기 때문
		System.out.println("l4: "+l4);
		
		// 특이케이스 3. long(8byte)->float(4byte)  
		// 정수가 실수로 변환될 경우, 큰 사이즈의 정수가 작은 사이즈의 실수로 변환 가능하다.
		//4 byte의 float 형은 사실 long형보다 담을 수 있는 값의 범위가 크기 때문에 가능하다.
		long l5 = 1000000000;
		float f5 = /*(float)*/l5;  //1.0E9=1000000000.0
		
		System.out.println("f5: "+f5);
		
		// 특이케이스 4. char(2byte)<->int(4byte) 양방향 형변환 가능
		char ch = /*(char)*/65;
		System.out.println("ch: "+ch); // 'A'
		
		int num = /*(int)*/'A';
		System.out.println("num: "+num); //65
		
	    System.out.println((int)'김'); //44608
		/*
		 * *참고) 아스키코드표(ASCII)
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념(0~127 - 총 128개 숫자로 영문자, 대소문자 알파벳, 숫자, 특수문자)
		 * 'A'= 65, 'a'= 97
		 * 
		 * *참고) 유니코드표
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념
		 * 아스키코드표의 확장된 개념(0~65000여개의 범위까지 표현 가능-영어,숫자,특수문자,그 외 언어 모두 가능)
		 * 
		 */
		
		int sum = 'A'+10; //65+10=75
		System.out.println("sum: "+sum); //문자와 정수 사이에 산술연산이 가능하다.
		System.out.println("sum: "+(char)sum); //알파벳 별로 고유값 확인이 가능하다.
		
		// 특이케이스 5. byte, short의 연산
		byte b1=1;
		byte b2=10;
		
		byte result = (byte)(b1+b2); //int 형의 결과를 강제로 byte 타입으로 변환
		//byte나 short 연산시 무조건 int(4byte)로 취급한다.
	} //autoCasting 메소드 영역 끝
	
	// 강제(명시적)형변환: 큰 크기의 자료형을 작은 크기의 자료형으로 형변환할 경우
	public void forceCasting() {
		
		//강제형변환 해야하는 case
		
		//1. double(8byte)->float(4byte)
		float f1 = 4.0f; //항상 f를 붙여줘야 함.
		
		double d2=8.0;
		float f2 = (float)d2;
		
		//2. double(8byte)->int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3; //결과값이 10 or 11? =>10
 		
		System.out.println("i3: "+i3);
		//강제 형변환 시 주의사항
		//데이터 손실이 일어날 수 있기 때문에 강제형변환은 신중히 해야한다.
		//=> 소숫점 아래 내용이 절삭되었다.
	
		int iNum=10;
		double dNum=5.89;
		
		//int iSum = iNum+dNum;
		// iNum+dNum: iNum이 상대적으로 큰 사이즈인 double 형으로 자동형변환 되고
		//            dNum과 덧셈 연산이 행해진 상태=> 그래서 지금 double 형임.
		
		//해결방법
		//1. 연산결과를 int 형에 맞게 강제 형변환 시키기
		 int iSum=(int)(iNum+dNum);
		System.out.println("iSum: "+iSum); //15.89->15
		
		//2. 덧셈 연산 전에 dNum을 강제형변환한 후 덧셈 연산을 수행
		//=> 자동형변환은 원래 작은->큰 바이트로 변환되기 때문에
		//   원래대로라면 iNum이 double로 변환된 후 덧셈이 실행되는 순서임.
		//=> 그런데 그 전에 일부러 dNum을 int 형으로 강제로 변환시킨 수 덧셈 연산을 수행
		int iSum2 = iNum+(int)dNum; //10+5.89->10+5
		
		System.out.println("iSum2: "+iSum2);  //15
		
		//3. 결과값을 double형 변수에 담기
		//=> 이 경우, 데이터 손실이 없기에 정확한 값이 담긴다.
		double dSum = iNum+dNum; //10.0+5.89=15.89
		
		System.out.println("dSum: "+dSum);
		
		/*
		 * 강제 형변환을 주로 하는 경우
		 * Type mismatch: cannot convert from double to int
		 */
		
		
		
	}
	
	
	
	
}
