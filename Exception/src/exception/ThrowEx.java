package exception;

public class ThrowEx {
    // main ���� throws �� �ǹ� : jvm ���� �������� �ǹ�
	public static void main(String[] args) /* throws ClassNotFoundException */ {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// throw : ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");

	}
}
