package afterschool;

// �ڵ����� Ÿ�̾��	
// �ڵ����� Ÿ�̾ ������ �ִ�.

public class Car {
//has-a 
	Tire frontLeftTire = new Tire(6, "�� ����");
	Tire frontRightTire = new Tire(4, "�� ������");
	Tire backLeftTire = new Tire(3, "�� ����");
	Tire backRightTire = new Tire(4, "�� ������");

// �޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		// if(!frontLeftTire.roll())        (frontLeftTire.roll()!=true
		if (!frontLeftTire.roll()) { //if(frontLeftTire.roll())  frontLeftTire.roll()==true
			stop();
			return 1;
		}if (!frontRightTire.roll()) {
			stop();
			return 2;
		}if (!backLeftTire.roll()) {
			stop();
			return 3;
		}if (!backRightTire.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
