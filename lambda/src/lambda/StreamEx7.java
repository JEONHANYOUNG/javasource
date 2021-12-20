package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamEx7 {

	public static void main(String[] args) {
		// 중복 제거하는 키워드
		List<String> list = Arrays.asList("사과","딸기","바나나","사과","딸기","수박");
		
		// skip 
		list.stream()
			.skip(2) // 2개 건너뛰고
			.limit(3) // 스트림의 요소는 최대로 3개까지 처리
			.forEach(System.out::println);
	}

}
