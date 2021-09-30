package Test;

import java.util.Scanner;

public class SwitchTest6 {
	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		Scanner sc = new Scanner(System.in);
			
		// 상대방-컴퓨터
		// 랜덤 1~3 자동으로 생성 => 3
		int computer = (int)(Math.random()*3)+1;
		
		//내가 내는 부분 - 입력 => 2
	    System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
		int user = sc.nextInt();
		
		//출력문 당신이 졌습니다./당신이 이겼습니다./비겼습니다.
        System.out.println("나 : "+user+", 컴퓨터 : "+computer);
	    
		switch (user-computer){ // 3-2, 2-1,    
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
	}
}
