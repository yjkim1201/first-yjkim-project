package com.kh.second;

//com.kh.second.MethodTest
public class MethodTest { //MethodTest Ŭ���� ���� ����
/*
 * �� Ŭ���� ���� �������� �޼ҵ带 ���� �� ����
 * ������ ���� �޼ҵ带 ������ �ʿ䰡 ����
 */
	
 public void testPrintA() {
	 
	 //�� �޼ҵ尡 ����Ǵ� ���� ����� ����
	System.out.println("testPrintA �޼ҵ� ����");
	
	testPrintB();
 }
	
public void testPrintB() {
	System.out.println("testPrintB �޼ҵ� ����");
	
	testPrintC();	
}
 
public void testPrintC() {
	System.out.println("testPrintC �޼ҵ� ����");
	
	//testPrintA();
	
	//����, testPrintC �޼ҵ忡�� testPrintA�� ȣ���� ��� ���� �ݺ��ȴ�.
    //������:
	//���α׷� ����
	//testPrintA �޼ҵ� ����
	//testPrintB �޼ҵ� ����
	//testPrintC �޼ҵ� ����
	//testPrintA �޼ҵ� ����
	//....
	//[�������̽�] �� ��� ���ѹݺ����� ����� ����Ǵٰ� StackOverflowError��� ���� �߻�
	//  (�޸𸮰� ���̻� ��Ƽ�� ���ϰ� ���η� ����)
	//Stack �� �޸� ������ �� ���� �� �ϳ�, Stack�� ũ�⸦ ��� ��� ���� �߻�

}


} //MethodTest Ŭ���� ���� ��


