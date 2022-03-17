package com.hw2.model.vo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScoreProcess {

	Scanner sc=new Scanner(System.in);
	
	public ScoreProcess() {
		
	}
	
	public void scoreSave() {
		int num=0; //학생을 구분할 변수
		
		//try~ with resource 구문으로 "score.dat"파일에 저장되게 DataOutputStream과 FileOutputStream 생성
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("score.dat"))){
			
			while(true) {
				System.out.println("=====다음의 성적들을 입력하시오=====");
				
				System.out.println("국어: ");
				int kor=sc.nextInt();
				sc.nextLine();
				
				System.out.println("영어: ");
				int eng=sc.nextInt();
				sc.nextLine();
				
				System.out.println("수학: ");
				int math=sc.nextInt();
				sc.nextLine();
				
				int sum=(kor+eng+math);
				double avg=(kor+eng+math)/3;
				//위의 데이터들 순서대로 파일에 출력
				
				dos.write(kor);
				dos.write(eng);
				dos.write(math);
				dos.write(sum);
				dos.writeDouble(avg); //double 타입 출력시 writeDouble 사용
				
				num++; //학생 수 카운트
				System.out.println(num+"번째 학생 정보 기록");
				System.out.println("계속 저장하시겠습니까? (y/n): ");
				char answer=sc.nextLine().toLowerCase().charAt(0);
				
				if(answer=='n') { //n 입력 시 아래 구문 출력 후 반복문 빠져나가기
					System.out.println("score.dat 파일에 저장 완료");
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void scoreRead() {
		int kor=0, eng=0, math=0, sum=0;
		double avg=0.0, avgS=0.0; //avgS : 모든 학생들의 점수 평균을 뜻하는 변수
		
		int count=0; //몇 명의 학생인지
		
		try(DataInputStream dis=new DataInputStream(new FileInputStream("score.dat"))){ //연결통로(스트림) 생성
			
			while(true) {
				
				//데이터에 입력된 순서대로 readxxx() 메소드를 이용하여 읽어온 값을 위의 int, double 변수에 담고 출력
				//그후 avgS에 해당 학생의 avg 값 추가
				kor=dis.read();
				eng=dis.read();
				math=dis.read();
				sum=dis.read();
				avg=dis.readDouble();
				
				avgS+=avg;
				
				count++; 
				System.out.println(count+"번째 학생");
				System.out.println("국    영    수    총점    평균");
				System.out.println(kor+" "+eng+" "+math+" "+sum+" "+avg);
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		 catch(EOFException e) {
			 System.out.println("읽은 횟수     전체 평균");
			 System.out.println(count+"       "+avgS/count);
			 System.out.println("score.dat 파일 읽기 완료!");
		 }
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
