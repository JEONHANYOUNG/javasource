package test;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		// ��������� �������� �ܼ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� �� �Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			// System.out.println(num"* "+i+" = "+(num*i));
			System.out.printf("%d * %d = %d\t", num, i, (num * i));
		}

	}

}
