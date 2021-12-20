package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamEx5 {

	public static void main(String[] args) {
		// 중복 제거하는 키워드
		List<String> list = Arrays.asList("사과","딸기","바나나","사과","딸기","수박");
		
		// distinct : 중복 제거
		list.stream().distinct().forEach(System.out::println);
	}

}
