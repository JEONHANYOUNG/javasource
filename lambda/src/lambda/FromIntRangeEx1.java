package lambda;

import java.util.stream.IntStream;

public class FromIntRangeEx1 {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		// 1~100 합계
		// int sum = 0;
		// for(int i=1;i<100;i++) sum+=i;
		
		// 시작 값과 끝나는 값(1, 100)
		IntStream.rangeClosed(1, 100).forEach(i -> sum+=i);
		System.out.println(sum);
		
		
		
	
	
	}
}
