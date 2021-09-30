package abstractTest;

public class AiCar extends Car {

	public AiCar(String color) {
		super(color);

	}

	// 추상 클래스는 추상메소드를 가지고 있고 아래에서 반드시 구성
	@Override
	void drive() { //구체화
		System.out.println("자율주행");

	}

	@Override
	void stop() {
		System.out.println("자동으로 멈춤");

	}

}
