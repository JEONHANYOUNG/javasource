package afterschool;

public class CarEx {

	public static void main(String[] args) {
		Car car =new Car();
		
		for (int i=1;i<6;i++) {
			int problemLocation = car.run();
			
			
			switch (problemLocation) {
			case 1: // �� ����
				System.out.println("�� ���� ��ũ - �ѱ�Ÿ�̾� ��ü");
				// �� ���� Ÿ�̾� ��ü
				car.frontLeftTire = new HankookTire(15, "�� ����");
				break;
			case 2: // �� ������
				car.frontRightTire =new HankookTire(10, "�� ������ - ��ȣŸ�̾� ��ü");
				System.out.println("�� ���� ��ũ");
				break;
			case 3: // �� ����
				System.out.println("�� ���� ��ũ");
				break;
			case 4: // �� ������
				System.out.println("�� ������ ��ũ");
				break;
			default:
				break;
			}
			System.out.println();
		}

	}

}