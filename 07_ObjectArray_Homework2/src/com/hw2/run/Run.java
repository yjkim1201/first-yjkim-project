package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Student[] arr=new Student[10]; //10���� ������ ����� �� �ִ� ��ü �迭 �Ҵ�
		
		int count=0;
		
		while(true) {
			
			System.out.println("�г��� �Է��ϼ���: ");
			int grade=sc.nextInt();
			sc.nextLine();
			
			System.out.println("���� �Է��ϼ���: ");
			int classroom=sc.nextInt();
			sc.nextLine();
			
			System.out.println("�̸��� �Է��ϼ���: ");
			String name=sc.nextLine();
			
			System.out.println("���������� �Է��ϼ���: ");
			int kor=sc.nextInt();
			sc.nextLine();
			
			System.out.println("���������� �Է��ϼ���: ");
			int eng=sc.nextInt();
			sc.nextLine();
			
			System.out.println("���������� �Է��ϼ���: ");
			int math=sc.nextInt();
			sc.nextLine();
			
			arr[count]=new Student(grade, classroom, name, kor, eng, math);
			count++;
			
			System.out.println("��� �߰��Ұǰ���?");
			char answer=sc.nextLine().charAt(0);
			
			if(answer=='y'||answer=='Y') {
				continue;
			}
			else if(answer=='n'||answer=='N'){
				
			
			for(int i=0; i<arr.length;i++) {
			
				if(arr[i]!=null) {
				System.out.println(arr[i].information());
				}
				else {
					break;
				}
			}
			return;
			}
		}
		
		
	}

}
