package lambda;

public class LamdaEx5 {
	// �Ű������� �����ϴ� ���ٽ�
	public static void execute(LamdaTest5 lambda) {
		lambda.run();
	}
	
	//��ȯ ������ ���̴� ���ٽ�
	public static LamdaTest5 getRun() {
		LamdaTest5 obj1 = () -> System.out.println("�Լ��� �������̽� ����");
		return obj1;
	}
	
	public static void main(String[] args) {
		//���ٽ�
		LamdaTest5 lambda = () -> System.out.println("Lamda!!!! run");
		lambda.run();
		
		System.out.println("--------------------------");
		execute(getRun());
		System.out.println("--------------------------");
	
	}
	
	
}
