package afterschool;

public class HankookTire extends Tire{

	public HankookTire(int maxRotation, String location) {
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
			System.out.println(location + " Hankook Tire ��ũ ");
			return false;
	}
	}

}
