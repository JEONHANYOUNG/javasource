package exception;
// Exception(���ܻ���)
// CheckedException : compile �� ��Ÿ���� ����
// UnCheckedException : run Ÿ�ӽ� ��Ÿ���� ����
public class CheckedException {

	public static void main(String[] args)  { // <- �������� �߻��� �� ù��° ���  (throws ClassNotFoundException)
		//ClassNotFoundException
		try {// <- �������� �߻��� �� en��° ���
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
