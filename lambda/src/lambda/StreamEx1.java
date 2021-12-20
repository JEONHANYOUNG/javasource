package lambda;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		// 중간 연산 : 자르기(skip(), limit()), 걸러내기(Filter(),distinct()), 정렬(sorted()), 변환(map()),
		//   		조회(peek())
		
		//File 객체를 stream으로 생성하기
		Stream<File> stream = Stream.of(new File("file1.txt"),new File("file2.txt"),
				new File("file3.txt"),new File("file4.txt"));
		
//		File f = new File("file1.txt");
//		f.getName();
		
		// map : 스트림의 요소에 저장된 값 중에서 원하는 필드만 추출하거나 특정 형태로 변환 시 사용
		Stream<String> fileNames = stream.map(File::getName);
		fileNames.forEach(f -> System.out.println(f));
		
		
		
	}
}

