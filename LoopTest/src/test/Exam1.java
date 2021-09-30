package test;

public class Exam1 {

	public static void main(String[] args) {
		// 주사위 두 개 던지기
		// 나오는 주사위 눈 출력 (1,4)
		
		// 주사위 눈의 합계가 5가 아니면 주사위를 계속 던지고
		// 5가 되면 실행을 멈춘다.
		
		while (true) {
		int num = (int)(Math.random()*6)+1;
		int sum = (int)(Math.random()*6)+1;
		System.out.printf("%d, %d\n",num,sum);
		if (num+sum == 5) {
			break;
		}
		
		}
		

	}

}
