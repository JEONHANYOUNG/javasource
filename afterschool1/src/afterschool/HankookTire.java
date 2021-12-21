package afterschool;

public class HankookTire extends Tire{

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}
   
	
	//오버라이드
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println(location + " Hankook Tire 펑크 ");
			return false;
	}
	}

}
