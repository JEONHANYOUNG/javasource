import java.util.Scanner;

// << >> <<< (shift ����)
// ����
// ���� : 1
// ��� : 2
// ������ : 3
// ���� = 1

// Ư��
// ���Ÿ� : 1 << 0
// ���� : 1 << 1
// ���� : 1 << 2
// Ư�� = (1<<0) + (1<<1) = ���Ÿ�+����

// 24�ð� = 1 << 0 :1
// ���� = 1 << 1 :2
// ���� = 1 << 2 :4
// �������� = 1 << 3 :8

// 24�ð�+���� =3
// ����+����  =6
// ect...

// ��κ� 2�׿���
// a > 2
// 1 + 2
// 1��(���׿���)
// !true(ex_ !d) (false�� �ٲ�)
// 3�׿���

public class OperatorMain {
	public static void main(String[] args) {

		int a = 3 << 2;
		System.out.println(a);

		Scanner k = new Scanner(System.in);

		System.out.println("�̸� : ");
		String name = k.next();

		// �̸��� ȫ�浿�̸� ��? ��!!! �ƴϸ� �������

		// String say2 = (name == "ȫ�浿") ? "��? ��!!!" : "�������";
		// System.out.println(say2);

		String say2 = (name.equals("ȫ�浿")) ? "��? ��!!!" : "�������";
		System.out.println(say2);

		System.out.print("���� : ");
		int age = k.nextInt();
		// 20�� �̻��̸� �ȳ��ϼ���, �ƴϸ� ����
		// 3�׿���
		// ���ǽİ� ���� �� ��, �ƴ� �� �� 3���� ��� ��

		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);

		// ���̰� ¦���� ¦, Ȧ���� Ȧ

		String oe = (age % 2 == 0) ? "¦" : "Ȧ";
		System.out.println(oe);

	}
}
