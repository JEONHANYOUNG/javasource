package lambda;

import java.util.Arrays;

public class FromArrayEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// stream�� ���� �����δ� sum(������� ���� �صξ��� ������)�� �ֱ� ������ 
		int sum = Arrays.stream(arr).sum();	
		long count = Arrays.stream(arr).count();
	
		System.out.println("�迭 �հ� "+sum);
		System.out.println("�迭 ���� "+count); // arr.length
	}

}
