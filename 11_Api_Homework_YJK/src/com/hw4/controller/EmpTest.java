package com.hw4.controller;

import com.hw4.model.vo.Employee;

public class EmpTest {

	//Employee[]��� ��ü �迭�� 5���� ��� ��, ����, �޿�, ������ ����Ѵ�. ���� ��� ��, ����, �޿�, ������ �̸� ������ ����Ѵ�.
	
	private Employee[] empArr;
	
	public EmpTest() {
		
	}
	
	
	public void setEmp() {
		empArr = new Employee[5];
		
		empArr[0]=new Employee("������",24,1500000,1.245);
		empArr[1]=new Employee("��Ҷ�",40,2500000,1.4);
		empArr[2]=new Employee("�ݰ���",22,1780000,1.3);
		empArr[3]=new Employee("�����",31,1950000,1.365);
		empArr[4]=new Employee("ȫ�߶�",34,1650000,1.212);
	}
	
	public void printEmp() {
		
		for(int i=0; i<empArr.length; i++) {
			System.out.println(empArr[i]);
		}
	}
		public void nameSortPrint() {
			
			//for(int i=0;i<empArr.length;i++) {
			//empArr[i].getName().compareTo() &&&&
		    //}
			
			
			//����: �������� �����͸� ���� ��Ģ�� ���� ���ʴ�� ����(sort)
			//��������: ���� ��-> ū ������� �����ϰڴ�.(1 2 3 4 5/ �� �� �� �� / a b c d)
			//��������: ū ��-> ���� ������� �����ϰڴ�.
			
			/*
			 * * ��ǥ���� ���� ���: ��������(���� ����, ��ȿ������ ���)
			 * => ������ �� ���ϴ� ����
			 * => �� �õ����� ���� ���ڸ����� �������� ������ �̷������.
			 * => �� �õ����� �ݺ��Ǵ� Ƚ���� 1�� �����Ѵ�.
		 	 * => �� ó�� �ݺ��� ���Ĵ�󰳼� - 1 ��ŭ �̷������.
		     */
			
			for(int i=0; i<empArr.length -1; i++) { //�ϴ� ũ�� �迭ũ��-1��ŭ �ݺ��ϰڴ�.
				
				for(int j=0; j<empArr.length -1 -i; i++) {//�Ź� 4 3 2 1��ŭ �ݺ������ڴ�.
					                                   //=>�Ź� �ݺ� ���������� ���ǽ� �κп��� 1�� �� ����� ��
					//���� ���� �� ũ�Ⱑ ũ�ٸ� �ڸ� �ٲ� / �ƴϸ� ŵ
					if(empArr[j].getName().compareTo(empArr[j+1].getName())>0) {//�� ũ�ٸ� �ڸ� �ٲ��ֱ�
						
						//�ӽ�����Ҹ� �ϳ� ���� �ű⿡ ��� ����=>�ٲ�ġ�� �뵵
						Employee tmp=empArr[j];
						
						empArr[j] = empArr[j+1];
						empArr[j+1] = tmp;
					}
					
				}
			}
			
			//��� �� ������ �����ߴ� == ������ ������������ �� �̷������.
			//������ ���� �޼ҵ� ��Ȱ��
			printEmp();
	}

		//���� �������� ��������
		public void ageSortPrint() {
			for(int i=0; i<empArr.length -1; i++) {//�ϴ� 4�� ����
				for(int j=0; j<empArr.length -1-i; j++) { //4 3 2 1 ������ �����ڴ�.
					
					if(empArr[j].getAge()>empArr[j+1].getAge()) {//���� ���� �� ũ�ٸ� �ڸ��� �ٲٰڴ�.
						
						Employee temp=empArr[j];
						empArr[j]=empArr[j+1];
						empArr[j+1]=temp;
					}
				}
			}
			printEmp();
			
		}
		
}