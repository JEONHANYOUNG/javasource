package ClassTest;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		
		//�޼ҵ� ȣ��� ���ϵǴ� ���� �ִ� ���
		//print() �ϱ�
		System.out.print(obj.isRedirect());
		//���ϵǴ� �� �ޱ� --->�̰� �� ���� ���
		boolean result=obj.isRedirect();
		//result�� �̿��ؼ� �ڵ� �ۼ�
		
		int var1=obj.num();
	
		System.out.println(obj.add(25, 35));
	}

}
