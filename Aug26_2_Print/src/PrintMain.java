// ���� 1.8.0-302
// 1 : major
// 8.0-302 : minor
// ���ڸ��� �ٲ���� ����
// major������ �ٲ� : �ٸ� ���α׷�

//

public class PrintMain {
	// ��� �ڵ�� �� ������

	public static void main(String[] args) {
		// ����� �� �͸� ����

		// �ܼ�â�� ���
		System.out.print("������ �������� ��� �����ٵ�");
		// �ܼ�â�� ����ϰ� ���� �� �ٲ�
		System.out.println("�� ã�ƺ����� 00��");
		// ������ �����ϸ鼭 �ܼ�â�� ���
		System.out.printf("%.1f", 45.1156423);
		System.out.println();
		///////////////////////////
		// Ư������
		// 	   \n - new line
		// 	   \r - carriage return
		// 	   \r\n - �ϼ��� �ٹٲ�
		// 	   \n�� �־ �˾Ƽ� �ٹٲ��� �ϼ��Ǵ� ���α׷��� ����
		// 	   \t - tab
		// 	   \b - 
		System.out.println("����"); // �п� �ö� �� Ÿ�� �Դ��� ���
		System.out.println("\1200"); // ����� �� \2000
		System.out.println("��\n��");
		System.out.println("��  :\t�д�");
		System.out.println("���� :\t�л�");
	    System.out.println("������\b");
	}
}
