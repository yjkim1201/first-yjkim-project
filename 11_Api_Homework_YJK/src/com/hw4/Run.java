package com.hw4;

import java.util.Scanner;
import com.hw4.controller.EmpTest;
import com.hw4.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		EmpTest et=new EmpTest();
		
		et.setEmp();
		
		System.out.println("--------정렬 이전---------");
		
		et.printEmp();
		
		System.out.println("--------정렬 이후---------");
		
		//nameSortPrint() 메소드를 통해 이름을 오름차순으로 정렬
		et.nameSortPrint();
		
		System.out.println("--------나이 기준 오름차순 정렬 이후---------");
		//et.ageSortPrint();
	}

}
