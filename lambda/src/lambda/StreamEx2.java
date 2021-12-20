package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","def","apple","melon","text");
		
		// 대문자로 변경하고 출력
//		List<String> upperList = new ArrayList<String>();
//		for (String str:list) {
//			System.out.println(str.toUpperCase());	
//		}
//		for (String str:upperList) {
//			System.out.println(str);	
//		}
		
		Stream<String> upper = list.stream().map(String::toUpperCase);
		upper.forEach(System.out::println);
	
	}
}
