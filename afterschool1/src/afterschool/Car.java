package afterschool;

// 자동차는 타이어다	
// 자동차는 타이어를 가지고 있다.

public class Car {
//has-a 
	Tire frontLeftTire = new Tire(6, "앞 왼쪽");
	Tire frontRightTire = new Tire(4, "앞 오른쪽");
	Tire backLeftTire = new Tire(3, "뒤 왼쪽");
	Tire backRightTire = new Tire(4, "뒤 오른쪽");

// 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
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
		System.out.println("자동차가 멈춥니다.");
	}
}
