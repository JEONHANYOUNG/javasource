package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		// int Ÿ���� ������ 10�� ���� �����ϰ� ����
		// int a=1, b=2, c=3, d=4, ....;
		
		// �迭(����Ÿ��) 1.heap�� ���� 2.null�� �� �� �ִ�
		// ����Ÿ���� Ư¡: /��/null/�ڵ� �ʱ�ȭ
		// ����: 0, �Ǽ�: 0.0, �Ҹ�: false
		int arr[]=new int[10];
		arr=new int[10]; // heap ����
		// ���� ��ҿ� ���� 0������ ����
		System.out.println(arr[0]);
		System.out.println(arr[9]);
		
		arr[3] = 90;
		arr[5] = 85;
		arr[7] = 65;
		//�迭 ��ü ��� ���
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr[9]);
		
		
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
