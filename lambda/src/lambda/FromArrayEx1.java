package lambda;

import java.util.Arrays;

public class FromArrayEx1 {
	public static void main(String[] args) {
		// 스트림: 자바 8부터 추가
		// 		  컬렉션의 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 도와주는 반복자
		//        필터링, 매핑과 같은 중간 처리가 가능함
		// 		  코드의 간결성 유지, 요소의 병렬 처리를 컬렉션 내부에서 알아서 처리
		// 		  스트림은 데이터 소스를 변경하지 않음(읽기만 함), 일회용
		
		// 스트림 연산 1) 중간 연산 : 연산의 결과가 스트림인 상태, 연속해서 또 다른 연산 실행
		//			 2) 최종 연산 : 연산의 결과가 스트림이 아닌 상태, 스트림의 요소를 소모했기 때문에 한 번만 가능
		// 	stream.distinct().limit(5).sorted().forEach(System.out::println) => forEach는 최종 결과를 보는 것
		
		String[] strArray = {"사과","바나나","딸기","포도","메론"};
	
		// 배열 -> stream 
		// 배열을 편리하게 사용할 수 있도록 제공되는 클래스 => Arrays
		
		// strArray에서 담긴 값을 하나씩 출력하는 방법 (stream 방법)
		Arrays.stream(strArray).forEach(str -> System.out.println(str));
	}
	
	
	
}
