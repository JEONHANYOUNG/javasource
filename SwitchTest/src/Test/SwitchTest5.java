package Test;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// 사용자한테 숫자 2개 입력 받기
		// 연산자 입력받기(+,-,*,/,%)
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		int num2 = sc.nextInt();

		// 연산자 입력받기(+,-,*,/,%)
		System.out.println("연산자 입력받기(+,-,*,/,%)");
		// +/*=> '+' or "+"
		String op = sc.next();

		// switch(연산자)
		// 연산 후 계산 결과 출력
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
		// System.out.println("연산자를 확인해 주세요");
		// break;
		}
        System.out.printf("%d %s %d = %d", num1,op,num2,result);
	}

}
