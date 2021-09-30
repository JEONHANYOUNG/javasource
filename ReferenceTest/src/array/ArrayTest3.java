package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40
		int score[] = {0, 10, 20, 30, 40};
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}
		// String 타입의 배열 5개 생성
		// 과일 이름으로 초기화 시키기
		
		String fruit[] = {"plum", "melon", "grape", "banana"};
		for (int i=0;i<fruit.length;i++) {
			System.out.print(fruit[i]+"\n");
		}
		
		}
		
	}


