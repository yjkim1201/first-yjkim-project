package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {

	public void practice3() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 "(0,0)"과 같은 형식으로 저장 후 출력하세요.
		
	String[][] arr= new String[3][3]; //3행 3열 문자열 배열 선언 및 할당
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print("("+i+","+j+")");
				System.out.println();
				
			}
		}
	}
	
	public void practice1() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1. 1~16까지 값을 차례로 저장하세요.
		//2. 저장된 값을 차례로 출력하세요
		
		int[][] arr=new int[4][4];
		int value=1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=value++;
				System.out.printf("%-3d",arr[i][j]);
				
			}System.out.println();
		}
		
	}
	public void practice2() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1. 1~16까지 값을 거꾸로 저장하세요.
		//2. 저장된 값을 차례로 출력하세요
	
		int[][] arr= new int[4][4];
		int value=16;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=value;
				value--;
				
				System.out.printf("%-3d", arr[i][j]);
			}
				System.out.println();
		}
	}
	
	public void practice4() {
		//4행 4열 2차원 배열을 생성해서 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 아래 내용처럼 처리하세요(참고:2차원배열 실습문제4번)
		int[][] arr= new int[4][4];
		
		int rowFinal=arr.length-1;
		int colFinal=arr[0].length-1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				if(i!=rowFinal&&j!=colFinal) {
					
					arr[i][j]=(int)(Math.random()*10)+1;
						
					arr[i][colFinal]+=arr[i][j];
					arr[rowFinal][j]+=arr[i][j];
					arr[rowFinal][colFinal]+=arr[i][j];
				}
				
				System.out.printf("%-3d", arr[i][j]);
			}
				System.out.println();
		}
			
	}
	public void practice5() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이의 숫자가 아니면
		//"반드시 1~10 사이의 정수를 입력해야 합니다." 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//char형은 숫자를 더해서 문자를 표현할 수 있고, 65는 A를 나타내고 90은 Z를 나타냄, 알파벳은 총 26글자
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("행의 크기 입력: ");
		int row=sc.nextInt();
		sc.nextLine();
		
		System.out.println("열의 크기 입력: ");
		int col=sc.nextInt();
		sc.nextLine();
		
			if((row>=1&&row<=10)&&(col>=1&&col<=10)) {
		
				int[][] arr= new int[row][col];
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length;j++) {
						arr[i][j]=(int)(Math.random()*26+65);
					
						System.out.printf("%-3c",(char)arr[i][j]);
					}
						System.out.println();
				}
					
				
			}
		
			else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				}
			}
	}
	public void practice6() { 
		//아래의 초기화된 문자열 배열을 가지고 기존의 행->열 흐름이 아닌 열->행 흐름과 같은 방식으로 출력하세요
		//단 print()를 사용하고 띄어쓰기(" ")가 존재하도록 출력하세요.
		
		String[][] strArr=new String[][] {{"이","까","왔","앞","힘"},{"차","지","습","으","냅"},{"원","열","니","로","시"},
			{"배","심","다","좀","다"},{"열","히","!","더","!!"}};
			
			for(int i=0; i<strArr.length;i++) {  //열
				for(int j=0; j<strArr[i].length;j++) {
					System.out.print(strArr[j][i]+" ");
			
				}
				
		}
	}
	public void practice7() {
		//사용자에게 행의 크기를 입력받고 그 수만큼 반복을 통해 각각 해당 행의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요
		//그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		Scanner sc=new Scanner(System.in);
		
		char[][] arr;  //문자형 배열 선언
		char ch='a';   //문자형 변수 선언, 할당
	
		
		try {
			System.out.println("행 크기 입력: ");
			int row=sc.nextInt();
			sc.nextLine();
			arr=new char[row][]; //행 크기 입력받은 후 2차원 배열의 행에 대입
			
				for(int i=0; i<arr.length; i++) {
					System.out.println(i+"행 크기 입력: "); //각 행의 크기 입력받기
					int col=sc.nextInt();
					sc.nextLine();
					
					arr[i]=new char[col];
				}  //행과 열 크기 지정 완료
			
				for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					arr[i][j]=ch++;
					}
				}
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length;j++) {
						System.out.print(arr[i][j]+" ");
					}	System.out.println();
				}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		/*System.out.println("행의 크기 입력:");
		int row=sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<row;i++) {
			System.out.println(i+"행의 크기: ");
				int result=sc.nextInt();
				sc.nextLine();
				
			String[][] arr=new String[i][result];
			arr[i][result]=
		}
		*/
		
	}
	public void practice8() {
		//1차원 배열에 12명의 학생들을 출석부 순으로 초기화하고
		//3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장
		//1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		
		String[] arr= {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		int value=0;
		
		String[][] sArr=new String[3][2];
		String[][] sArr2=new String[3][2];
		
		System.out.println("---1분단---");
		
		for(int i=0;i<sArr.length;i++) {
			for(int j=0;j<sArr[i].length;j++) {
				sArr[i][j]=arr[value];
				value++;
				
				
				System.out.print(sArr[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("---2분단---");
		
		for(int i=0;i<sArr2.length;i++) {
			for(int j=0;j<sArr2[i].length;j++) {
				sArr2[i][j]=arr[value];
				value++;
				
				System.out.print(sArr2[i][j]+" ");
			}
				System.out.println();
		}
	
	
	}
	public void practice9() {
		//위 문제에서 자래 배치한 것을 갖고 학생 이름을 검색해서 해당 학생이 어느 자리에 앉았는지 출력하세요.
		//검색할 학생 이름을 입력하세요:
		//검색하신 000학생은 0분단 0번째 줄 오른쪽(또는 왼쪽)에 있습니다. ->형식으로 출력
		Scanner sc=new Scanner(System.in);
		
		String[] arr= {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		int value=0;
		
		String[][] sArr=new String[3][2];
		String[][] sArr2=new String[3][2];
		
		System.out.println("---1분단---");
		
		for(int i=0;i<sArr.length;i++) {
			for(int j=0;j<sArr[i].length;j++) {
				sArr[i][j]=arr[value];
				value++;
				
				
				System.out.print(sArr[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("---2분단---");
		
		for(int i=0;i<sArr2.length;i++) {
			for(int j=0;j<sArr2[i].length;j++) {
				sArr2[i][j]=arr[value];
				value++;
				
				System.out.print(sArr2[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("==========================");
		System.out.println("검색할 학생 이름을 입력하세요: ");
		String name=sc.nextLine();
		
	
		for(int i=0; i<sArr.length;i++) {
			for(int j=0; j<sArr[i].length;j++) {
				if(name.equals(sArr[i][j])) {
					if(j<1) {
						System.out.println("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
				}
					else {
						System.out.println("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 오른쪽에 있습니다.");
					}
			}
		
				else if(name.equals(sArr2[i][j])) {
					if(j<1) {
						System.out.println("검색하신 "+name+" 학생은 2분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					}
					else {
						System.out.println("검색하신 "+name+" 학생은 2분단 "+(i+1)+"번째 줄 오른쪽에 있습니다.");
					}
		
				}
				//여기까지 출력 완료
			}
		
		}
	}
}

	 
	
	

