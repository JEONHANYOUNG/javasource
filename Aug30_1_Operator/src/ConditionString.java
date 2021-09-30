import java.util.Scanner;

// 마트
// 가격 :
// ------------
// 0000원어치 구매함
// 10000원 이상 구매시 보너스포인트 50점 더 

// 흐름 제어
// 조건문
// 반복문
// 조건문 : 특정 조건 때만 흐름이 이어지도록

public class ConditionString {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("가격 : ");
		int price = k.nextInt();
		System.out.println("-----");
		System.out.printf("%d원어치 구매\n", price);
		// 흐름 제어
		// 조건문
		// 반복문
		// 조건문 : 특정 조건 때만 흐름이 이어지도록
		// if
		// switch
		int point = price / 100;
		if (price >= 10000) {
			point += 50;		
			}
		if ((price > 20000) && (price < 50000)) 
			point += 100;	
		
		else {
			point +=10;
		}
		
		System.out.printf("적립 포인트 : %d\n", point);

	

		}
	}
	
