import java.util.Scanner;

// << >> <<< (shift 연산)
// 정렬
// 왼쪽 : 1
// 가운데 : 2
// 오른쪽 : 3
// 정렬 = 1

// 특성
// 이탤릭 : 1 << 0
// 굵게 : 1 << 1
// 밑줄 : 1 << 2
// 특성 = (1<<0) + (1<<1) = 이탤릭+굵게

// 24시간 = 1 << 0 :1
// 주차 = 1 << 1 :2
// 흡연실 = 1 << 2 :4
// 와이파이 = 1 << 3 :8

// 24시간+주차 =3
// 주차+흡연실  =6
// ect...

// 대부분 2항연산
// a > 2
// 1 + 2
// 1항(단항연산)
// !true(ex_ !d) (false로 바뀜)
// 3항연산

public class OperatorMain {
	public static void main(String[] args) {

		int a = 3 << 2;
		System.out.println(a);

		Scanner k = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = k.next();

		// 이름이 홍길동이면 어? 야!!! 아니면 어서오세요

		// String say2 = (name == "홍길동") ? "어? 야!!!" : "어서오세요";
		// System.out.println(say2);

		String say2 = (name.equals("홍길동")) ? "어? 야!!!" : "어서오세요";
		System.out.println(say2);

		System.out.print("나이 : ");
		int age = k.nextInt();
		// 20살 이상이면 안녕하세요, 아니면 나가
		// 3항연산
		// 조건식과 맞을 때 값, 아닐 때 값 3항을 써야 함

		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);

		// 나이가 짝수면 짝, 홀수면 홀

		String oe = (age % 2 == 0) ? "짝" : "홀";
		System.out.println(oe);

	}
}
