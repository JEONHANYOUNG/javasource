package afterschool;
// ��ȣ Ÿ�̾�� Ÿ�̾��
public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}
   
	
	//�������̵�
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + " Kumho Tire ��ũ ");
			return false;
	}
	}
}
