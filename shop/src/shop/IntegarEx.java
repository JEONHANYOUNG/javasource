package shop;

import java.util.Scanner;

public class IntegarEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���.");
		
		// 5=> "5"
		String input =sc.next();
		System.out.println(input+5); // + : ����
	
		// "5" => 5 "o"=> NumberFormatException
		int num = Integer.parseInt(input); // ���ڿ� ���ڸ� ���ڷ� ����(�ܿ��)
		System.out.println(num+5);
	}

}
