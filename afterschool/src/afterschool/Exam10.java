package afterschool;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// int Ÿ���� 5���� �����ϴ� �迭 ����
		int arr[] = new int[5];

		// �迭�� �ʱ�ȭ�� ���� ����ڷκ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ���");

		// System.out.println("ù��° ���� �Է�");
		// arr[0]=sc.nextInt();
		// int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է�");
			arr[i] = sc.nextInt();

		}
		System.out.println();

		// �Է¹��� �� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();
		
		//����
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
	
			sum+=arr[i];
									
		}
		System.out.print("����: "+ sum);

		System.out.println();
		
		//���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.printf("���� : %d, ��� : %d",sum,sum/arr.length);
		
		
		
	}
}
