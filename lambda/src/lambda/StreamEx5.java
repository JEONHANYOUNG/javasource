package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamEx5 {

	public static void main(String[] args) {
		// �ߺ� �����ϴ� Ű����
		List<String> list = Arrays.asList("���","����","�ٳ���","���","����","����");
		
		// distinct : �ߺ� ����
		list.stream().distinct().forEach(System.out::println);
	}

}