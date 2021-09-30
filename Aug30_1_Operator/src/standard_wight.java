import java.util.Scanner;

public class standard_wight {
	public static void main(String[] args) {

		// 키보드 입력받을 준비

		// 제목 하나
		// 이름받기
		// 키받기
		// 몸무게받기
		// 줄하나
		// 표준체중계산
		// 비만도계산
		// 결과판정
		// 결과출력

		Scanner k = new Scanner(System.in);

		System.out.println("비만도 검사기");

		System.out.println("이름 : ");
		String name = k.next();

		System.out.println("키 : ");
		double height = k.nextDouble();

		System.out.println("몸무게 : ");
		double weight = k.nextDouble();

		System.out.println("-------------------");

		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight /  stdWeight) * 100;
		
		System.out.println(stdWeight);
		System.out.println(bimando);
		
		String result = (bimando > 120) ? "비만" : "노비만";
		System.out.printf("표준체중 : %.2fkg\n", stdWeight);
		System.out.printf("비만도 : %.2fkg\n", bimando);
		System.out.printf("%s씨는 %s\n", name, result);
		
		System.out.println("끄고 싶으면 뭐라도 쳐요");
		String t = k.next();
		
	}
}
