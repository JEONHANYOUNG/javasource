package Test;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// String position = "����";

		//position �Է� ���� �� �ݾ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		String Position = sc.next();
		
			
		// position ���� 700����, ���� 500����, ������ 300����
		switch (Position) {
		case "����":
			System.out.println("700����");
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
			break;
			
			

		}

	}

}
