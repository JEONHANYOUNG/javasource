package Test;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// ��������� ���� 2�� �Է� �ޱ�
		// ������ �Է¹ޱ�(+,-,*,/,%)
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();

		// ������ �Է¹ޱ�(+,-,*,/,%)
		System.out.println("������ �Է¹ޱ�(+,-,*,/,%)");
		// +/*=> '+' or "+"
		String op = sc.next();

		// switch(������)
		// ���� �� ��� ��� ���
		int result = 0;
		
		switch (op) {
		case "+":
			result = num1 + num2; 
			// System.out.println(num1 + op + num2 + "=" + (num1 + num2));
			break;
		case "-":
			result = num1 - num2; 
			// System.out.println(num1 + op + num2 + "=" + (num1 - num2));
			break;
		case "*":
			result = num1 * num2; 
			// System.out.println(num1 + op + num2 + "=" + (num1 * num2));
			break;
		case "/":
			result = num1 / num2; 
			// System.out.println(num1 + op + num2 + "=" + (num1 / num2));
			break;
		case "%":
			result = num1 % num2; 
			// System.out.println(num1 + op + num2 + "=" + (num1 % num2));
			break;
		// default:
		// System.out.println("�����ڸ� Ȯ���� �ּ���");
		// break;
		}
        System.out.printf("%d %s %d = %d", num1,op,num2,result);
	}

}
