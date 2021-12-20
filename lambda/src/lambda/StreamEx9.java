package lambda;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx9 {
	public static void main(String[] args) {
		// 최종연산 : forEach, collect, count, sum, average, max, min, findFirst...
		IntStream stream = Arrays.stream(new int[] {1,2,3,4,5});
		
		// 짝수의 갯수 출력
//		long count = stream.filter(i -> i%2==0).count();
//		System.out.println("짝수 개수 "+count);
	
		
		// java.lang.IllegalStateException: stream has already been operated upon or closed
		// 2의 배수 합
//		long sum = stream.filter(i -> i%2==0).sum();
//		System.out.println("짝수 합 : "+sum);
		
		//평균 : 값이 있으면 저장하고 없으면 하지말고, 할꺼면 하고 안할꺼면 하지마
//		OptionalDouble average = stream.filter(i -> i%2==0).average();
//		System.out.println("짝수 평균 : "+average);

		// 최댓값
//		OptionalInt max = stream.filter(i -> i%2==0).max();
//		System.out.println("짝수 최댓값 : "+max);
		
		// 최솟값
//		OptionalInt min = stream.filter(i -> i%2==0).min();
//		System.out.println("짝수 최솟값 : "+min);

		// findfirst
		OptionalInt first = stream.filter(i -> i%2==0).findFirst();
		System.out.println("짝수 첫번째 값 : "+first);

	
	
	}
}
