package test;

import java.util.Scanner;

public class Exam3 {

	private static final int KeyCode = 0;

	public static void main(String[] args) {
		boolean run = true;
		
		//�ܾ�
		//1 ����: ��������� ���ݾ��� �Է¹ޱ� => balance�� �߰��ϱ�
		//2 ����: ��������� ��ݾ��� �Է¹ޱ� => balance�� �����ϱ�
		//3 ����: balance ��� 
		//4 ����: run = false ���� �� ���α׷� ���� 
		int balance = 100000;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("*****************************");
			System.out.println("1.���� | 2.���| 3.�ܰ� | 4.����");
			System.out.println("*****************************");
			System.out.print("���� >>>>     ");
			int num = sc.nextInt();
			if(num == 1) {
				int num2 = sc.nextInt();
				System.out.printf("%d",balance+num2);	
			}else if(num == 2) {
			 int num2 = sc.nextInt();
				System.out.printf("%d",balance-num2);	
			}
			else if(num == 3) {
				
				System.out.println("�ܾ� >> "+balance);	
			}else	if (num == 4) {
				System.out.println("�ý��� ����");	
				break;
		}
			
		}

	}

}
