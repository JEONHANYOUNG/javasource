import java.util.Scanner;

public class standard_wight {
	public static void main(String[] args) {

		// Ű���� �Է¹��� �غ�

		// ���� �ϳ�
		// �̸��ޱ�
		// Ű�ޱ�
		// �����Թޱ�
		// ���ϳ�
		// ǥ��ü�߰��
		// �񸸵����
		// �������
		// ������

		Scanner k = new Scanner(System.in);

		System.out.println("�񸸵� �˻��");

		System.out.println("�̸� : ");
		String name = k.next();

		System.out.println("Ű : ");
		double height = k.nextDouble();

		System.out.println("������ : ");
		double weight = k.nextDouble();

		System.out.println("-------------------");

		double stdWeight = (height - 100) * 0.9;
		double bimando = (weight /  stdWeight) * 100;
		
		System.out.println(stdWeight);
		System.out.println(bimando);
		
		String result = (bimando > 120) ? "��" : "���";
		System.out.printf("ǥ��ü�� : %.2fkg\n", stdWeight);
		System.out.printf("�񸸵� : %.2fkg\n", bimando);
		System.out.printf("%s���� %s\n", name, result);
		
		System.out.println("���� ������ ���� �Ŀ�");
		String t = k.next();
		
	}
}
