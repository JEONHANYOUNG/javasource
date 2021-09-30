package Test;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// String position = "과장";

		//position 입력 받은 후 금액 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("직급 입력 : ");
		String Position = sc.next();
		
			
		// position 부장 700만원, 과장 500만원, 나머지 300만원
		switch (Position) {
		case "부장":
			System.out.println("700만원");
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
			
			

		}

	}

}
