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
		int num=0; //�л��� ������ ����
		
		//try~ with resource �������� "score.dat"���Ͽ� ����ǰ� DataOutputStream�� FileOutputStream ����
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("score.dat"))){
			
			while(true) {
				System.out.println("=====������ �������� �Է��Ͻÿ�=====");
				
				System.out.println("����: ");
				int kor=sc.nextInt();
				sc.nextLine();
				
				System.out.println("����: ");
				int eng=sc.nextInt();
				sc.nextLine();
				
				System.out.println("����: ");
				int math=sc.nextInt();
				sc.nextLine();
				
				int sum=(kor+eng+math);
				double avg=(kor+eng+math)/3;
				//���� �����͵� ������� ���Ͽ� ���
				
				dos.write(kor);
				dos.write(eng);
				dos.write(math);
				dos.write(sum);
				dos.writeDouble(avg); //double Ÿ�� ��½� writeDouble ���
				
				num++; //�л� �� ī��Ʈ
				System.out.println(num+"��° �л� ���� ���");
				System.out.println("��� �����Ͻðڽ��ϱ�? (y/n): ");
				char answer=sc.nextLine().toLowerCase().charAt(0);
				
				if(answer=='n') { //n �Է� �� �Ʒ� ���� ��� �� �ݺ��� ����������
					System.out.println("score.dat ���Ͽ� ���� �Ϸ�");
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
		double avg=0.0, avgS=0.0; //avgS : ��� �л����� ���� ����� ���ϴ� ����
		
		int count=0; //�� ���� �л�����
		
		try(DataInputStream dis=new DataInputStream(new FileInputStream("score.dat"))){ //�������(��Ʈ��) ����
			
			while(true) {
				
				//�����Ϳ� �Էµ� ������� readxxx() �޼ҵ带 �̿��Ͽ� �о�� ���� ���� int, double ������ ��� ���
				//���� avgS�� �ش� �л��� avg �� �߰�
				kor=dis.read();
				eng=dis.read();
				math=dis.read();
				sum=dis.read();
				avg=dis.readDouble();
				
				avgS+=avg;
				
				count++; 
				System.out.println(count+"��° �л�");
				System.out.println("��    ��    ��    ����    ���");
				System.out.println(kor+" "+eng+" "+math+" "+sum+" "+avg);
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		 catch(EOFException e) {
			 System.out.println("���� Ƚ��     ��ü ���");
			 System.out.println(count+"       "+avgS/count);
			 System.out.println("score.dat ���� �б� �Ϸ�!");
		 }
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
