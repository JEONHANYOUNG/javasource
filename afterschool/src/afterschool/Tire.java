package afterschool;

public class Tire {
// �ִ� ȸ����(Ÿ�̾� ����)
	int maxRotation;
	// ���� ȸ����
	int accumulateRotation;
	// Ÿ�̾� ��ġ
	String location;

	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + " Tire ��ũ ");
			return false;
		}
	}

}
