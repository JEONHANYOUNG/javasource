package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamEx7 {

	public static void main(String[] args) {
		// �ߺ� �����ϴ� Ű����
		List<String> list = Arrays.asList("���","����","�ٳ���","���","����","����");
		
		// skip 
		list.stream()
			.skip(2) // 2�� �ǳʶٰ�
			.limit(3) // ��Ʈ���� ��Ҵ� �ִ�� 3������ ó��
			.forEach(System.out::println);
	}

}
