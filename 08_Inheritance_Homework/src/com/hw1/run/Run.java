package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		//3���� �л� ������ ����� ��ü �迭�� �Ҵ��ϰ� ��뵥����(������ ����)�� �����Ͽ�
		//3���� �л� ��ü ���� �� �ݺ����� ���� ���
		Student[] s = new Student[3]; //��ü �迭 ����, �Ҵ�
		
		s[0]=new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�");
		s[1]=new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		s[2]=new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�");
		//��ü �迭�� �� ����
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].information());
		}
		
		//�ִ� 10���� ��� ������ ����� �� �ְ� ��ü �迭�� �Ҵ��ϰ�
		//�ݺ����� ����� Ű����� ��� ������ �Է� �޵��� ����
		Employee[] e = new Employee[10];
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		while(true) {
			
				
			System.out.println("�̸��� �Է��ϼ���: ");
			String name=sc.nextLine();
			
			System.out.println("���̸� �Է��ϼ���: ");
			int age=sc.nextInt();
			sc.nextLine();
		
			
			System.out.println("������ �Է��ϼ���: ");
			double height=sc.nextDouble();
			sc.nextLine();
			
			System.out.println("�����Ը� �Է��ϼ���: ");
			double weight=sc.nextDouble();
			sc.nextLine();
	
			System.out.println("�޿��� �Է��ϼ���: ");
			int salary=sc.nextInt();
			sc.nextLine();
			
			System.out.println("�μ��� �Է��ϼ���: ");
			String dept=sc.nextLine();
			
			e[count]=new Employee(name,age,height,weight,salary,dept);
			count++;
		
			System.out.println("���  �߰��Ͻðڽ��ϱ�? ");
			char answer=sc.nextLine().charAt(0);
			
			if(answer=='y') {
				continue;
			}
			else if(answer=='n') {
				break;
			}
			
	} //�Է� �Ϸ�
		
		for(int i=0; i<e.length;i++) {
			if(e[i]!=null) {
			System.out.println(e[i].information());
			}
			
			else {
			break;
			}
		}
	}
		
		
		
	

}
