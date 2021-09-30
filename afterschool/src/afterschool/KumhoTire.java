package afterschool;
// 금호 타이어는 타이어다
public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
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
			System.out.println(location + " Kumho Tire 펑크 ");
			return false;
	}
	}
}
