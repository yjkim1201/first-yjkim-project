package com.hw4;

import java.util.Scanner;
import com.hw4.controller.EmpTest;
import com.hw4.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		EmpTest et=new EmpTest();
		
		et.setEmp();
		
		System.out.println("--------���� ����---------");
		
		et.printEmp();
		
		System.out.println("--------���� ����---------");
		
		//nameSortPrint() �޼ҵ带 ���� �̸��� ������������ ����
		et.nameSortPrint();
		
		System.out.println("--------���� ���� �������� ���� ����---------");
		//et.ageSortPrint();
	}

}
