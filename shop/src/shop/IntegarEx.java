package shop;

import java.util.Scanner;

public class IntegarEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		
		// 5=> "5"
		String input =sc.next();
		System.out.println(input+5); // + : 연결
	
		// "5" => 5 "o"=> NumberFormatException
		int num = Integer.parseInt(input); // 문자열 숫자를 숫자로 변경(외우기)
		System.out.println(num+5);
	}

}
