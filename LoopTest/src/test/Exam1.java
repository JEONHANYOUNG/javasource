package test;

public class Exam1 {

	public static void main(String[] args) {
		// �ֻ��� �� �� ������
		// ������ �ֻ��� �� ��� (1,4)
		
		// �ֻ��� ���� �հ谡 5�� �ƴϸ� �ֻ����� ��� ������
		// 5�� �Ǹ� ������ �����.
		
		while (true) {
		int num = (int)(Math.random()*6)+1;
		int sum = (int)(Math.random()*6)+1;
		System.out.printf("%d, %d\n",num,sum);
		if (num+sum == 5) {
			break;
		}
		
		}
		

	}

}
