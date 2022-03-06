package com.kh.third.run;
import com.kh.third.MyName;

public class Run {
	
	public static void main(String[] args) {
		
		//1단계: 대변할 이름을 먼저 생성(new)
		MyName mn= new MyName();
		
		//2단계: import 문을 추가
		
		//3단계: 메소드를 호출
		mn.callMyName();
	}

}
