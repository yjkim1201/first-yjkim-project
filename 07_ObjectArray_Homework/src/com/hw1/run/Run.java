package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
 Employee[] emp=new Employee[3];  //��ü �迭 3���� �Ҵ�, emp[]���� null
 
 emp[0]=new Employee();
 
 emp[1]=new Employee(1, "ȫ�浿", 19, 'M', "01022223333", "���� ���");
 
 emp[2]=new Employee(2,"������","������", "����",20,'F',1000000,0.01,"01011112222","���� ����");		
		
for(int i=0;i<emp.length; i++) {
	System.out.println("emp["+i+"] : "+emp[i].information());
}
	System.out.println("===============================");	
		
		
	emp[0]=new Employee(0,"�踻��","������","����",30,'M',3000000, 0.2, "01055559999","���� ����");
	emp[1].setDept("��ȹ��");
	emp[1].setJob("����");
	emp[1].setSalary(4000000);
	emp[1].setBonusPoint(0.3);
	
		System.out.println("emp[0]: "+emp[0].information());
		System.out.println("emp[1]: "+emp[1].information());
		System.out.println("===============================");	
	
	int sum=0;
	int count=0;
	
		for(int i=0;i<emp.length; i++) {
		  //���ʽ� ����� ����
	System.out.println(emp[i].getEmpName()+"�� ���� : "+(int)((emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12)+"��");
	sum+=(int)((emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12);
		count++;
		}
		
		System.out.println("===============================");	
		System.out.println("�������� ������ ��� : "+(sum/count)+"��");
		
	}

}
