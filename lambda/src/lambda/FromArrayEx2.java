package lambda;

import java.util.Arrays;

public class FromArrayEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// stream을 쓰는 이유로는 sum(연산들을 설정 해두었기 때문에)이 있기 때문에 
		int sum = Arrays.stream(arr).sum();	
		long count = Arrays.stream(arr).count();
	
		System.out.println("배열 합계 "+sum);
		System.out.println("배열 개수 "+count); // arr.length
	}

}
