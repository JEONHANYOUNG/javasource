package lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachEx1 {

	public static void main(String[] args) {
		// forEach(향상된 for문) : for문을 함수적 스타일로 사용 / 요소를 하나씩 꺼내기
		
		List<String> items = Arrays.asList("A","B","C","D","E");
		
		for (String item:items){
			System.out.println(item);
		}
		
		System.out.println();
		
		items.forEach(item -> System.out.println(item));
		
		System.out.println();
		
		// 간단한 방식
		items.forEach(System.out::println);
		
		
	
	}

}



