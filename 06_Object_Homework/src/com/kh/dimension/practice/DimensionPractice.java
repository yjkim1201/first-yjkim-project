package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {

	public void practice3() {
		//3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		//�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� "(0,0)"�� ���� �������� ���� �� ����ϼ���.
		
	String[][] arr= new String[3][3]; //3�� 3�� ���ڿ� �迭 ���� �� �Ҵ�
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print("("+i+","+j+")");
				System.out.println();
				
			}
		}
	}
	
	public void practice1() {
		//4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1. 1~16���� ���� ���ʷ� �����ϼ���.
		//2. ����� ���� ���ʷ� ����ϼ���
		
		int[][] arr=new int[4][4];
		int value=1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=value++;
				System.out.printf("%-3d",arr[i][j]);
				
			}System.out.println();
		}
		
	}
	public void practice2() {
		//4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1. 1~16���� ���� �Ųٷ� �����ϼ���.
		//2. ����� ���� ���ʷ� ����ϼ���
	
		int[][] arr= new int[4][4];
		int value=16;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=value;
				value--;
				
				System.out.printf("%-3d", arr[i][j]);
			}
				System.out.println();
		}
	}
	
	public void practice4() {
		//4�� 4�� 2���� �迭�� �����ؼ� 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� �� �Ʒ� ����ó�� ó���ϼ���(����:2�����迭 �ǽ�����4��)
		int[][] arr= new int[4][4];
		
		int rowFinal=arr.length-1;
		int colFinal=arr[0].length-1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				if(i!=rowFinal&&j!=colFinal) {
					
					arr[i][j]=(int)(Math.random()*10)+1;
						
					arr[i][colFinal]+=arr[i][j];
					arr[rowFinal][j]+=arr[i][j];
					arr[rowFinal][colFinal]+=arr[i][j];
				}
				
				System.out.printf("%-3d", arr[i][j]);
			}
				System.out.println();
		}
			
	}
	public void practice5() {
		//2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է� �޵�, 1~10������ ���ڰ� �ƴϸ�
		//"�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�." ��� �� �ٽ� ������ �ް� �ϼ���.
		//ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
		//char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ�, 65�� A�� ��Ÿ���� 90�� Z�� ��Ÿ��, ���ĺ��� �� 26����
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("���� ũ�� �Է�: ");
		int row=sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� ũ�� �Է�: ");
		int col=sc.nextInt();
		sc.nextLine();
		
			if((row>=1&&row<=10)&&(col>=1&&col<=10)) {
		
				int[][] arr= new int[row][col];
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length;j++) {
						arr[i][j]=(int)(Math.random()*26+65);
					
						System.out.printf("%-3c",(char)arr[i][j]);
					}
						System.out.println();
				}
					
				
			}
		
			else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				}
			}
	}
	public void practice6() { 
		//�Ʒ��� �ʱ�ȭ�� ���ڿ� �迭�� ������ ������ ��->�� �帧�� �ƴ� ��->�� �帧�� ���� ������� ����ϼ���
		//�� print()�� ����ϰ� ����(" ")�� �����ϵ��� ����ϼ���.
		
		String[][] strArr=new String[][] {{"��","��","��","��","��"},{"��","��","��","��","��"},{"��","��","��","��","��"},
			{"��","��","��","��","��"},{"��","��","!","��","!!"}};
			
			for(int i=0; i<strArr.length;i++) {  //��
				for(int j=0; j<strArr[i].length;j++) {
					System.out.print(strArr[j][i]+" ");
			
				}
				
		}
	}
	public void practice7() {
		//����ڿ��� ���� ũ�⸦ �Է¹ް� �� ����ŭ �ݺ��� ���� ���� �ش� ���� ũ�⵵ �޾� ������ ���� �迭�� ���� �� �Ҵ��ϼ���
		//�׸��� �� �ε����� 'a'���� �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		Scanner sc=new Scanner(System.in);
		
		char[][] arr;  //������ �迭 ����
		char ch='a';   //������ ���� ����, �Ҵ�
	
		
		try {
			System.out.println("�� ũ�� �Է�: ");
			int row=sc.nextInt();
			sc.nextLine();
			arr=new char[row][]; //�� ũ�� �Է¹��� �� 2���� �迭�� �࿡ ����
			
				for(int i=0; i<arr.length; i++) {
					System.out.println(i+"�� ũ�� �Է�: "); //�� ���� ũ�� �Է¹ޱ�
					int col=sc.nextInt();
					sc.nextLine();
					
					arr[i]=new char[col];
				}  //��� �� ũ�� ���� �Ϸ�
			
				for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					arr[i][j]=ch++;
					}
				}
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length;j++) {
						System.out.print(arr[i][j]+" ");
					}	System.out.println();
				}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		/*System.out.println("���� ũ�� �Է�:");
		int row=sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<row;i++) {
			System.out.println(i+"���� ũ��: ");
				int result=sc.nextInt();
				sc.nextLine();
				
			String[][] arr=new String[i][result];
			arr[i][result]=
		}
		*/
		
	}
	public void practice8() {
		//1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ�ϰ�
		//3�� 2���� 2���� �迭 2���� �̿��Ͽ� �д��� ������ ����
		//1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
		
		String[] arr= {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		int value=0;
		
		String[][] sArr=new String[3][2];
		String[][] sArr2=new String[3][2];
		
		System.out.println("---1�д�---");
		
		for(int i=0;i<sArr.length;i++) {
			for(int j=0;j<sArr[i].length;j++) {
				sArr[i][j]=arr[value];
				value++;
				
				
				System.out.print(sArr[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("---2�д�---");
		
		for(int i=0;i<sArr2.length;i++) {
			for(int j=0;j<sArr2[i].length;j++) {
				sArr2[i][j]=arr[value];
				value++;
				
				System.out.print(sArr2[i][j]+" ");
			}
				System.out.println();
		}
	
	
	}
	public void practice9() {
		//�� �������� �ڷ� ��ġ�� ���� ���� �л� �̸��� �˻��ؼ� �ش� �л��� ��� �ڸ��� �ɾҴ��� ����ϼ���.
		//�˻��� �л� �̸��� �Է��ϼ���:
		//�˻��Ͻ� 000�л��� 0�д� 0��° �� ������(�Ǵ� ����)�� �ֽ��ϴ�. ->�������� ���
		Scanner sc=new Scanner(System.in);
		
		String[] arr= {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		int value=0;
		
		String[][] sArr=new String[3][2];
		String[][] sArr2=new String[3][2];
		
		System.out.println("---1�д�---");
		
		for(int i=0;i<sArr.length;i++) {
			for(int j=0;j<sArr[i].length;j++) {
				sArr[i][j]=arr[value];
				value++;
				
				
				System.out.print(sArr[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("---2�д�---");
		
		for(int i=0;i<sArr2.length;i++) {
			for(int j=0;j<sArr2[i].length;j++) {
				sArr2[i][j]=arr[value];
				value++;
				
				System.out.print(sArr2[i][j]+" ");
			}
				System.out.println();
		}
		
		System.out.println("==========================");
		System.out.println("�˻��� �л� �̸��� �Է��ϼ���: ");
		String name=sc.nextLine();
		
	
		for(int i=0; i<sArr.length;i++) {
			for(int j=0; j<sArr[i].length;j++) {
				if(name.equals(sArr[i][j])) {
					if(j<1) {
						System.out.println("�˻��Ͻ� "+name+" �л��� 1�д� "+(i+1)+"��° �� ���ʿ� �ֽ��ϴ�.");
				}
					else {
						System.out.println("�˻��Ͻ� "+name+" �л��� 1�д� "+(i+1)+"��° �� �����ʿ� �ֽ��ϴ�.");
					}
			}
		
				else if(name.equals(sArr2[i][j])) {
					if(j<1) {
						System.out.println("�˻��Ͻ� "+name+" �л��� 2�д� "+(i+1)+"��° �� ���ʿ� �ֽ��ϴ�.");
					}
					else {
						System.out.println("�˻��Ͻ� "+name+" �л��� 2�д� "+(i+1)+"��° �� �����ʿ� �ֽ��ϴ�.");
					}
		
				}
				//������� ��� �Ϸ�
			}
		
		}
	}
}

	 
	
	

