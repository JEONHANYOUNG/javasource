package abstractTest;

public class AiCar extends Car {

	public AiCar(String color) {
		super(color);

	}

	// �߻� Ŭ������ �߻�޼ҵ带 ������ �ְ� �Ʒ����� �ݵ�� ����
	@Override
	void drive() { //��üȭ
		System.out.println("��������");

	}

	@Override
	void stop() {
		System.out.println("�ڵ����� ����");

	}

}
