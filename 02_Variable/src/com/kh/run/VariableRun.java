package com.kh.run;
import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_Printf;

public class VariableRun {

	public static void main(String[] args) {
		
		//A_Variable �̶�� Ŭ������ printSalary ��� �żҵ带 ȣ���Ϸ� �Ѵ�.
		
		//1�ܰ� : �ش� Ŭ������ �뺯�� �̸��� �����(new)
		A_Variable a = new A_Variable();
		
		//2�ܰ� : import �ϱ�

		//3�ܰ�: ȣ��
		
		//a.printSalary();
		//a��� �뺯�� �̸��� ������ ���� �����̱� ������ ��Ȱ���� �����ϴ�.
		//3�ܰ�: ȣ��
		
		//a.declareVariable();
		
		//a.initVariable();
		
		//a.constant();
		
		//B_KeyboardInput Ŭ������ inputTest1 �޼ҵ带 ȣ��
		B_KeyboardInput b=new B_KeyboardInput();
		//b.inputTest1();
		//b.inputTest2();
		//b.inputTest3();
		
		C_Cast c=new C_Cast();
		//c.autoCasting();
		//c.forceCasting();
		
		D_Printf d = new D_Printf();
		d.printfTest();
		
		
		
	}
	
	
}
