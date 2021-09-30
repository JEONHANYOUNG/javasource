package test;

import java.util.Scanner;

public class Exam3 {

	private static final int KeyCode = 0;

	public static void main(String[] args) {
		boolean run = true;
		
		//잔액
		//1 선택: 사용자한테 예금액을 입력받기 => balance에 추가하기
		//2 선택: 사용자한테 출금액을 입력받기 => balance에 차감하기
		//3 선택: balance 출력 
		//4 선택: run = false 변경 후 프로그램 종료 
		int balance = 100000;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("*****************************");
			System.out.println("1.예금 | 2.출금| 3.잔고 | 4.종료");
			System.out.println("*****************************");
			System.out.print("선택 >>>>     ");
			int num = sc.nextInt();
			if(num == 1) {
				int num2 = sc.nextInt();
				System.out.printf("%d",balance+num2);	
			}else if(num == 2) {
			 int num2 = sc.nextInt();
				System.out.printf("%d",balance-num2);	
			}
			else if(num == 3) {
				
				System.out.println("잔액 >> "+balance);	
			}else	if (num == 4) {
				System.out.println("시스템 종료");	
				break;
		}
			
		}

	}

}
