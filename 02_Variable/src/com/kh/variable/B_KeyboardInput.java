package com.kh.variable;

import java.util.Scanner;
//사용자가 키보드로 입력한 값을 변수에 기록하는 방법
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * * Scanner 클래스
		 * 자바에서 이미 제공하고 있는 java.util.Scanner를 이용해야 함
		 * Scanner 클래스 안에 작성되어있는 메소드들을 호출해서 사용
		 * 
		 */
		
		// 1. 다른 패키지, 다른 클래스의 메소드를 호출할 경우에는 대변할 이름을 먼저 생성(new)해야 한다.
		// 2. import 문 추가
		// import java.util.Scanner;
		Scanner sc = new Scanner(System.in);
		// System.in : 키보드로 입력받은 값을 byte 단위로 받아들이겠다.라는 의미
		// 참고) 출력 시에는 System.out 구문을 사용
		
		//사용자의 인적사항(이름, 나이, 키) 입력받는 프로그램
		//입력 받고자 하는 내용을 먼저 출력해서 사용자로부터 입력을 유도
		System.out.print("당신의 이름은 무엇입니까?: ");
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드: next(), nextLine()
		//사용자의 이름을 입력받아서 변수에 동시에 담고싶다!
		//String name = sc.next(); 
		//next(): 사용자가 엔터키를 누를 때까지 일단 대기한다.(next 계열의 모든 메소드의 공통 특징)
		//        사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지만 입력받는다.
		
		//nextLine() 메소드를 호출
		//sc.nextLine(); //입력만 받고 끝
		String name = sc.nextLine(); //입력 받고, 변수에 동시에 담는다
		//nextLine(): 엔터 누를 때까지 대기한다.
		//            사용자가 입력한 값 중에서 엔터키를 치기 전까지 공백에 무관하게 그 줄에 담긴 모든 문자열을 입력받는다.      
		//            특히 사용자가 입력한 값 중, 공백이 포함될 여지가 있을 경우 유용(대표적인 예: 주소)
		//System.out.println(name);
		
		//나이 입력받기
		System.out.print("당신의 나이는 몇살입니까?: ");
		
		//사용자가 입력한 값을 int 형 정수로 받아들이는 메소드: nextInt()
		//sc.nextInt(); // 값 입력만 받고 끝
		int age = sc.nextInt(); 
		//**주의사항: nextInt() 메소드 호출 후 '반드시' nextLine() 메소드를 한번 실행할 것!
		
		sc.nextLine(); //버퍼 공간에 남아있던 엔터를 비워서 엔터를 친 효과를 냄
		//nextInt()후 nextLine()이 실행되게 작성되어 있을 경우
		//버퍼(임시 저장소)에 남아있는 엔터값(\n, 개행문자) 사용자가 자동으로 입력했다고 간주하여
		//곧바로 메모리로 저장된다. (즉, 변수에 담긴다.)
		
		//키 입력받기
		
		//사용자가 입력한 값을 실수형 double 형태로 받아들이는 메소드: nextDouble()
		System.out.print("당신의 키는 몇cm입니까?: ");
		//sc.nextDouble(); //값 입력만 받고 끝
		double height = sc.nextDouble();
		
		sc.nextLine(); //버퍼에 남아있는 엔터값을 비워주기 위해 실행
		
		//지금까지 입력받을 때마다 입력받은 값을 name, age, height라는 변수에 보관함
		System.out.println("키"+height+"cm, "+"나이"+age+"세, "+"이름"+name+"님 안녕하세요~^^");
		
		/*
		 * Scanner 클래스 내의 입력 받는 메소드 종류들
		 * 1. next(): 문자열을 뽑을 때(단, 공백 전까지)
		 * 2. nextLine(): 문자열을 뽑을 때(공백 포함해서)
		 * 3. nextInt(): int 타입의 정수값을 뽑을 때
		 * 4. nextByte(): byte 타입의 정수값을 뽑을 때
		 * 5. nextShort(): short 타입의 정수값을 뽑을 때
		 * 6. nextLong(): long 타입의 정수값을 뽑을 때
		 * 7. nextDouble(): double 타입의 실수값을 뽑을 때
		 * 8. nextFloat(): float 타입의 실수값을 뽑을 때
		 *  
		 *  =>어떤 타입의 값을 받을지 잘 파악해서 상황에 맞는 메소드를 호출해서 쓰면 됨.
		 */
		
	} //inputTest1 메소드 영역 끝
	
	  //그러면 문자 1개를 입력받고자 한다면?
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in); //스캐너 클래스 대변할 변수 생성(new)
		//문자열을 뽑을 때는 next() 또는 nextLine()
		//문자를 뽑을 때는 nextChar()은 존재하지 않음
		
		//사용자로부터 인적사항(이름, 나이, 성별, 키)을 키보드로 입력받아 출력하는 프로그램
		//성별 입력 유도: 남자(Male) / 여자(Female)
		
		System.out.print("이름: ");
		String name =sc.nextLine();
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		sc.nextLine(); //버퍼를 비워줌=엔터키 없애줌
		
		System.out.print("성별(M/F): ");
		char gender=sc.nextLine().charAt(0);
		//먼저 문자열을 입력받은 후, 그 문자열의 0번째 글자만 추출
		
		// ! 주의사항: 만약에 내가 뽑고자 하는 위치값이 문자열의 크기보다 크다면?
		// StringIndexOutOfBoundsException: String index out of range: 10
		// =>문자열 인덱스 범위를 벗어났을 때 발생하는 오류
		// =>내가 입력한 Male은 총 4글자인데, 10번째 index 글자를 추출하려해서 발생한 오류
		
		/*
		 * 문자열은 여러 문자들의 집합이기 때문에, 
		 * 일단 문자열을 입력받은 후 첫번째 문자 하나만 뽑아내겠다.
		 * 
		 * "apple" 이란 문자열 => 인덱스(index) 개념: 컴퓨터는 숫자를 0부터 셈
		 * 1번째 글자는 a => 0번째 글자
		 * 2번째 글자는 p => 1번째 글자
		 * 3번째 글자는 p => 2번째 글자
		 * 4번째 글자는 l => 3번째 글자
		 * 5번째 글자는 e => 4번째 글자
		 * 
		 * *문자열로부터 해당 위치의(index) 문자 하나만 뽑아내주는 메소드
		 * => 해당문자열.charAt(내가뽑고자하는위치값) 메소드
		 * 
		 * 1. 일단 키보드로 입력 받는다.=>nextLine()
		 * 2. 입력 받은 문자열로부터 charAt 메소드를 실행
		 * => 한 단계로(한줄로) 표현해보기
		 *    sc.nextLine().charAt(0)	
		 */
			
		System.out.print("키: ");
		double height=sc.nextDouble();
		
		sc.nextLine();
		
		//출력해보기
		System.out.println(name+"님의 개인정보");
		System.out.println("성별: "+gender);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
		
	} //inputTest2 메소드 영역 끝
	
	//참고) 만약에 nextInt 다음에 nextLine으로 버퍼를 비우지 않을 경우
	public void inputTest3() {
		//사용자로부터 인적사항을 입력받는 것(이름, 나이, 주소)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		sc.nextLine();
		//원래는 이 자리에 nextLine()메소드가 호출되어야 함=>버퍼 비워주기 위해서
		//***이 케이스는 nextInt를 이용해서 숫자값을 받은 후 nextLine을 이용해 문자열을 받고자할 때 발생
		
		System.out.print("주소: ");
		String address=sc.nextLine(); //주소: 서울시 마포구 공덕동=>nextLine()
		
		//이제 변수에 담은 값들을 출력
		//000에 사는 00살 000님 환영합니다.
	    System.out.println(address+"에 사는"+age+"살 "+name+"님 환영합니다.");
	    
		
	}
	
	
	
	
}
