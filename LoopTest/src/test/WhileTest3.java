package test;

//Scanner sc = new Scanner(System.in(키보드));
//System.out(화면)

import java.io.IOException;

public class WhileTest3 {

	public static void main(String[] args) throws IOException {

		boolean run = true;
		int KeyCode = 0, speed = 0;

		while (run) {
			//13->CR && 10->LF: 엔터(\r\N)
			if (KeyCode != 13 && KeyCode != 10) {
				System.out.println("======================");
				System.out.println("|1.종속 | 2.감속 | 3.중지|");
				System.out.println("======================");
				System.out.print("선택 : ");
			}

			KeyCode = System.in.read(); //키보드에서 읽어올 거야!
			// 1=>49, 2=>50, 3=>51

			if (KeyCode == 49) {
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if (KeyCode == 50) {
				speed--;
				System.out.println("현재속도 = " + speed);
			} else if (KeyCode == 51) {
				run = false;
			}
		}
			System.out.println("프로그램 종료");
		}
	}

