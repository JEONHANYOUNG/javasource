package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		// ��ǻ�Ͱ� 1~100 ������ ������ ���Ƿ� ����
		// ����ڴ� ��ǻ�Ͱ� ������ �ִ� ���ڰ� ��������
		// �˾Ƹ��ߴ� ����

		// 0~99
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		do { 
		System.out.println("���ڸ� ���纸���� : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		if(input < answer) {
			System.out.println("�� �� ū ���� �Է��غ�����");
		}else {
			System.out.println("�� �� ���� ���� �Է��غ�����");
		}
		
		}while (input!=answer);
			System.out.println("�����Դϴ�!");
	}

}
