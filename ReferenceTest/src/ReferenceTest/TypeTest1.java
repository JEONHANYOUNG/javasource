package ReferenceTest;

public class TypeTest1 {

	public static void main(String[] args) {
		// Ÿ�� - 1)�⺻Ÿ�� 2)����Ÿ��
		// ������ �޸𸮰� ���Ǵ� ����� �޶���

		// �⺻ Ÿ���� ����(stack ���� �ȿ� ���� �ȴ�)
		int age = 25;
		double price = 200.3;
		
		// ���� Ÿ���� ����(heap ���� �ȿ� ���� �ȴ�)/null �ʱ�ȭ ����
		// ���ڿ� ���� : String name= new String("java")
		String name = "java";
		String name2 = new String("java");
		String hobby = null; //���� heap ������ �Ҵ���� ���� ���� �ǹ�
		
		// �� �� ==, !=
		// But, String �� �� equals();
		
		System.out.println(name==name2 ? "������" : "�ٸ�");
		System.out.println(name.equals(name2) ? "������" : "�ٸ�");
		System.out.println(hobby);
		//java.lang.NullPointerException ������ ���� ���� ���� ��Ȳ
		//�⺻ Ÿ���� ����� ������ ��û���� ���� ���� ����
		//���ߴ� ��Ȳ
		//��� ������ ������ �˷��ش�
		
		System.out.println(hobby.length());
	}

}
