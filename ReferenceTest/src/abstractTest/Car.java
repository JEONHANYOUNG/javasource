package abstractTest;

/* �߻�Ŭ���� :
 * �߻� : ��ü���� ���� �����ϰ� ����� �κи��� ����� �ִ� �۾� , �߰�ȣ => ��üȭ �۾�
 * 
 * 
 * 
 */


public abstract class Car {
	
	//�������
	private String color;
	
	//������ 
	public Car(String color) {
		super();
		this.color = color;
	}
	
	//�Ϲ� �޼ҵ�
	public void start() {
		System.out.println("�ڵ��� ���");
		
	}
    
	//�߻� �޼ҵ�
	abstract void drive();
	abstract void stop();
	
}
