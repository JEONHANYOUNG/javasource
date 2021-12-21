package afterschool;

public class Tire {
// 최대 회전수(타이어 수명)
	int maxRotation;
	// 누적 회전수
	int accumulateRotation;
	// 타이어 위치
	String location;

	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println(location + " Tire 펑크 ");
			return false;
		}
	}

}
