package test;

//Scanner sc = new Scanner(System.in(Ű����));
//System.out(ȭ��)

import java.io.IOException;

public class WhileTest3 {

	public static void main(String[] args) throws IOException {

		boolean run = true;
		int KeyCode = 0, speed = 0;

		while (run) {
			//13->CR && 10->LF: ����(\r\N)
			if (KeyCode != 13 && KeyCode != 10) {
				System.out.println("======================");
				System.out.println("|1.���� | 2.���� | 3.����|");
				System.out.println("======================");
				System.out.print("���� : ");
			}

			KeyCode = System.in.read(); //Ű���忡�� �о�� �ž�!
			// 1=>49, 2=>50, 3=>51

			if (KeyCode == 49) {
				speed++;
				System.out.println("����ӵ� = " + speed);
			} else if (KeyCode == 50) {
				speed--;
				System.out.println("����ӵ� = " + speed);
			} else if (KeyCode == 51) {
				run = false;
			}
		}
			System.out.println("���α׷� ����");
		}
	}

